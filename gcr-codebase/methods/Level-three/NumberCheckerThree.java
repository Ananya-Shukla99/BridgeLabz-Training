// a program to evaluate a number

import java.util.Scanner;

public class NumberCheckerThree {

    // method to count digits in a number
    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // method to store digits in an array
    public static int[] getDigitsArray(int number) {

        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // method to reverse the digits array
    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];
        int j = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reverse[j] = digits[i];
            j++;
        }
        return reverse;
    }

    // method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // method to check palindrome number
    public static boolean checkPalindrome(int[] digits) {

        int[] reversedDigits = reverseArray(digits);

        if (compareArrays(digits, reversedDigits)) {
            return true;
        }
        return false;
    }

    // method to check duck number
    public static boolean checkDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Taking input of number
        System.out.println("Enter the number :");
        int number = input.nextInt();

        // declaring the array for digits
        int[] digits = getDigitsArray(number);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();

        // palindrome check
        System.out.println("Is Palindrome Number: " + checkPalindrome(digits));

        // duck number check
        System.out.println("Is Duck Number: " + checkDuckNumber(digits));

        // Close the Scanner object
        input.close();
    }
}
