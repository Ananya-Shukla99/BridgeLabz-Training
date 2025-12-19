//A program  to find the bonus of employees based on their 
// years of service using array

import java.util.Scanner;

public class BonusCalculator
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		//Declaring the array
		double []salary=new double[10];
		int [] yearOfService =new int[10];
		double [] newSalary=new double[10];
		double [] bonus=new double[10];
		
		// getting salary and years of service from the user
        System.out.println("Enter salary's :");
		for(int i=0;i<salary.length;i++)
		{
		    salary[i]=input.nextDouble();
		}
		System.out.println("Enter years of service :");
		for(int i=0;i<yearOfService.length;i++)
		{
		    yearOfService[i]=input.nextInt();
		}	
		
		//  If the person's year of service is more than 5 years then 5% bouns or 2% if less
		for(int i=0; i<salary.length; i++){
		    
			if (yearOfService[i]>5) 
		    {   
				bonus[i]=salary[i]*(0.05);
				newSalary[i]=salary[i]+bonus[i];
				
			}
			else 
			{
				bonus[i]=salary[i]*(0.02);
				newSalary[i]=salary[i]+bonus[i];
			}
		
		}
		
		//Declaring variables
		double totalBonus=0.0;
		double totalOldSalary=0.0;
		double totalNewSalary=0.0;
		
		//calculating the total bonus payout as well as 
		//the total old and new salary of all the employees
        for(int i=0; i<salary.length; i++){
			totalOldSalary+=salary[i];
		}
		for(int i=0; i<newSalary.length; i++){
			totalNewSalary+=newSalary[i];
		}
		for(int i=0; i<bonus.length; i++){
			totalBonus+=bonus[i];
		}
		
		//Printng the values
		System.out.println("The total old salary is "+totalOldSalary);
		System.out.println("The total new salary is "+totalNewSalary);
		System.out.println("The total bonus salary is "+totalBonus);
		input.close();
	}
}
