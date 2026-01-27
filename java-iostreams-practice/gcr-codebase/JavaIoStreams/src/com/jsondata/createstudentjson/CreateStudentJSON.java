package com.jsondata.createstudentjson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class CreateStudentJSON {
	public static void main(String[] args) {
		try {
			// Create a JSON object for Student
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", "Ananya");
			jsonObject.put("age", 20);
			
			// Create subjects array
			List<String> subjects = Arrays.asList("Mathematics", "Physics", "Chemistry");
			JSONArray subjectsArray = new JSONArray(subjects);
			jsonObject.put("subjects", subjectsArray);

			// Print the JSON string
			System.out.println("Student JSON:");
			System.out.println(jsonObject.toString(2));

			// Save JSON to file
			try (FileWriter writer = new FileWriter("src/com/jsondata/createstudentjson/student.json")) {
				writer.write(jsonObject.toString(2));
			}
			System.out.println("\nJSON saved to student.json");
		} catch (Exception e) {
			System.err.println("Error creating JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
