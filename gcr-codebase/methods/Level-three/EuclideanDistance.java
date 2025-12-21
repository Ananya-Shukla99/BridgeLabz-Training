//a program for Euclidean distance between two points 
//as well as the equation of the line using those two points

import java.util.*;

public class EuclideanDistance{

	// method to calculate Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {

        double distance;

        distance = Math.sqrt(Math.pow((x2 - x1), 2) +Math.pow((y2 - y1), 2));

        return distance;
    }

    // method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double[] result = new double[2];

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);

        result[0] = slope;
        result[1] = intercept;

        return result;
    }
	
	public static void main(String[]args){
		
		// create a Scaner object
		Scanner input=new Scaner(System.in);
		
		// Taking inputs for 3 points
        System.out.println("Enter x1 y1:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.println("Enter x2 y2:");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // Finding distance
        double distance = findDistance(x1, y1, x2, y2);

        // Finding equation of line
        double[] line = findLineEquation(x1, y1, x2, y2);

        // Displaying results
        System.out.println("Euclidean Distance between points : " + distance);
        System.out.println("Slope (m) of the line : " + line[0]);
        System.out.println("Y-intercept (b) of the line : " + line[1]);
        System.out.println("Equation of line : y = " + line[0] + "x + " + line[1]);		
		
	   //close the Scanner object
	   input.close();
	
	}
}