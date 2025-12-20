//a program to check whether a number is positive or negative.

import java.util.Scanner;

public class NumberCheck{

    // method to check number is positive or negative
    public static boolean positive(int number) {
        return number >= 0;
    }

    // method to check number is even or odd
    public static boolean even(int number) {
        return number % 2 == 0;
    }

    // method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } 
		else if (number1 == number2) {
            return 0;
        } 
		else {
            return -1;
        }
    }

    public static void main(String[] args) 
	{
	    // Creating Scanner object
        Scanner sc = new Scanner(System.in);
		
        //creating an array
        int[] numbers = new int[5];

        // Take user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (positive(num)) {
                if (even(num)) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else {
                System.out.println(num + " is Negative");
            }
        }
		

        // Compare first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("Comparison of first and last elements:");
        if (result == 1) {
            System.out.println("First element is greater than last element");
        } 
		else if (result == 0) {
            System.out.println("First and last elements are equal");
        } 
		else {
            System.out.println("First element is less than last element");
        }
        
		// Close the Scanner object
        sc.close();
    }
}
