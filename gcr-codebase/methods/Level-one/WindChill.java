// a program calculate the wind chill temperature given the temperature and wind speed

import java.util.*;

public class WindChill
{
    //method to calculateWindChill
    public double calculateWindChill(double temperature, double windSpeed)
	{
		//find th value of WindChill
		double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
	
		//return windChill
		return windChill
	}
	
	public static void main(String[]args){
		
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Taking input of numbers
		System.out.println("Enter the temperature :");
		int temperature = input.nextInt();
		
		System.out.println("Enter the windSpeed:");
		int windSpeed = input.nextInt();
		
		
		//Calling the method
		double windChill=calculateWindChill(temperature ,windSpeed);

     
		//Printing the value
		System.out.println("The windChill "+ windChill);
		
		// Close the Scanner object
        input.close();
	}

}

