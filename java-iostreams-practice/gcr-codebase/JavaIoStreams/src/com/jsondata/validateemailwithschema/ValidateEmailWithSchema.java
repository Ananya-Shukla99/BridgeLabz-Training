package com.jsondata.validateemailwithschema;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class ValidateEmailWithSchema {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/validateemailwithschema/users.json")));
			JSONArray usersArray = new JSONArray(jsonContent);

			String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
			Pattern pattern = Pattern.compile(emailPattern);

			System.out.println("Email Validation Results:");
			System.out.println();

			for (int i = 0; i < usersArray.length(); i++) {
				JSONObject user = usersArray.getJSONObject(i);
				if (user.has("email")) {
					String email = user.getString("email");
					boolean isValid = pattern.matcher(email).matches();

					System.out.println("User " + (i + 1) + ":");
					System.out.println("  Email: " + email);
					System.out.println("  Valid: " + (isValid ? "Yes" : "No"));
					if (!isValid) {
						System.out.println("  Error: Invalid email format");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			System.err.println("Error validating email: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
