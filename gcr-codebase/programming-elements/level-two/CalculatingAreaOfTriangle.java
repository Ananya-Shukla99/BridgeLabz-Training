//Calculating area of triangle
import java.util.*;
public class  CalculatingAreaOfTriangle
{
	public static void main(String []args)
	{
		//Taking input details
		Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
		double height=sc.nextDouble();
		
        //Calculating ares
        double area=0.5 *base*height;
		double inches=area/2.54;
		double feet =area/12;
		
		//Printing area
        System.out.println("Your Area in cm is "+area+" while in feet is "+feet+" and inches is "+inches);
		sc.close();
    }
}