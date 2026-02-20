package com.FitnessTracker;

import java.util.*;
public class Application {
	
	public static boolean validate(String activity, int duration, int intensity, double weight) throws InvalidDataException{
		
		if(!(activity.equals("Walking") || activity.equals("Running") || activity.equals("Cycling")) ){
			throw new InvalidDataException("Error:Invalid activity name.");
			
		}
		if(duration <=0) {
			throw new InvalidDataException("Error:Invalid duration or intensity.");

		}
		if(intensity<1 || intensity > 9) {
			throw new InvalidDataException("Error:Intensity is invalid.");

		}
		if(weight <= 0) {
			throw new InvalidDataException("Error:Invalid weight");

		}
		return true;
	}
	
	public static double calculation(String activity, int duration, int intensity, double weight) {
		
		double act=0;
		if(activity.equals("Running")) {act=7;}
		else if(activity.equals("Walking")) {act=3;}
		else if(activity.equals("Cycling")) {act=5;}
		
		return (act* duration * intensity * 60) / weight;
	}
	public static void main(String[]args) {
		
		
		
		System.out.println("Enter the workout routine :");
		
		Scanner sc= new Scanner (System.in);
		
		String input = sc.next();
		
	
		String []arr=input.split(":");
		
		String activity=arr[0];
		
		int duration = Integer.parseInt(arr[1]);
		int intensity= Integer.parseInt(arr[2]);
		
		System.out.println("Enter weight");
		double weight= sc.nextDouble();
		sc.close();
		
		try {
			
			if(validate(activity, duration, intensity, weight)) {
				double total= calculation(activity, duration, intensity, weight);
				System.out.println(total);

			}
			else {
				throw new InvalidDataException("Error:Invalid foramt");

			}
		}catch(InvalidDataException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
