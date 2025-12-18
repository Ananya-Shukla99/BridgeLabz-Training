//A program to  find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages 
// and the tallest among the friends based on their heights
import java.util.Scanner;

public class FindTheYoungestAndTallest
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting input for the age and height from the user
        System.out.println("Enter Amar's age");
        int amarAge= input.nextInt();
		System.out.println("Enter Akbar's age");
        int akbarAge = input.nextInt();
		System.out.println("Enter Anthony's age");
        int anthonyAge = input.nextInt();
		System.out.println("Enter Amar's height");
        int amarheight= input.nextInt();
		System.out.println("Enter Akbar's height");
        int akbarheight = input.nextInt();
		System.out.println("Enter Anthony's height");
        int anthonyheight = input.nextInt();
		
		//  if the youngest friends among 3
        if (amarAge <akbarAge && amarAge<anthonyAge) {
            System.out.println("The youngest friend is Amar");
        }
        else if (akbarAge<amarAge  && akbarAge<anthonyAge) {
            System.out.println("The youngest friend is  Akbar");
        }
		else {
			 System.out.println("The youngest friend is  Anthony");
		}
		// if the tallest friends among 3
		if (amarheight >akbarheight && amarheight>anthonyheight) {
            System.out.println("The tallest friend is Amar");
        }
        else if (akbarheight>amarheight  && akbarheight>anthonyheight) {
            System.out.println("The tallest friend is  Akbar");
        }
		else {
			 System.out.println("The tallest friend is  Anthony");
		}
		input.close();
	}
}