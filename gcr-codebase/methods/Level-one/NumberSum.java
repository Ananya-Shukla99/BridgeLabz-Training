// a program to find the sum of numbers

import java.util.*;

public class NumberSum
{
    //method the calculate the sum
	public int calculateTheSum(int number){
		
		int sum=0;
		for(int i=0;i<=number;i++){
			sum+=i;
		}
		
		//return the sum
		return sum;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of number
		System.out.println("Enter the number:");
		int number= input.nextInt();
		
		//Creating the object
        NumberSum obj= new NumberSum();
		
		//Calling the method
		int sum=obj.calculateTheSum(number);
     
		//Printing the sum
		System.out.println("The sum is"+sum);
		
		// Close the Scanner object
        input.close();
	}

}
