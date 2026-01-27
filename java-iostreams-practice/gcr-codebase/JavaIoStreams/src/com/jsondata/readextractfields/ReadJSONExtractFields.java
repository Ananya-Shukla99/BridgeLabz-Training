package com.jsondata.readextractfields;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSONExtractFields {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(Files.readAllBytes(Paths.get("src/com/jsondata/readextractfields/user.json")));
			JSONObject jsonObject = new JSONObject(jsonContent);

			// Extract only specific fields
			String name = jsonObject.has("name") ? jsonObject.getString("name") : null;
			String email = jsonObject.has("email") ? jsonObject.getString("email") : null;

			// Print extracted fields
			System.out.println("Extracted Fields:");
			System.out.println("Name: " + name);
			System.out.println("Email: " + email);

			if (jsonObject.has("user")) {
				JSONObject userNode = jsonObject.getJSONObject("user");
				System.out.println("\nFrom nested object:");
				System.out.println("Name: " + userNode.getString("name"));
				System.out.println("Email: " + userNode.getString("email"));
			}
		} catch (Exception e) {
			System.err.println("Error reading JSON file: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
