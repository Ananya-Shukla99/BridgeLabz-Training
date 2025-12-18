//A Program to find the greatest factors of a number taken as user input using while loop

import java.util.Scanner;

public class GreatestFactorsUsingWhileLoop
{
	public static void main(String []args)
	{    
	    // Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		int greatestFactor=0;

		
		//printing factorial using while loop the number from the user input
        int counter=1;		
		while( counter<=number){
		    if(number%i==0){
				greatestFactor=max(i,greatestFactor);
			}
			 counter++;
		}
		System.out.println(greatestFactor);
		input.close();
	}
}