// a program to find the BMI and display the height, weight, BMI, and status of each individual
import java.util.*;

public class BmiCalculator{
	
    // method to calculate BMI and Status
    public static String[][] calculateBMIStatus(double[][] data)
	{
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100; // convert cm to meter
            double bmi = weight / (heightM * heightM);

            // round to 2 decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;

            String status;
			
            if (bmi < 18.5){
				
				status = "Underweight";
			}
            else if (bmi < 25){
				
                status = "Normal";
			}
            else if (bmi < 30){
				
                status = "Overweight";
			}
            else{
                status = "Obese";
            }
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // method to prepare BMI report
    public static String[][] prepareBMIReport(double[][] hwData) {
        return calculateBMIStatus(hwData);
    }

    // method to display BMI report
    public static void displayBMIReport(String[][] report) {
		
        System.out.println("BMI Report");
        System.out.println();
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println();

        for (int i = 0; i < report.length; i++) {
			
            System.out.println((i + 1) + "\t" +report[i][0] + "\t\t" + report[i][1] + "\t\t" +report[i][2] + "\t" + report[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int persons = 10;
        double[][] heightWeight = new double[persons][2];

        // User input
        for (int i = 0; i < persons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = prepareBMIReport(heightWeight);
        displayBMIReport(bmiReport);

        sc.close();
		
    }
}
