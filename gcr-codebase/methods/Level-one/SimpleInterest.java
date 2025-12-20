// a program to calculate Simple Interest.

import java.util.*;

public class SimpleInterest
{
	//methid calculating the simple interest
    public double calculateSI(int principal, int rate, int time)
	{
		//Calculating the simple interest
		double SimpleInterest=(principal*rate*time)/100.0;
		
		//return the Simple Interest
		return SimpleInterest;
	
	}
	public static void main(String[]args)
	{
		// Create a Scanner object
        Scanner input = new Scanner(System.in);
	   
	    //Taking input From user
		System.out.println("Eneter the principal :");
		int principal =input.nextInt();
		System.out.println("Eneter the rate :");
		int rate =input.nextInt();
		System.out.println("Eneter the time :");
		int time =input.nextInt();
		
		//Creating a object
		SimpleInterest simpleInterest= new SimpleInterest();
		
		//Calling CalculateSI method
		double answer=simpleInterest.calculateSI(principal, rate , time);
		
		//Printing the simple Interest
        System.out.println("The Simple Interest is "+answer+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

        // Close the Scanner object
        input.close();		
	}
}