// A program to store the digits of the number in an array and find
// the largest and second largest element of the array
import java.util.Scanner;

public class ModifiedLargestAndSecondLargestDigit {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take the number from user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // maximum digits allowed
        int maxDigit = 10;

        // array to store digits
        int[] digits = new int[maxDigit];

        // Declaring index for array
        int index = 0;

        // extracting digits and store in array
        while (number != 0) {

            // If array is full, increase size by 10
            if (index == maxDigit) {
                maxDigit += 10;

                // Create temp array with increased size
                int[] temp = new int[maxDigit];

                // Copy old data to temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign digits array to temp
                digits = temp;
            }

        // Variables to store value
        int largest = 0;
        int secondLargest = 0;

        // Finding the  largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        //closing the Scanner Object
        input.close();
    }
}