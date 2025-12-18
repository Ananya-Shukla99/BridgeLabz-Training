//A Program to find the factors of a number taken as user input using while loop

import java.util.Scanner;

public class FindTheFactorsUsingWhileLoop
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		//printing factorial using while loop the number from the user input
        int i=1;		
		while( i<=number){
		    if(number%i==0){
				System.out.println(i);
			}
			 i++;
		}
		input.close();
	}
}