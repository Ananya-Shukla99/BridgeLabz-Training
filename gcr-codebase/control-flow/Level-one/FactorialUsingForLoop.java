//A Program to find the factorial of an integer using for loop

import java.util.Scanner;
public class FactorialUsingForLoop
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		int factorial=1;
		
		//printing factorial using for loop the number from the user input 
		for(int i=number1; i>=1; i--){
		    factorial*=i;
		}
		System.out.println(factorial);
		input.close();
	}
}