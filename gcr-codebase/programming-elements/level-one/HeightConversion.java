//Conversion of centimeters to feet and inches
import java.util.Scanner;
public class HeightConversion
{   
	public static void main(String[]args)
	{
	    //Taking input
		Scanner s=new Scanner(System.in);
		double height=s.nextInt();
		
		//conversion
		double inches=height/2.54;
		double foot =inches/12;
		
		//Printing height
		System.out.println("Your Height in cm is : "+height+" while in feet is :"+ foot+" and inches is :" +inches);

	}
}