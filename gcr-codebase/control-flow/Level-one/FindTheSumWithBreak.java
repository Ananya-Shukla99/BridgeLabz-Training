//a program to find the sum of numbers until the user enters 0
import java.util.Scanner;

public class FindTheSumWithBreak
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number from the user
        System.out.println("Enter number");
        int number1 = input.nextInt();
		double total=0.0;
		
		//printing sum of the number from the user input 
		while(true){
			
		    total+=number1;
			number1 = input.nextInt();
			if (number1<=0){
			    break;
			}
		}
		System.out.println(total);
		input.close();
	}
}