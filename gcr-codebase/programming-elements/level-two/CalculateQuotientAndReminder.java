//A program to calculate quotient and reminder
import java.util.Scanner;
public class CalculateQuotientAndReminder
{
	public static void main(String[]args)
	{
	    //Taking input
		Scanner s=new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		//Calculation of quotient and reminder
		double quotient= num1/num2;
		double reminder= num1%num2;
		
		//printing the quotient and reminder
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+num1+" and "+num2);
		s.close();
	}
}