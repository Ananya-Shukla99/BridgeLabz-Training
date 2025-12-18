//A Program to find the factors of a number taken as user input.

import java.util.Scanner;

public class FindTheFactors
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		//printing factorial using for loop the number from the user input 
		for(int i=1; i<=number; i++){
		    if(number%i==0){
				System.out.println(i);
			}
		}
		input.close();
	}
}