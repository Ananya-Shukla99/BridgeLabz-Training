//a program to evaluate number

import java.util.Scanner;

public class NumberCheckerFive
{
    // method to find sum of proper divisors
    public static int sumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // method to check perfect number
    public static boolean checkPerfectNumber(int number) {

        int sum = sumOfProperDivisors(number);

        if (sum == number) {
            return true;
        }
        return false;
    }

    // method to check abundant number
    public static boolean checkAbundantNumber(int number) {

        int sum = sumOfProperDivisors(number);

        if (sum > number) {
            return true;
        }
        return false;
    }

    // method to check deficient number
    public static boolean checkDeficientNumber(int number) {

        int sum = sumOfProperDivisors(number);

        if (sum < number) {
            return true;
        }
        return false;
    }

    // method to find factorial of a digit
    public static int factorial(int digit) {

        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // method to check strong number
    public static boolean checkStrongNumber(int number) {

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        if (sum == number) {
            return true;
        }
        return false;
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Is Perfect Number: " + checkPerfectNumber(number));
        System.out.println("Is Abundant Number: " + checkAbundantNumber(number));
        System.out.println("Is Deficient Number: " + checkDeficientNumber(number));
        System.out.println("Is Strong Number: " + checkStrongNumber(number));

        input.close();
    }
}
