package com.functionalInterface.temperaturealert;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		// List of temperature
		List<Integer> temprature = List.of(2, 3, 5, 7, 8, 8, 5, 4);

		// threshold temperature
		int threshold = 4;

		// implementation of abstract method
		CheckTemperature check = (temp) -> temp > threshold;

		// Printing threshold pass/fail
		System.out.println("Checking the temperature :");
		for (Integer i : temprature) {
			if (check.threshold(i)) {
				System.out.println("ALERT! Temperature too high: " + i);
			} else {
				System.out.println("Temperature normal : " + i);
			}
		}

	}

}
