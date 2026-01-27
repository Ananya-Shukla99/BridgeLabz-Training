package com.jsondata.filterusersbyage;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilterUsersByAge {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/filterusersbyage/users.json")));
			JSONArray usersArray = new JSONArray(jsonContent);

			System.out.println("Users older than 25 years:");
			System.out.println();

			// Filter and print users with age > 25
			int count = 0;
			for (int i = 0; i < usersArray.length(); i++) {
				JSONObject user = usersArray.getJSONObject(i);
				if (user.has("age") && user.getInt("age") > 25) {
					count++;
					System.out.println("User " + count + ":");
					System.out.println("Name: " + user.getString("name"));
					System.out.println("Email: " + user.getString("email"));
					System.out.println("Age: " + user.getInt("age"));
					System.out.println();
				}
			}

			System.out.println("Total users older than 25: " + count);
		} catch (Exception e) {
			System.err.println("Error filtering users: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
