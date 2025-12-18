//A Program to find the power of a number using while loop

import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop

{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number :");
        int number = input.nextInt();
		System.out.println("Enter power :");
        int power = input.nextInt();
		int result=1;
		
		//printing power using for loop the number from the user input 
		int counter=1; 
		while(counter<=power){
		    result*=number;
			counter++;
		}
		System.out.println(result);
		input.close();
	}
}