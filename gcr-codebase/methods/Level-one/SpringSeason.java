// a program to check Spring Season

import java.util.*;

public class SpringSeason
{

	public boolean checkSpringSeason(int month, int day){
		
		if (month == 3) {
            return day >= 20;
        } else if (month == 6) {
            return day <= 20;
        } else if (month == 4 || month == 5) {
            return true;
        } else {
            return false;
        }
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of month and day
		System.out.println("Enter the month :");
		int month = input.nextInt();
		System.out.println("Enter the day :");
		int day = input.nextInt();
		
		//Calling the method
		boolean answer=checkSpringSeasonSpringSeason(month, day);
     
		//Printing the if its spring Season or not
		if(answer){
			System.out.println("Its a SpringSeason ");
		}
		else{
			System.out.println("Its not a Spring Season ");
		}
		
		// Close the Scanner object
        input.close();
	}

}
