//A program to find the multiplication table 
import java.util.Scanner;

public class MultiplicationTable
{
	public static void main(String []args){
		// getting number for multiplication table from the user
		Scanner input=new Scanner(System.in);
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