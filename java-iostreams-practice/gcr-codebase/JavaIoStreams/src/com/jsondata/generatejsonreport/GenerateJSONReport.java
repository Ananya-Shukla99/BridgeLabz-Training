package com.jsondata.generatejsonreport;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.time.LocalDate;

public class GenerateJSONReport {
	public static void main(String[] args) {
		try {
			// Create report structure
			JSONObject report = new JSONObject();

			// database records
			JSONArray recordsArray = new JSONArray();
			for (int i = 1; i <= 5; i++) {
				JSONObject record = new JSONObject();
				record.put("id", i);
				record.put("name", "Employee " + i);
				record.put("department", "Department " + (i % 3 + 1));
				record.put("salary", 50000 + (i * 5000));
				record.put("joinDate", "2023-0" + i + "-15");
				recordsArray.put(record);
			}

			// Add report metadata
			report.put("reportTitle", "Employee Database Report");
			report.put("generatedDate", LocalDate.now().toString());
			report.put("totalRecords", recordsArray.length());
			report.put("records", recordsArray);

			// Calculate summary statistics
			JSONObject summary = new JSONObject();
			double totalSalary = 0;
			for (int i = 0; i < recordsArray.length(); i++) {
				JSONObject record = recordsArray.getJSONObject(i);
				totalSalary += record.getDouble("salary");
			}
			summary.put("totalSalary", totalSalary);
			summary.put("averageSalary", totalSalary / recordsArray.length());
			summary.put("maxSalary", 50000 + (5 * 5000));
			summary.put("minSalary", 50000 + (1 * 5000));

			report.put("summary", summary);

			// Print report
			System.out.println("Generated JSON Report:");
			System.out.println(report.toString(2));

			try (FileWriter writer = new FileWriter("src/com/jsondata/generatejsonreport/report.json")) {
				writer.write(report.toString(2));
			}
			System.out.println("\nReport saved to report.json");
		} catch (Exception e) {
			System.err.println("Error generating JSON report: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
