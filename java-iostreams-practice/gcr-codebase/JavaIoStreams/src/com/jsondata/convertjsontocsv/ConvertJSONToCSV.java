package com.jsondata.convertjsontocsv;

import org.json.JSONArray;
import org.json.JSONObject;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertJSONToCSV {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/convertjsontocsv/students.json")));
			JSONArray jsonArray = new JSONArray(jsonContent);

			if (jsonArray.length() > 0) {
				// Get headers from first object
				JSONObject firstObject = jsonArray.getJSONObject(0);
				StringBuilder csv = new StringBuilder();

				// Write headers
				List<String> headers = new java.util.ArrayList<>();
				for (String key : firstObject.keySet()) {
					headers.add(key);
				}
				csv.append(String.join(",", headers)).append("\n");

				// Write data rows
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject node = jsonArray.getJSONObject(i);
					List<String> values = new java.util.ArrayList<>();
					for (String header : headers) {
						if (node.has(header)) {
							values.add(String.valueOf(node.get(header)));
						} else {
							values.add("");
						}
					}
					csv.append(String.join(",", values)).append("\n");
				}

				// Write CSV to local file
				try (FileWriter writer = new FileWriter("src/com/jsondata/convertjsontocsv/output.csv")) {
					writer.write(csv.toString());
				}

				System.out.println("JSON converted to CSV:");
				System.out.println(csv.toString());
				System.out.println("\nCSV saved to output.csv");
			} else {
				System.err.println("JSON file does not contain an array or is empty");
			}
		} catch (IOException e) {
			System.err.println("Error converting JSON to CSV: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
