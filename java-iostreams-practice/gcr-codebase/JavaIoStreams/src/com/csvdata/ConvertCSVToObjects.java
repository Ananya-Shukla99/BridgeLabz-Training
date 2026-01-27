package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Students {
	private int id;
	private String name;
	private int age;
	private double marks;

	public Students(int id, String name, int age, double marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name='" + name + "', age=" + age + ", marks=" + marks + "}";
	}
}

public class ConvertCSVToObjects {
	public static void main(String[] args) {
		String csvFile = "src/com/csvdata/students.csv";
		List<Students> students = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			String line;
			boolean isFirstLine = true;

			while ((line = br.readLine()) != null) {
				if (isFirstLine) {
					isFirstLine = false;
					continue;
				}

				String[] data = line.split(",");
				if (data.length == 4) {
					int id = Integer.parseInt(data[0].trim());
					String name = data[1].trim();
					int age = Integer.parseInt(data[2].trim());
					double marks = Double.parseDouble(data[3].trim());

					Students student = new Students(id, name, age, marks);
					students.add(student);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.err.println("Error parsing data: " + e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("Student Objects ");
		System.out.println("Total students: " + students.size());
		System.out.println("");
		for (Students student : students) {
			System.out.println(student);
		}
		System.out.println("");
	}
}