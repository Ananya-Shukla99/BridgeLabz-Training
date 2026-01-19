package com.sortingalgorithms.eduresults;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// District 1
		ArrayList<Student> d1Students = new ArrayList<>();
		d1Students.add(new Student("Amit", 85));
		d1Students.add(new Student("Riya", 92));
		d1Students.add(new Student("Suresh", 78));

		District d1 = new District("District A", d1Students);

		// District 2
		ArrayList<Student> d2Students = new ArrayList<>();
		d2Students.add(new Student("Neha", 88));
		d2Students.add(new Student("Karan", 92));
		d2Students.add(new Student("Pooja", 80));

		District d2 = new District("District B", d2Students);

		// Merge all district students into one list
		ArrayList<Student> stateList = new ArrayList<>();
		stateList.addAll(d1.list);
		stateList.addAll(d2.list);

		// Convert to array for Merge Sort
		Student[] students = stateList.toArray(new Student[0]);

		// before sorting
		System.out.println("Before Sorting ");
		for (Student s : students) {
			System.out.println(s.name + " - " + s.getMarks());
		}

		// Sort using Merge Sort
		MergeList.mergeSort(students, 0, students.length - 1);

		// Display final rank list
		System.out.println("State-wise Rank List (Sorted by Marks):");
		for (Student s : students) {
			System.out.println(s.name + " - " + s.getMarks());
		}
	}
}
