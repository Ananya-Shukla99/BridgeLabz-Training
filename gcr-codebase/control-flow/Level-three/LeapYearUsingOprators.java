 //A program to find Leap year
 
import java.util.Scanner;

public class LeapYearUsingOprators
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting year from the user
        System.out.println("Enter year(year >= 1582) :");
        int year = input.nextInt();
		
		//printing if year is leap or not 
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			System.out.println("The year "+year+" is a leap year");
		}
		else{
            System.out.println("The year "+year+" is not a leap year");		
        }
		
		input.close();
	}
}