//calculating the grade 
import java.util.Scanner;

public class GradeCalculation2D
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// Arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3];  
        double[] percentage = new double[n];
        String[] grade = new String[n];
        
		// Input marks with validation
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print(
                    (j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths") + " marks: "
                );
                marks[i][j] = input.nextInt();

                // Check for negative marks
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Re-enter student details.");
                    i--;
                    break;
                }
            }
        }
		
		// Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 80) {
                grade[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grade[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grade[i] = "Level 2, below but approaching standards";
            } else if (percentage[i] >= 50) {
                grade[i] = "Level 1, well below standards";
            } else if (percentage[i] >= 40) {
                grade[i] = "Level 1, too below standards";
            } else {
                grade[i] = "Remedial standards";
            }
        }
		
        // Display results
        System.out.println("Student Report");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println();
        }
		
		//closing the Scanner Object
		input.close();
	}
}