package com.jsondata.mergejsonobjects;

import org.json.JSONObject;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeJSONObjects {
	public static void main(String[] args) {
		try {
			// Read first file
			String json1Content = new String(Files.readAllBytes(Paths.get("src/com/jsondata/mergejsonobjects/data1.json")));
			JSONObject json1 = new JSONObject(json1Content);

			// Read second file
			String json2Content = new String(Files.readAllBytes(Paths.get("src/com/jsondata/mergejsonobjects/data2.json")));
			JSONObject json2 = new JSONObject(json2Content);

			// JSONObject to hold merged result
			JSONObject mergedJson = new JSONObject();

			
			for (String key : json1.keySet()) {
				mergedJson.put(key, json1.get(key));
			}

			for (String key : json2.keySet()) {
				mergedJson.put(key, json2.get(key));
			}

			// Print merged JSON
			System.out.println("Merged JSON:");
			System.out.println(mergedJson.toString(2));

			// Write merged JSON to a new file
			try (FileWriter writer = new FileWriter("src/com/jsondata/mergejsonobjects/merged.json")) {
				writer.write(mergedJson.toString(2));
			}
			System.out.println("\nMerged JSON saved to merged.json");
		} catch (Exception e) {
			System.err.println("Error merging JSON objects: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
