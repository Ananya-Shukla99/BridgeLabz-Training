package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSV {
	public static void main(String[] args) {

		String inputFile = "src/com/csvdata/employees.csv";
		String outputFile = "src/com/csvdata/employees_updated.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				FileWriter writer = new FileWriter(outputFile)) {

			String line;

			line = br.readLine();
			writer.append(line).append("\n");

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				String department = data[2];
				double salary = Double.parseDouble(data[3]);

				if (department.equalsIgnoreCase("IT")) {
					salary = salary * 1.10;
				}

				writer.append(data[0]).append(",").append(data[1]).append(",").append(data[2]).append(",")
						.append(String.valueOf((int) salary)).append("\n");
			}

			System.out.println("Salaries updated successfully!");

		} catch (IOException e) {
			System.out.println("Error processing the CSV file.");
			e.printStackTrace();
		}
	}
}
