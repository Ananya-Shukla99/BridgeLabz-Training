//a program to count Student Vote Checker
import java.util.Scanner;

public class StudentVoteChecker {

    // method to check whether a student can vote
    public boolean canStudentVote(int age) {
	
        // validate negative age
        if (age < 0) {
            return false;
        }
        // check voting eligibility
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
	
		// Creating Scanner object
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Loop to take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {
		
            System.out.print("Enter age of student : " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
		// Close the Scanner object
        sc.close();
    }
}
