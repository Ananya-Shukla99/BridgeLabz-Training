//A program to  find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages 
// and the tallest among the friends based on their heights
import java.util.Scanner;

public class FindTheYoungestAndTallest
{
	public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		//Declaring the array
		int [] age =new int[3];
		int [] heights =new int[3];
		
		// Names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

		
		//declaring youngest and tallest
		int youngest=0;
		int tallest=0;
		
		// getting input for the age and height from the user
        for(int i=0;i<age.length; i++){
			System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = input.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            height[i] = input.nextInt();
		}
		
		// Finding youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
		
		// Display results
        System.out.println("\nYoungest Friend: " + friends[youngest] + " (Age: " + age[youngest] + ")");
        System.out.println("Tallest Friend: " + friends[tallest] + " (Height: " + heights[tallest] + ")");

		// Close the Scanner Object
		input.close();
	}
}