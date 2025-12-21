// a program to check the number

import java.util.*;
public class NumberCheckerTwo {

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

    // method to find sum of digits
    public static int sumOfDigits(int[] digits) {
	
        int sum = 0;
		
        for (int i = 0; i < digits.length; i++) {
		
            sum = sum + digits[i];
        }
        return sum;
    }

    // method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
	
        int sum = 0;
		
        for (int i = 0; i < digits.length; i++) {
            sum = sum + (int) Math.pow(digits[i], 2);
        }
		
        return sum;
    }

    // method to check Harshad number
    public static boolean checkHarshadNumber(int number, int[] digits) {
	
        int sum = sumOfDigits(digits);
		
        if (number % sum == 0) {
            return true;
        }
        return false;
    }

    // method to find frequency of each digit
	
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;   // digit
            freq[i][1] = 0;   // frequency
        }

        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the number :");
		int number = input.nextInt();

        //declaring the array for digits
        int[] digits = getDigitsArray(number);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i] + " ");
        }

		//printing the digits, squares of digits , haeshad number
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + checkHarshadNumber(number, digits));
        
		//declaring the array for frequency
        int[][] frequency = digitFrequency(digits);

        //printing the frequency of digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] +" occurs " + frequency[i][1] + " time(s)");
            }
        }
		
		// Close the Scanner object
        input.close();
		
    }
}
