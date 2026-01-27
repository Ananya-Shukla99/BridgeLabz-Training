package com.jsondata.readprintkeysvalues;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSONPrintKeysValues {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/readprintkeysvalues/user.json")));
			JSONObject rootObject = new JSONObject(jsonContent);

			// Print all keys and values
			System.out.println("All Keys and Values:");
			printKeysAndValues(rootObject, "");

		} catch (Exception e) {
			System.err.println("Error reading JSON file: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// method to print all keys and values
	private static void printKeysAndValues(Object node, String prefix) {
		if (node instanceof JSONObject) {

			JSONObject jsonObject = (JSONObject) node;
			for (String key : jsonObject.keySet()) {
				Object value = jsonObject.get(key);
				if (value instanceof JSONObject || value instanceof JSONArray) {
					System.out.println(prefix + key + ": " + value.getClass().getSimpleName());
					printKeysAndValues(value, prefix + "  ");
				} else {
					System.out.println(prefix + key + ": " + value);
				}
			}
		} else if (node instanceof JSONArray) {

			JSONArray jsonArray = (JSONArray) node;
			for (int i = 0; i < jsonArray.length(); i++) {
				System.out.println(prefix + "[" + i + "]:");
				printKeysAndValues(jsonArray.get(i), prefix + "  ");
			}
		} else {

			System.out.println(prefix + node);
		}
	}
}
