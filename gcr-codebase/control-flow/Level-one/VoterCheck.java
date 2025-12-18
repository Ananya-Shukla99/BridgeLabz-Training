//A program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
import java.util.Scanner;

public class VoterCheck
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting age from the user
        System.out.println("Enter age");
        int age = input.nextInt();
		
		
		//  If the person is 18 or older, print the person can vote. Otherwise, print the person cannot vote.
        if (age>=18) 
		{
            System.out.println("The person's age is "+age+" and can vote");
        }
		else 
		{
			System.out.println("The person's age is "+age+" and cannot vote");
		}
		input.close();
	}
}
