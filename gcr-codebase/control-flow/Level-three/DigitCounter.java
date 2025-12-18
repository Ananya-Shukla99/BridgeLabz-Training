//a program to count the number of digits in an integer
import java.util.Scanner;

public class DigitCounter
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		//sum variable, initialize it to zero and originalNumber to initial variable
		int digitCounter =0;
		int originalNumber=number;
		
		
		//to find the count
		while(number!=0){
			digitCounter++;
			number/=10;
		}
		
		//printing digit count
		System.out.println("The number of digits in "+ originalNumber+" is "+digitCounter);
		
		input.close();
	}
}