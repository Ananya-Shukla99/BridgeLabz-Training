package com.jsondata.convertlisttojsonarrayhandson;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ConvertListToJSONArrayHandsOn {
	public static void main(String[] args) {
		try {
			// Create a list of Car objects data
			List<JSONObject> cars = new ArrayList<>();
			
			JSONObject car1 = new JSONObject();
			car1.put("brand", "Toyota");
			car1.put("model", "Camry");
			car1.put("year", 2023);
			cars.add(car1);

			JSONObject car2 = new JSONObject();
			car2.put("brand", "Honda");
			car2.put("model", "Accord");
			car2.put("year", 2022);
			cars.add(car2);

			JSONObject car3 = new JSONObject();
			car3.put("brand", "Ford");
			car3.put("model", "Mustang");
			car3.put("year", 2024);
			cars.add(car3);

			// Convert list to JSON array
			JSONArray jsonArray = new JSONArray(cars);

			// Print JSON array
			System.out.println("Car List as JSON Array:");
			System.out.println(jsonArray.toString(2));

			// Write to local file
			try (FileWriter writer = new FileWriter("src/com/jsondata/convertlisttojsonarrayhandson/cars.json")) {
				writer.write(jsonArray.toString(2));
			}
			System.out.println("\nJSON array saved to cars.json");
		} catch (Exception e) {
			System.err.println("Error converting list to JSON array: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
