//a program to find the side of the square
import java.util.*;
public class  CalculatingSide
{
	public static void main(String []args)
	{
		//Taking input details
		Scanner sc=new Scanner(System.in);
        int perimeter=sc.nextInt();
		
        //Calculating ares
        int side=perimeter/4;
		
		//Printing area
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}