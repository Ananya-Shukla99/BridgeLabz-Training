//calculating the grade 
import java.util.Scanner;

public class DigitFrequency
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// Take input for a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int temp = number;

        // Step 1: Count number of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Creating array to store digits
        int[] digits = new int[count];
		
		//Store digits in array
		temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        // Frequency array 
        int[] frequency = new int[10];

        //Find frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

		//Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
		
		//closing the Scanner Object
		input.close();
	}
}