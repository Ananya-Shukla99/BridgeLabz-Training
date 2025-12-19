//A program to print a multiplication table of a number.

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		//Taking input variable
		int number=input.nextInt();
		
		System.out.println();
		
		// Declare the Array
		int [] arr =new int[10];

        //Calculating the table
		for(int i=1;i<=10;i++)
		{
		    arr[i]=number*i;
		}
        
		//printing table
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Multiplication table of "+number+" * "+(i+1)+arr[i]);
		}
		
		// Close the Scanner Object
        input.close();
	}
}
