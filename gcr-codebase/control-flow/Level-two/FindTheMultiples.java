//A Program to find the multiples of a number taken as user input.

import java.util.Scanner;

public class FindTheMultiples
{
	public static void main(String []args)
	{
		
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		// Checking the number is a positive integer and less than 100
		if(number>0 && number<100){
			for(int i=100; i>=1; i--){
		        if(number%i==0){
				    System.out.println(i);
			    }
		    }
		}
		
		input.close();
	}
}