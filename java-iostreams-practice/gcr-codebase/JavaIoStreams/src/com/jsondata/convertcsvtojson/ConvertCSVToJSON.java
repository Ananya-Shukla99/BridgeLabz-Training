package com.jsondata.convertcsvtojson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertCSVToJSON {
	public static void main(String[] args) {
		try {
			JSONArray jsonArray = new JSONArray();

			// Read CSV file
			String csvFile = "src/com/jsondata/convertcsvtojson/students.csv";
			BufferedReader br = new BufferedReader(new FileReader(csvFile));

			String line;
			String[] headers = null;
			boolean isFirstLine = true;

			while ((line = br.readLine()) != null) {
				if (isFirstLine) {

					headers = line.split(",");
					for (int i = 0; i < headers.length; i++) {
						headers[i] = headers[i].trim();
					}
					isFirstLine = false;
					continue;
				}

				// Split line
				String[] values = line.split(",");
				if (values.length == headers.length) {

					JSONObject jsonObject = new JSONObject();

					// Map CSV columns to JSON object fields
					for (int i = 0; i < headers.length; i++) {
						String value = values[i].trim();
						try {
							if (value.contains(".")) {
								jsonObject.put(headers[i], Double.parseDouble(value));
							} else {
								jsonObject.put(headers[i], Integer.parseInt(value));
							}
						} catch (NumberFormatException e) {
							jsonObject.put(headers[i], value);
						}
					}

					jsonArray.put(jsonObject);
				}
			}
			br.close();
			System.out.println("CSV converted to JSON:");
			System.out.println(jsonArray.toString(2));

			// Write JSON to local file
			try (FileWriter writer = new FileWriter("src/com/jsondata/convertcsvtojson/students.json")) {
				writer.write(jsonArray.toString(2));
			}
			System.out.println("\nJSON saved to students.json");
		} catch (IOException e) {
			System.err.println("Error converting CSV to JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
