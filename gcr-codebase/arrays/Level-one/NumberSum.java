//A program to print a numbers as well as the sum of all numbers 

import java.util.Scanner;

public class NumberSum
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		// Declare the Array and variable
		double [] arr =new double[10];
		double sum=0.0;
		int index=0;

        // Input the elements of the Array
        System.out.println("Enter the number : ");
		while(true)
		{   
		    double number=input.nextDouble();
			if(number<=0){
			    break;
			}
			if(index==10){
			    break;
			}
			arr[index]=number;
			index++;
		}
		//Calculating sum
        for(int i=0;i<10;i++)
		{
		    System.out.println(arr[i]);
		    sum+=arr[i];
		}
        
		//Printing the sum
		System.out.println(sum);
		
		// Close the Scanner Object
        input.close();
	}
}
