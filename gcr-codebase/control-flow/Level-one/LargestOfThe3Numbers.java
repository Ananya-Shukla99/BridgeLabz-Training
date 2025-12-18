//A program to check if the first, second, or third number is the largest of the three..
import java.util.Scanner;

public class LargestOfThe3Numbers
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting numbers from the user
        System.out.println("Enter number1");
        int number1 = input.nextInt();
		System.out.println("Enter number2");
        int number2 = input.nextInt();
		System.out.println("Enter number3");
        int number3 = input.nextInt();
		
		//  if the first, second, or third number is the largest of the three, yes or no
        if (number1 >number2 && number1>number3) {
            System.out.println("Is the first number the largest? Yes");
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? No");
        }
        else if (number2 >number1 && number2>number3) {
            System.out.println("Is the first number the largest? No");
			System.out.println("Is the second number the largest? Yes");
			System.out.println("Is the third number the largest? No");
        }
		else {
			System.out.println("Is the first number the largest? No");
			System.out.println("Is the second number the largest? No");
			System.out.println("Is the third number the largest? Yes");
		}
		input.close();
	}
}