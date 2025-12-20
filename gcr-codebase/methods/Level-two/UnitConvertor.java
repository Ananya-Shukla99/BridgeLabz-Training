// a program of Unit Convertor
import java.util.*;

public class UnitConvertor
{
    //method to convert km to miles 
    public static double convertKmToMiles(double km)
	{
	    double miles = 1.621371 *km;
        return miles;
	}
    
	//method to convert miles to km
    public static double covertMilesToKm(double miles)
	{
	    
		double result= 1.60934*miles;
		
        return result;
	}
	
	//method to convert meters to feet
    public static double convertMetersToFeet(double meters)
	{
	    double feet= 3.28084*meters;
		
        return feet;
	}
	
	//method to  convert feet to meters 
    public static double convertFeeToMeters(double feet)
	{
	    double meters= 0.3040*feet;
        return meters;
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of km distance 
		System.out.println("Enter the km :");
		double km= input.nextDouble();
		System.out.println("Enter the meter :");
		double meter= input.nextDouble();
		
		//Calling the method
		double miles=convertKmToMiles(km);
		double kmeter=covertMilesToKm(miles);
		double feet=convertMetersToFeet(meter);
		double meters=convertFeeToMeters(feet);
		

		//Printing the value
		System.out.println("The distance in miles "+miles);	
		System.out.println("The distance in km "+kmeter);
		System.out.println("The distance in feet "+feet);
		System.out.println("The distance in meter "+meters);

		// Close the Scanner object
        input.close();
	}

}
