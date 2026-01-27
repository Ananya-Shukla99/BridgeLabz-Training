package com.jsondata.parsefilterjson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParseAndFilterJSON {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/parsefilterjson/users.json")));
			JSONArray usersArray = new JSONArray(jsonContent);
			JSONArray filteredArray = new JSONArray();

			for (int i = 0; i < usersArray.length(); i++) {
				JSONObject user = usersArray.getJSONObject(i);
				if (user.has("age") && user.getInt("age") > 25) {
					filteredArray.put(user);
				}
			}

			// Print filtered results
			System.out.println("Users with age > 25:");
			System.out.println(filteredArray.toString(2));

			// Print count
			System.out.println("\nTotal filtered records: " + filteredArray.length());

			try (FileWriter writer = new FileWriter("src/com/jsondata/parsefilterjson/filtered_users.json")) {
				writer.write(filteredArray.toString(2));
			}
			System.out.println("Filtered results saved to filtered_users.json");
		} catch (Exception e) {
			System.err.println("Error parsing and filtering JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
