//A program to find the multiplication table 
import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting number for multiplication table from the user
        System.out.println("Enter number : ");
        int number = input.nextInt();
		
		
		//  printing multiplication table of a number entered by the user
        for(int i=6; i<=9; i++)
		{	
			System.out.println(number+" * "+i+" = "+ (number*i));
		}
		input.close();
	}
}