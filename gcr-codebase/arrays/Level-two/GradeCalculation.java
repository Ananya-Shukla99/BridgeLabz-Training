//calculating the grade 
import java.util.Scanner;

public class GradeCalculation
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// Arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3];  
        double[] percentage = new double[n];
        String[] grade = new String[n];
        
		// Physics
            System.out.print("Enter Physics marks: ");
            marks[i][0] = input.nextInt();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // Chemistry
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = input.nextInt();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // Maths
            System.out.print("Enter Maths marks: ");
            marks[i][2] = input.nextInt();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
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