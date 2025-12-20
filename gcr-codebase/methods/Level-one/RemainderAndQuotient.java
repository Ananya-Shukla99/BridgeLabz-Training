//a program to take 2 numbers and print their quotient and reminder

import java.util.*;

public class RemainderAndQuotient
{
    //method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor)    {
	    //creating a array
		int [] arr=new int [2];
		
		//find th value
		int quotient =number/divisor;
		int remainder=number%divisor;
		
		//storing the value
		int arr[0]=quotient;
		int arr[1]=remainder;
		
		//return array
		return arr;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the quotient :");
		int quotient = input.nextInt();
		
		System.out.println("Enter the remainder:");
		int remainder = input.nextInt();
		
		
		//Calling the method
		int [] arr=findRemainderAndQuotient(quotient,remainder);

     
		//Printing the value
		System.out.println("The quotient"+arr[0]);
		System.out.println("The remainder"+arr[1]);
		
		// Close the Scanner object
        input.close();
	}

}
