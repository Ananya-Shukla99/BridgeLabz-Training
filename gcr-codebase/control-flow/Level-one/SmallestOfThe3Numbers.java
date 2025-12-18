//A program to check if the first is the smallest of the 3 numbers.
import java.util.Scanner;

public class SmallestOfThe3Numbers
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting numbers from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		System.out.println("Enter number2");
        int number2 = input.nextInt();
		System.out.println("Enter number3");
        int number3 = input.nextInt();
		
		//  if the first is the smallest of the 3 numbers print yes
        if (number1 <number2 && number1<number3) {
            System.out.println("Is the first number the smallest? Yes");
        }
        else{
		    System.out.println("Is the first number the smallest? No"); 
		}
		input.close();
	}
}