//A Program to find the power of a number.

import java.util.Scanner;

public class PowerOfNumber

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
		for(int i=1; i<=power;i++){
		    result*=number;
		}
		System.out.println(result);
		input.close();
	}
}