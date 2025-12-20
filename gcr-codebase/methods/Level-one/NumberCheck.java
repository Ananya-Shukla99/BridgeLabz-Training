// a program to check whether a number is positive, negative, or zero.

import java.util.*;

public class NumberCheck{

	public String FindtheValue(int number){
		
		//check the value
		if(number<0){
			return "Negative";
		}
		else if(number==0){
			return "Zero";
		}
		else{
			return "Positive";
		}
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of number 
		System.out.println("Enter th number  :");
		int number = input.nextInt();
		
		//Creating the object
        NumberCheck obj= new NumberCheck();
		
		//Calling the method
		String answer=obj.FindtheValue(number);
     
		//Printing the total handshakes
		System.out.println("The number is "+ answer);
	    
		// Close the Scanner object
        input.close();
	}

}
