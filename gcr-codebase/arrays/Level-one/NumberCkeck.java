//A program to check whether a number is positive,  negative, or zero, and even or odd

import java.util.Scanner;

public class NumberCkeck
{
	public static void main(String[]args)
	{
		// Create a Scanner Object
        Scanner input= new Scanner(System.in);
		
		// Declare the Array
		int [] arr =new int[5];

        // Input the elements of the Array
        System.out.println("Enter the number : ");
		for(int i=0;i<arr.length;i++)
		{
		    arr[i]=input.nextInt();
		}
        
		//finding the number is positive, negative, or zero
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0){
				System.out.println("Negative");
			}
			else if(arr[i]==0){
				System.out.println("Zero");
			}
			else {
			    System.out.println("Positive");
				if(arr[i]%2==0){
				    System.out.println("Even number");
				}
				else{
				    System.out.println("Odd number");
				}
			}
		}
		
		// Close the Scanner Object
        input.close();
	}
}
