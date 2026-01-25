package com.javastreams;

import java.io.*;
import java.util.*;

public class CountWordInFile {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		String fileName = "input.txt";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				line = line.toLowerCase();
				String words[] = line.split(" ");

				for (int i = 0; i < words.length; i++) {
					String word = words[i].replaceAll("[^a-z]", "");

					if (word.length() > 0) {
						if (map.containsKey(word)) {
							map.put(word, map.get(word) + 1);
						} else {
							map.put(word, 1);
						}
					}
				}
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("File not found");
			return;
		}

		// Convert map to list 
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		// Sorting
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue() - a.getValue();
			}
		});

		System.out.println("Top 5 frequent words:");

		for (int i = 0; i < 5 && i < list.size(); i++) {
			System.out.println(list.get(i).getKey() + " -> " + list.get(i).getValue());
		}
	}
}
