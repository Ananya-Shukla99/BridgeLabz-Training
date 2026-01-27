package com.jsondata.convertlisttojsonarray;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToJSONArray {
	public static void main(String[] args) {
		try {
			// Create a list of Student data
			List<JSONObject> students = new ArrayList<>();
			
			JSONObject student1 = new JSONObject();
			student1.put("name", "Alice");
			student1.put("age", 20);
			student1.put("subjects", new JSONArray(Arrays.asList("Math", "Science")));
			students.add(student1);

			JSONObject student2 = new JSONObject();
			student2.put("name", "Bob");
			student2.put("age", 22);
			student2.put("subjects", new JSONArray(Arrays.asList("History", "English")));
			students.add(student2);

			JSONObject student3 = new JSONObject();
			student3.put("name", "Charlie");
			student3.put("age", 21);
			student3.put("subjects", new JSONArray(Arrays.asList("Physics", "Chemistry")));
			students.add(student3);

			// list to JSON array
			JSONArray jsonArray = new JSONArray(students);

			// Print JSON array
			System.out.println("Student List as JSON Array:");
			System.out.println(jsonArray.toString(2));

			// Save JSON array to file
			try (FileWriter writer = new FileWriter("src/com/jsondata/convertlisttojsonarray/students.json")) {
				writer.write(jsonArray.toString(2));
			}
			System.out.println("\nJSON array saved to students.json");
		} catch (Exception e) {
			System.err.println("Error converting list to JSON array: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
