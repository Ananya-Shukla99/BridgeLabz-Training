//A program to check whether a number is positive, negative, or zero
import java.util.Scanner;

public class NumberChecking
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		
		
		//  If the number is positive, print positive,If the number is negative, print negative, If the number is zero, print zero. 

        if (number1 >0) 
		{
            System.out.println("Positive");
        }
		else if(number1<0)
		{
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
		input.close();
	}
}