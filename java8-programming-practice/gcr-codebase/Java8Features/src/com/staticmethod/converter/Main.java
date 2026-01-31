package com.staticmethod.converter;

public class Main {

	public static void main(String[]args) {
		
		// method to convert kg to lbs
		System.out.println(ConvertUtils.convertKgToLbs(25));//in kg
		System.out.println(ConvertUtils.convertKgToLbs(70));//in kg
		
		// method to convert km to miles
		System.out.println(ConvertUtils.convertKmToMiles(55));
		System.out.println(ConvertUtils.convertKmToMiles(33));
	}
}
