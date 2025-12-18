//A program to check for the natural number and writing the sum of n natural numbers 
import java.util.Scanner;

public class NaturalNumberCheck
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		
		
		//  if the number is a positive integer then the output is sum, else non natural numbers
        if (number1 >0) 
		{
		    int sum=(number1* (number1+1) )/ 2 ;
            System.out.println("The sum of "+number1+" natural numbers is "+sum);
        }
		else 
		{
			System.out.println("The number"+number1+"is not a natural number");
		}
		input.close();
	}
}