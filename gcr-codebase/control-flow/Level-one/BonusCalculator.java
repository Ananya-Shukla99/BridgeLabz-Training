//A program  to find the bonus of employees based on their years of service.
import java.util.Scanner;

public class BonusCalculator
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting salary and years of service from the user
        System.out.println("Enter salary :");
        int salary = input.nextInt();
		System.out.println("Enter years of service :");
        int yearsOfService = input.nextInt();
	
		
		//  If the person's year of service is more than 5 years then 5% bouns
        if (yearsOfService>5) 
		{   
		    double bonus=salary*(0.05);
            System.out.println("The person's bonus is "+bonus);
        }
		else 
		{
			System.out.println("No Bonus");
		}
		input.close();
	}
}
