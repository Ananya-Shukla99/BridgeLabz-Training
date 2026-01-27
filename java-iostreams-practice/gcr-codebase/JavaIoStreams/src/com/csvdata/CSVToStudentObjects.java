package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


class Student {
	private int id;
	private String name;
	private int age;
	private int marks;

	public Student(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student{" + "ID=" + id + ", Name='" + name + '\'' + ", Age=" + age + ", Marks=" + marks + '}';
	}
}

public class CSVToStudentObjects {
	public static void main(String[] args) {

		String csvFile = "src/com/csvdata/students.csv";
		List<Student> students = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			String line;

			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				Student student = new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));

				students.add(student);
			}

		} catch (IOException e) {
			System.out.println("Error reading the CSV file.");
			e.printStackTrace();
		}

		System.out.println("Student List:");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
