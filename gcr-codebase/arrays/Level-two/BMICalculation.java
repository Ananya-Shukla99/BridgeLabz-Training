//calculating BMI
import java.util.Scanner;

public class BMICalculation
{
public static void main(String []args)
	{
		// Create a Scanner Object
		Scanner input=new Scanner(System.in);
		
		// Take input for number of persons
        System.out.println("Enter number of persons: ");
        int number = input.nextInt();
		
		// Declaring arrays to store details
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
		
		// Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight : ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height : ");
            height[i] = input.nextDouble();
        }
		
		// BMI calculation and provoding status
		for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
		
		//printing report
		System.out.println("\nBMI Report");
		
		for (int i = 0; i < n; i++) {
			System.out.println("Person " + (i + 1));
			System.out.println("Height : " + height[i]);
			System.out.println("Weight : " + weight[i]);
			System.out.println("BMI    : " + bmi[i]);
			System.out.println("Status : " + status[i]);
			System.out.println();
        }
		
		//closing the Scanner Object
		input.close();
	}
}