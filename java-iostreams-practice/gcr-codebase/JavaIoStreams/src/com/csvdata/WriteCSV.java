package com.csvdata;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
	public static void main(String[] args) {

		String csvFile = "src/com/csvdata/employees.csv";

		try (FileWriter writer = new FileWriter(csvFile)) {

			writer.append("ID,Name,Department,Salary\n");

			writer.append("1,Rahul,IT,60000\n");
			writer.append("2,Priya,HR,55000\n");
			writer.append("3,Amit,Finance,65000\n");
			writer.append("4,Neha,Marketing,58000\n");
			writer.append("5,Suresh,Sales,62000\n");
			
			System.out.println("CSV file created and data written successfully!");

		} catch (IOException e) {
			System.out.println("Error writing to the CSV file.");
			e.printStackTrace();
		}
	}
}
