//A program to count down the number using for loop

import java.util.Scanner;

public class CountDownUingForLoop
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		
		
		//printing count down the number from the user input 
		for(int i=number1; i>=1; i--){
			System.out.println(number1);
		}
		input.close();
	}
}