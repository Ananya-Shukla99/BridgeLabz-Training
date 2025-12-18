//A program to calculate sum of n natural numbers using for loop
import java.util.Scanner;

public class NaturalNumberSumUsingForLoop
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		int number2=number1;
		
		//  if the number is a positive integer then the output is sum, else non natural numbers
        if (number1 >0) 
		{
		    int sum=(number1* (number1+1) )/ 2 ;
			int sum2=0;
			for(int i=number1; i>=0;i--){
				sum2+=number1;
			}
            System.out.println("The sum of "+number2+" natural numbers using formula is "+sum);
			System.out.println("The sum of "+number2+" natural numbers using for loop "+sum2);
        }
		else 
		{
			System.out.println("The number"+number1+"is not a natural number");
		}
		input.close();
	}
}