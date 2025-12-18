//a program to check if a number taken from the user is a Harshad Number.
import java.util.Scanner;

public class HarshadNumber
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
		int originalNumber=number;
		
		//to find the digit sum
		while(number!=0){
			int digit =number%10;
			sum+= digit;
			number/=10;
		}
		
		//Calculating if a number is Armstrong Number
		if(originalNumber%sum==0){
			System.out.println("The number "+ originalNumber+" is a Harshad Number");
		}
		else{
			System.out.println("The number "+originalNumber+" is not a Harshad Number");
		}
		input.close();
	}
}