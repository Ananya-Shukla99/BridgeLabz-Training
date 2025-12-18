//a program to check if a number is an Abundant Number.

import java.util.Scanner;

public class AbundantNumber
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		//sum variable,initialize it to zero 
		int sum =0;
		
		//Calculating divisior
		for(int i=1; i<=number/2; i++){
		    if(number%i==0){
				sum+=i;
			}
		}
		
		//Calculating if a number is Abundant Number
		if(sum>number){
			System.out.println("The number "+ number+" is a Abundant Number");
		}
		else{
			System.out.println("The number "+number+" is not a Abundant  Number");
		}
		input.close();
	}
}