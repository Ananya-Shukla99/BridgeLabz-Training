package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchCSV {
	public static void main(String[] args) {

		String csvFile = "src/com/csvdata/employees.csv";
		Scanner scanner = new Scanner(System.in);
		boolean found = false;

		System.out.print("Enter employee name to search: ");
		String searchName = scanner.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			String line;

			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				String name = data[1];

				if (name.equalsIgnoreCase(searchName)) {
					System.out.println("Employee Found!");
					System.out.println("Department : " + data[2]);
					System.out.println("Salary     : " + data[3]);
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println("Employee not found.");
			}

		} catch (IOException e) {
			System.out.println("Error reading the CSV file.");
			e.printStackTrace();
		}

		scanner.close();
	}
}
