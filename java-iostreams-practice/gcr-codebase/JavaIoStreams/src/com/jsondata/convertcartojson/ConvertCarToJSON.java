package com.jsondata.convertcartojson;

import java.io.FileWriter;

import org.json.JSONObject;

public class ConvertCarToJSON {
	public static void main(String[] args) {
		try {
			// Create a Car object data
			String brand = "Toyota";
			String model = "Camry";
			int year = 2023;

			// Convert Car object to JSON using JSONObject
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("brand", brand);
			jsonObject.put("model", model);
			jsonObject.put("year", year);

			System.out.println("Car JSON:");
			System.out.println(jsonObject.toString(2));

			try (FileWriter writer = new FileWriter("src/com/jsondata/convertcartojson/car.json")) {
				writer.write(jsonObject.toString(2));
			}
			System.out.println("\nJSON saved to car.json");
		} catch (Exception e) {
			System.err.println("Error converting Car to JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
