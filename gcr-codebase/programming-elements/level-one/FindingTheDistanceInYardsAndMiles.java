// a program the find the distance in yards and miles
import java.util.*;
public class FindingTheDistanceInYardsAndMiles
{
	public static void main(String []args)
	{
		//Taking input details
		Scanner sc=new Scanner(System.in);
		System.out.println("Input foot :");
        double feets=sc.nextDouble();
		
        //Calculating conversion
		double yards=feets/3;
		double miles=yards/1760;
        
		
		//Printing area
        System.out.println(" Your Distance in feet "+feets+" while in yards is "+yards+" and miles is "+miles);
    }
}