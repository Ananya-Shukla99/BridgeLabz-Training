package com.tourBooking;

import java.util.*;

public class Main {

	public static void validate(String pack, int days, String season) throws InvalidException {

		if (!(pack.equals("P123") || pack.equals("P223") || pack.equals("P345"))){
			throw new InvalidException("Invalid pack");
		}
				
		if (days < 0) {
			throw new InvalidException("Invalid days");
		}
		
		if(!(season.equals("season")
				|| season.equals("peakseason") || season.equals("offseason")))  {
		
			throw new InvalidException("Invalid season");
		}
	}
	
	public static double countCost(String pack,int days, String season) {
		
		double base=0;
		double seasonal=0;
		double additional=0;
		if (pack.equals("P123") ) {base+=5000;}
		else if(pack.equals("P223") ) {base+=10000;}
		else if(pack.equals("P345") ){
			base+=12000;
		}
		if(days >= 7) {
			additional=base*0.1;
		} 
		
		if (season.equals("season")){seasonal=base*0.15;}
		else if(season.equals("peakseason")) { seasonal=base*0.25;}
		else if(season.equals("offseason")) {seasonal = base*0.1;}
	    
		return (base-additional)+seasonal;
	}

	public static void main(String[] args) {

		System.out.println("Welcoe!!");
		System.out.println("enter booking details in the format:\r\n" + "customerName:packageName:numberOfDays:season");

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		
		String[] arr = input.split(":");

		String name = arr[0];
		String pack = arr[1];
		int days = Integer.parseInt(arr[2]);
		String season = arr[3];
		try{ 
			validate(pack, days, season);
			double cost=countCost(pack,  days, season );
			System.out.println(name+" total cost is "+cost);
		}
		catch(InvalidException e) {
			System.out.println(e.getMessage());
			
		}
		
		sc.close();
		
		
	}
}
