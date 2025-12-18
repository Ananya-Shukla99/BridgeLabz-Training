//a program to check if a number is armstrong or not
import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		//sum variable, initialize it to zero and originalNumber to initial variable
		int sum =0;
		int originalNumber =number;
		
		//to find the digit sum
		while(number!=0){
			int digit =number%10;
			sum+= (int)Math.pow(digit, 3);
			number/=10;
		}
		
		//Calculating if a number is Armstrong Number
		if(sum==originalNumber){
			System.out.println("The number "+ originalNumber+" is a Armstrong Number");
		}
		else{
			System.out.println("The number "+originalNumber+" is not a Armstrong Number");
		}
		input.close();
	}
}