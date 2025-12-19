//A program to find the mean height of players present in a football team

import java.util.Scanner;

public class MeanHeight
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		// Declare the Array and sum
		double [] arr =new double[11];
		double sum=0.0;

        // Input the elements of the Array
        System.out.println("Enter the height of players : ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=input.nextDouble();
		}
		
		//Calculating sum
        for(int i=0;i<10;i++)
		{
		    sum+=arr[i];
		}
        
		//calculating mean
		double mean=sum/arr.length;
		
		//printing mean
		System.out.println("the mean height of the football team "+ mean);
		
		// Close the Scanner Object
        input.close();
	}
}
