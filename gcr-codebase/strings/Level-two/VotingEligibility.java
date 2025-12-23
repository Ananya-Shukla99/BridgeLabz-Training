// a program to take user input for the age of all 10 students in a class and 
// check whether the student can vote depending on his/her age is greater or equal to 18
import java.util.Scanner;

import java.util.Random;

public class VotingEligibility {

    // method to generate random 2-digit 
	
    public static int[] generateAges(int n) 
	{
        int[] ages = new int[n];
		
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            
            ages[i] = random.nextInt(90) + 10;
			
        }
        return ages;
    }

    // method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages)
	{
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) 
		{
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
				
                result[i][1] = "false";
				
            } 
			else if (ages[i] >= 18) {
				
                result[i][1] = "true";
				
            }
			else {
				
                result[i][1] = "false";
            }
        }
        return result;
    }

    // method to display the 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display results
        displayResult(votingStatus);

        sc.close();
    }
}
