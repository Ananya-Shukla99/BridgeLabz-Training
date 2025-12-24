//a program to calculate maximum of three

import java.util.*;

public class maximumOfThree{

	public static int maximumNumber(int first, int second, int third){
	
		if(first>second && first>third){
			return first;
		}
		else if(second>first && second>third){
			return second;
		}
		else{
			return third;
		}
	} 
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int first=sc.nextInt();
		System.out.println("Enter second number :");
		int second=sc.nextInt();
		System.out.println("Enter third number ");
		int third=sc.nextInt();
		
		//function call
	    int results = maximumNumber(first, second , third);
	
	    //Display the results
		System.out.println("The maximum number is :"+ results);
		
		//closing Scanner
		sc.close();
		
	}
}
