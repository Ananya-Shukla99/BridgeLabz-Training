// A program to take a number as input and reverse the number
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take the number from user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// counting digits 
		int count=0;
        while (number != 0) {
            count++;
            number = number / 10;
        }

        // array to store digits
        int[] digits = new int[count];

        // Declaring index for array
        int index = 0;

        // extracting digits and store in array
        while (number != 0 && index < count) {
            digits[index] = number % 10; 
            number = number / 10;         
            index++;
        }
		
        // printing in reverse order
        for (int i = index; i >=0; i--) {
            System.out.println(digits[i]+" ");

        }
		
        //closing the Scanner Object
        input.close();
    }
}