// a program of Unit Convertor
import java.util.*;

public class UnitConvertorTwo
{
    //method to convert yards to feet 
    public static double yardsToFeet(double yards)
	{
	    double yards2feet = 3*yards;
        return yards2feet;
	}
    
	//method to convert feet to yards
    public static double feetToYards(double feet)
	{
	    
		double feet2yards = 0.333333*feet;
		
        return feet2yards;
	}
	
	//method to convert meters to inches
    public static double metersToInches (double meters)
	{
	    double meters2inches = 39.3701*meters;
		
        return meters2inches;
	}
	
	//method to convert inches to meters
    public static double inchesToMeters(double inches)
	{
	    double inches2meters = 0.0254;

        return inches2meters;
	}
	
	//method to convert inches to centimeterss
    public static double inchesToCm(double inches)
	{
	    double inches2cm = 2.54* inches;

        return inches2cm;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of distance 
		System.out.println("Enter the yards :");
		double yards= input.nextDouble();
		System.out.println("Enter the feet :");
		double feet= input.nextDouble();
		System.out.println("Enter the meters  :");
		double meters = input.nextDouble();
		System.out.println("Enter the inches  :");
		double inches = input.nextDouble();
		System.out.println("Enter the inches to meter :");
		double inches2 = input.nextDouble();
		
		//Calling the method
		double yards2feet=yardsToFeet(yards);
		double feet2yards=feetToYards(feet);
		double meter2inches=metersToInches(meters);
		double inches2meter=inchesToMeters(inches);
		double inches2centimeter=inchesToCm(inches2);

		//Printing the value
		
		System.out.println("The distance in yards2feet "+yards2feet);	
		System.out.println("The distance in feet2yards " + feet2yards);
		System.out.println("The distance in meters2inches "+meter2inches);
		System.out.println("The distance in inches2meters "+inches2meter);
		System.out.println("The distance in  centimeter "+inches2centimeter);

		// Close the Scanner object
        input.close();
	}

}
