package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
	public static void main(String[] args) {

		String csvFile = "src/com/csvdata/employees.csv";
		int recordCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			br.readLine();

			while (br.readLine() != null) {
				recordCount++;
			}

			System.out.println("Number of records (excluding header): " + recordCount);

		} catch (IOException e) {
			System.out.println("Error reading the CSV file.");
			e.printStackTrace();
		}
	}
}
