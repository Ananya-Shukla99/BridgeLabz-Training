//A program to count down the number

import java.util.Scanner;

public class CountDown
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		
		
		//printing count down the number from the user input 
		while(number1>=1){
			System.out.println(number1);
			number1--;
		}
		input.close();
	}
}