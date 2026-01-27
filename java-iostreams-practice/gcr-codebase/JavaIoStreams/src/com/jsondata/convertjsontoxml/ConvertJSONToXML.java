package com.jsondata.convertjsontoxml;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertJSONToXML {
	public static void main(String[] args) {
		try {
			// Read JSON file
			String jsonContent = new String(
					Files.readAllBytes(Paths.get("src/com/jsondata/convertjsontoxml/user.json")));
			JSONObject rootObject = new JSONObject(jsonContent);

			// Convert JSON to XML string
			String xmlString = convertToXML(rootObject, "root");

			// Print XML
			System.out.println("JSON converted to XML:");
			System.out.println(xmlString);

			// XML to local file
			try (FileWriter writer = new FileWriter("src/com/jsondata/convertjsontoxml/output.xml")) {
				writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
				writer.write(xmlString);
			}
			System.out.println("\nXML saved to output.xml");
		} catch (Exception e) {
			System.err.println("Error converting JSON to XML: " + e.getMessage());
			e.printStackTrace();
		}
	}

	// method to convert JSONObject/JSONArray to XML string
	private static String convertToXML(Object node, String rootName) {
		StringBuilder xml = new StringBuilder();
		xml.append("<").append(rootName).append(">");

		if (node instanceof JSONObject) {
			
			JSONObject jsonObject = (JSONObject) node;
			for (String key : jsonObject.keySet()) {
				Object value = jsonObject.get(key);
				xml.append(convertToXML(value, key));
			}
		} else if (node instanceof JSONArray) {
			
			JSONArray jsonArray = (JSONArray) node;
			for (int i = 0; i < jsonArray.length(); i++) {
				xml.append(convertToXML(jsonArray.get(i), "item"));
			}
		} else {
			xml.append(escapeXML(String.valueOf(node)));
		}

		xml.append("</").append(rootName).append(">");
		return xml.toString();
	}

	// Escape special XML characters
	private static String escapeXML(String text) {
		return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'",
				"&apos;");
	}
}
