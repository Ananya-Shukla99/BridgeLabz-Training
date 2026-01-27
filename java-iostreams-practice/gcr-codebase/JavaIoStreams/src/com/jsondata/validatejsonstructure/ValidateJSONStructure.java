package com.jsondata.validatejsonstructure;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ValidateJSONStructure {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/validatejsonstructure/user.json")));

			JSONObject jsonObject = new JSONObject(jsonContent);

			System.out.println("JSON structure is valid!");

			if (jsonObject.has("name") && jsonObject.has("email")) {
				System.out.println("Required fields (name, email) are present");
			} else {
				System.out.println("Warning: Some required fields are missing");
			}
		} catch (org.json.JSONException e) {
			System.err.println("Invalid JSON structure: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error validating JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
