//A Program to find the greatest factors of a number taken as user input.

import java.util.Scanner;

public class FindTheGreatestFactors
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		int greatestFactor=0;
		
		//printing factorial using for loop the number from the user input 
		for(int i=1; i<=number; i++){
		    if(number%i==0){
				greatestFactor=max(i,greatestFactor);
			}
		}
		System.out.println(greatestFactor);
		input.close();
	}
}