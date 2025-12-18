//A program to check if a number is divisible by 5
import java.util.Scanner;

public class DivisibilityBy5
{
	public static void main(String []args)
	{
		// getting number from the user
		Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
		
		// if number is divisible by 5 or not
        if (number%5==0) {
            System.out.println(" Is the number "+number+" divisible by 5? Yes");
        }
        else{
		    System.out.println(" Is the number "+number+" divisible by 5? No");
		}
		input.close();
		
	}
}
