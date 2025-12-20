// A year to find the year is leap or not

import java.util.*;

public class LeapYearCheck{

	//method to check the leap year
	public static boolean checkLeapYear(int year){
	
		if(year<1582){
			return false;
		}
		else if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
	
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of year
		System.out.println("Enter the year :");
		int year = input.nextInt();
		
		//Calling the method
		boolean flag=checkLeapYear(year);

		//Comparing the values
		if(flag){
			System.out.println("Its a Leap year");
		}
		else{
			System.out.println("Its not a Leap year");
		}
		
		// Close the Scanner object
        input.close();

	
	}

}