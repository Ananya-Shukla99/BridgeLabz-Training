// a program to find the factors of a number and perform various tasks using 
//the factors array

import java.util.Scanner;

public class FactorChecker {

    // method to find factors of a number 
    public static int[] findFactors(int number) {

        int count = 0;

        // first loop to count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // create array to store factors
        int[] factors = new int[count];
        int index = 0;

        // second loop to store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // method to find greatest factor
    public static int greatestFactor(int[] factors) {

        int greatest = factors[0];

        for (int i = 0; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }

    // method to find sum of factors
    public static int sumOfFactors(int[] factors) {

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }
        return sum;
    }

    // method to find product of factors
    public static long productOfFactors(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * factors[i];
        }
        return product;
    }

    // method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {

        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product = product * Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) 
	{
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        //taking the input values
        System.out.println("Enter the number:");
        int number = input.nextInt();

        // finding factors
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        //printing the values
        System.out.println();
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));

        //close the scanner object
        input.close();
    }
}
