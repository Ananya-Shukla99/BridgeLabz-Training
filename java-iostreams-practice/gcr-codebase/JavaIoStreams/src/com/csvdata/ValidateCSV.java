package com.csvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {

	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String PHONE_REGEX = "^[0-9]{10}$";

	public static void main(String[] args) {

		String csvFile = "src/com/csvdata/users.csv";

		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			String line;
			int rowNumber = 1;

			br.readLine();

			while ((line = br.readLine()) != null) {
				rowNumber++;
				String[] data = line.split(",");

				String email = data[2];
				String phone = data[3];

				boolean emailValid = emailPattern.matcher(email).matches();
				boolean phoneValid = phonePattern.matcher(phone).matches();

				if (!emailValid || !phoneValid) {
					System.out.println("Invalid data at row " + rowNumber + ":");

					if (!emailValid) {
						System.out.println("Invalid Email: " + email);
					}
					if (!phoneValid) {
						System.out.println("Invalid Phone Number: " + phone);
					}

					System.out.println("");
				}
			}

		} catch (IOException e) {
			System.out.println("Error reading the CSV file.");
			e.printStackTrace();
		}
	}
}
