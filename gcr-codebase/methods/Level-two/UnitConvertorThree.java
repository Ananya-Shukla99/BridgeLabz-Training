// a program of Unit Convertor

import java.util.*;

public class UnitConvertorThree
{
    // method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
	
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
		
        return fahrenheit2celsius;
    }

    // method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
	
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
		
        return celsius2fahrenheit;
    }

    // method to convert Pounds to Kilograms
    public static double poundsToKilograms(double pounds) {
	
        double pounds2kilograms = pounds * 0.453592;
		
        return pounds2kilograms;
    }

    // method to convert Kilograms to Pounds
    public static double kilogramsToPounds(double kilograms) {
	
        double kilograms2pounds = kilograms * 2.20462;
		
        return kilograms2pounds;
    }

    // method to convert Gallons to Liters
    public static double gallonsToLiters(double gallons) {
	
        double gallons2liters = gallons * 3.78541;
		
        return gallons2liters;
    }

    // method to convert Liters to Gallons
    public static double litersToGallons(double liters) {
	
        double liters2gallons = liters * 0.264172;
		
        return liters2gallons;
    }
	public static void main(String[]args)
	{
		
	// Creating Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input
    System.out.println("Enter temperature in Fahrenheit:");
    double fahrenheit = input.nextDouble();

    System.out.println("Enter temperature in Celsius:");
    double celsius = input.nextDouble();

    System.out.println("Enter weight in pounds:");
    double pounds = input.nextDouble();

    System.out.println("Enter weight in kilograms:");
    double kilograms = input.nextDouble();

    System.out.println("Enter volume in gallons:");
    double gallons = input.nextDouble();

    System.out.println("Enter volume in liters:");
    double liters = input.nextDouble();

    // Calling the methods from UnitConvertor class
    double celsiusResult = convertFahrenheitToCelsius(fahrenheit);
    double fahrenheitResult = convertCelsiusToFahrenheit(celsius);
    double kilogramsResult = poundsToKilograms(pounds);
    double poundsResult = kilogramsToPounds(kilograms);
    double litersResult = gallonsToLiters(gallons);
    double gallonsResult =litersToGallons(liters);

    // Printing the values
    System.out.println("Fahrenheit to Celsius: " + celsiusResult);
    System.out.println("Celsius to Fahrenheit: " + fahrenheitResult);
    System.out.println("Pounds to Kilograms: " + kilogramsResult);
    System.out.println("Kilograms to Pounds: " + poundsResult);
    System.out.println("Gallons to Liters: " + litersResult);
    System.out.println("Liters to Gallons: " + gallonsResult);
	
	// Close the Scanner object
    input.close();

	}
}
