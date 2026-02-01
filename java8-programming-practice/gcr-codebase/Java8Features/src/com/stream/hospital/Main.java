package com.stream.hospital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Doctor> doctors = new ArrayList<>();

		doctors.add(new Doctor("Dr. Sharma", Arrays.asList("Monday", "Friday"), "Cardiologist"));

		doctors.add(new Doctor("Dr. Mehta", Arrays.asList("Saturday", "Sunday"), "Dermatologist"));

		doctors.add(new Doctor("Dr. Khan", Arrays.asList("Tuesday", "Saturday"), "Orthopedic"));

		doctors.add(new Doctor("Dr. Rao", Arrays.asList("Wednesday", "Friday"), "Neurologist"));

		System.out.println("List of Doctor");
		doctors.stream().forEach(System.out::println);

		Stream<Doctor> str = doctors.stream()
				.filter(d -> (d.availability.contains("Sunday")) || (d.availability.contains("Saturday")))
				.sorted(Comparator.comparing(d -> d.speciality));

		System.out.println("****************************************");
		System.out.println("Doctors available on weekends and sort by specialty ");
		str.forEach(System.out::println);

	}
}
