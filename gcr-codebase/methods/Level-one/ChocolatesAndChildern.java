//a program to take 2 numbers and print their quotient and reminder

import java.util.*;

public class ChocolatesAndChildern
{
    //method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int numberOfchocolates , int numberOfChildren )
	{
	    //creating a array
		int [] arr=new int [2];
		
		//find th value
		int quotient =numberOfchocolates /numberOfChildren;
		int remainder=numberOfchocolates %numberOfChildren;
		
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
		System.out.println("Enter the numberOfchocolates  :");
		int numberOfchocolates  = input.nextInt();
		
		System.out.println("Enter the numberOfChildren:");
		int numberOfChildren = input.nextInt();
		
		
		//Calling the method
		int [] arr=findRemainderAndQuotient(numberOfchocolates ,numberOfChildren);

     
		//Printing the value
		System.out.println("The numberOfchocolates "+arr[0]);
		System.out.println("The numberOfChildren "+arr[1]);
		
		// Close the Scanner object
        input.close();
	}

}

