package com.csvdata;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

	public static void main(String[] args) {

		String file1 = "src/com/csvdata/students1.csv";
		String file2 = "src/com/csvdata/students2.csv";
		String outputFile = "students_merged.csv";

		Map<String, String[]> studentInfo = new HashMap<>();

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
				BufferedReader br2 = new BufferedReader(new FileReader(file2));
				FileWriter writer = new FileWriter(outputFile)) {

			br1.readLine();
			String line;

			while ((line = br1.readLine()) != null) {
				String[] data = line.split(",");
				studentInfo.put(data[0], new String[] { data[1], data[2] });
			}

			writer.append("ID,Name,Age,Marks,Grade\n");

			br2.readLine();

			while ((line = br2.readLine()) != null) {
				String[] data = line.split(",");
				String id = data[0];

				if (studentInfo.containsKey(id)) {
					String[] info = studentInfo.get(id);

					writer.append(id).append(",").append(info[0]).append(",").append(info[1]).append(",")
							.append(data[1]).append(",").append(data[2]).append("\n");
				}
			}

			System.out.println("CSV files merged successfully!");

		} catch (IOException e) {
			System.out.println("Error merging CSV files.");
			e.printStackTrace();
		}
	}
}
