//A Program to find the factorial of an integer 

import java.util.Scanner;
public class Factorial 
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		int factorial=1;
		
		//printing factorial the number from the user input 
		while(number1>=1){
		    factorial*=number1;
			number1--;
		}
		System.out.println(factorial);
		input.close();
	}
}