package com.sortingalgorithms.examcell;

public class Main {
	public static void main(String[] args) {

		Student[] students = { new Student(101, "Ravi", 85), new Student(102, "Anita", 92),
				new Student(103, "John", 78), new Student(104, "Meera", 95), new Student(105, "Amit", 88) };

		ExamCell.mergeSort(students, 0, students.length - 1);

		System.out.println("State Level Rank List:");
		for (Student s : students)
			System.out.println(s);
	}
}
