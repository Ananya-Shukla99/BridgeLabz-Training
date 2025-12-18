//A Program to find the multiples of a number taken as user input.

import java.util.Scanner;

public class MultiplesUsingWhileLoop
{
	public static void main(String []args)
	{
		
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		// Checking the number is a positive integer and less than 100, printing multiples
		if(number>0 && number<100){
		    int counter=number-1;
			while(counter>1){
		        if(number%i==0){
				    System.out.println(i);
			    }
				counter--;
		    }
		}
		
		input.close();
	}
}