// a program to check number
import java.util.*;

public class NumberChecker {

    // method to find count of digits 
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // method to store digits of the number in an array
    public static int[] getDigitsArray(int number) {
	    
		//calling the the countdigit method 
        int count = countDigits(number);
		
		// declaring an array
        int[] digits = new int[count];

		//storing the values
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // method to check if number is a Duck Number
	
    public static boolean checkDuckNumber(int[] digits) {
	
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // method to check if number is an Armstrong number
	
    public static boolean checkArmstrongNumber(int number, int[] digits) {
	
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
		
        return sum == number;
    }

    // method to find largest and second largest digits
	
    public static int[] findLargestAndSecondLargest(int[] digits) {
	
        int largest = Integer.MIN_VALUE;
		
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // method to find smallest and second smallest digits
	
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
	
        int smallest = Integer.MAX_VALUE;
		
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {

        //Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the number :");
		int number = input.nextInt();

        // get digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
		
        for (int d : digits) {
            System.out.print(d + " ");
        }
		System.out.println();

        // Duck number check
        System.out.println("Is Duck Number: " + checkDuckNumber(digits));

        // Armstrong number check
        System.out.println("Is Armstrong Number: " + checkArmstrongNumber(number, digits));

        // Largest and second largest
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second Largest digit: " + largest[1]);

        // Smallest and second smallest
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second Smallest digit: " + smallest[1]);
		
		// Close the Scanner object
        input.close();
    }
}
