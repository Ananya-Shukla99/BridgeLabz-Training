//A program to print a multiplication table of a number.

import java.util.Scanner;

public class Table
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		//Taking input variable
		System.out.println("Enter the number : ");
		int number=input.nextInt();
		
		System.out.println();
		
		// Declare the Array
		int [] arr =new int[10];

        //Calculating the table
		for(int i=0;i<10;i++)
		{
		    arr[i]=number*(i+1);
		}
        
		//printing table
		for(int i=5;i<9;i++)
		{
			System.out.println("Multiplication table of "+number+" * "+(i+1)+"="+arr[i]);
		}
		
		// Close the Scanner Object
        input.close();
	}
}
