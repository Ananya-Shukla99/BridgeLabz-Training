package com.collectors.result;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Create a list of students with new names
		List<Student> students = new ArrayList<>();

		students.add(new Student("Rahul", 'A'));
		students.add(new Student("Priya", 'B'));
		students.add(new Student("Amit", 'C'));
		students.add(new Student("Sneha", 'A'));
		students.add(new Student("Vikram", 'B'));
		students.add(new Student("Nisha", 'A'));
		students.add(new Student("Karan", 'C'));

		Map<Character, String> map = students.stream().collect(
				Collectors.groupingBy(s -> s.grade, Collectors.mapping(s -> s.name, Collectors.joining(", "))));

		map.forEach((grade, names) -> System.out.println("Grade " + grade + ": " + names));
	}
}
