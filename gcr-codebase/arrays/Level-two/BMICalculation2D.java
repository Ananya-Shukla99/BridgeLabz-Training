//calculating BMI
import java.util.Scanner;

public class BMICalculation2D
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// Take input for number of persons
        System.out.println("Enter number of persons: ");
        int number = input.nextInt();
		
		// Declaring 2D arrays to store details
        double[][] personData = new double[number][3];
		
		// Array to store weight status
        String[] weightStatus = new String[number];

		
		// Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            // Height input with validation
            do {
                System.out.print("Enter height : ");
                personData[i][0] = input.nextDouble();
            } while (personData[i][0] <= 0);

            // Weight input with validation
            do {
                System.out.print("Enter weight: ");
                personData[i][1] = input.nextDouble();
            } while (personData[i][1] <= 0);
        }
		
		// BMI calculation and provoding status
		for (int i = 0; i < n; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            // BMI calculation
            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
		
		//printing report
		System.out.println("\nBMI Report");
		
		for (int i = 0; i < n; i++) {
			System.out.println("Person " + (i + 1));
			System.out.println("Height : " + personData[i][0]);
			System.out.println("Weight : " + personData[i][1]);
			System.out.println("BMI    : " + personData[i][2]);
			System.out.println("Status : " + weightStatus[i]);
			System.out.println();
        }
		
		//closing the Scanner Object
		input.close();
	}
}