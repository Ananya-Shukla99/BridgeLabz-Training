//calculating the grade 
import java.util.Scanner;

public class GradeCalculation
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// getting input for the age and height from the user
        System.out.println("Enter Physics marks");
        int physics= input.nextInt();
		System.out.println("Enter Chemistry marks");
        int chemistry = input.nextInt();
		System.out.println("Enter Maths marks");
        int maths = input.nextInt();
		
		//  Average calculation and giving remarks
		double Average=((physics+chemistry+maths)/300.0)*100;
        if (Average>=80) {
            System.out.println("Level 4, above agency-normalized standards");
        }
        else if (Average>=70 && Average<=79) {
            System.out.println("Level 3, at agency-normalized standards");
        }
		else if(Average>=60 && Average<=69){
			 System.out.println("Level 2, below, but approaching agency-normalized standards");
		}
        else if (Average>=50 && Average<=59) {
            System.out.println("Level 1, well below agency-normalized standards");
        }
	    else if (Average>=40 && Average<=49) {
            System.out.println("Level 1, too below agency-normalized standards");
        }
		else {
            System.out.println("Remedial standards");
		}
		input.close();
	}
}