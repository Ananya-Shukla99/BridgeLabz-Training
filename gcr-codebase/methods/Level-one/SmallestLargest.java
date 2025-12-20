// a program to find the smallest and the largest of the 3 numbers.

import java.util.*;

public class SmallestLargest
{
    //to find smallest and largest
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
    {
	    //creating a array
		int [] arr=new int [2];
		
		
		if(number1<number2 && number1<number3){
		    arr[0]=number1;
		}
		else if(number2<number1 && number2<number3){
		    arr[0]=number2;
		}
		else{
			arr[0]=number3;
		}
		if(number1>number2 && number1>number3){
		    arr[1]=number1;
		}
		else if(number2>number1 && number2>number3){
		    arr[1]=number2;
		}
		else{
			arr[1]=number3;
		}
		
		//return array
		return arr;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the number1 :");
		int number1 = input.nextInt();
		
		System.out.println("Enter the number2 :");
		int number2 = input.nextInt();
		
		System.out.println("Enter the number2 :");
		int number2 = input.nextInt();
		
		//Calling the method
		int [] arr=findSmallestAndLargest(number1,number2, number3);

     
		//Printing the value
		System.out.println("The smallest number "+arr[0]);
		System.out.println("The largest number "+arr[1]);
		
		// Close the Scanner object
        input.close();
	}

}
