//a program to calculate BMI Calculation

import java.util.Scanner;

public class BMICalculation {

    // method to calculate BMI and populate 3rd column of the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeter = heightInCm / 100;

            data[i][2] = weight / (heightInMeter * heightInMeter);
        }
    }

    // method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
	    // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // 10 persons, 3 columns (weight, height, BMI)
        double[][] persons = new double[10][3];

        // Taking input
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm): ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Display BMI Report
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + persons[i][0] + " kg");
            System.out.println("Height : " + persons[i][1] + " cm");
            System.out.printf("BMI    : %.2f%n", persons[i][2]);
            System.out.println("Status : " + getBMIStatus(persons[i][2]));
            System.out.println();
        }

		//closing input object
        input.close();
    }
}
