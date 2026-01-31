package com.staticmethod.converter;

public interface ConvertUtils {

	//static method of interface
	public static double convertKmToMiles(int value) {
		return value * 0.62;
	}
	
	public static double convertKgToLbs(int value) {
		return value * 2.20462;
	}
}
