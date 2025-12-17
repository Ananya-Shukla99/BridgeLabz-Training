//Conersion of kilometers to miles
import java.util.*;
public class VariableConersionOfKilometersToMiles
{
	public static void main(String []args)
	{
		//Taking input details
		Scanner sc=new Scanner(System.in);
        int kilometers=sc.nextInt();
		
        //Calculating miles
        double miles= kilometers/1.6;
		
		//Printing miles
        System.out.println(miles);
    }
}