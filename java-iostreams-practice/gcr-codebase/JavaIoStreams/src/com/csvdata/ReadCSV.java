package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	public static void main(String[] args) {

		String line;
		String csvFile = "src/com/csvdata/students.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			br.readLine();

			while ((line = br.readLine()) != null) {
				
				String[] data = line.split(",");

				String id = data[0];
				String name = data[1];
				String age = data[2];
				String marks = data[3];

				System.out.println("Student Record");
				System.out.println("  ID    : " + id);
				System.out.println("  Name  : " + name);
				System.out.println("  Age   : " + age);
				System.out.println("  Marks : " + marks);
				System.out.println("-------------------------");
			}

		} catch (IOException e) {
			System.out.println("Error reading the CSV file.");
			e.printStackTrace();
		}
	}
}
