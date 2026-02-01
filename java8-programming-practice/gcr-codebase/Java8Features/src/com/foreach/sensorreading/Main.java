package com.foreach.sensorreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Double> reading = Arrays.asList(76.7, 44.6, 66.7, 33.4, 88.9, 99.0);

		double threshold = 50.0;

		List<Double> answer = reading.stream().filter(c -> c > threshold).collect(Collectors.toList());

		System.out.println("List of readings above threshold ");
		answer.stream().forEach(c -> System.out.println(c));
	}
}
