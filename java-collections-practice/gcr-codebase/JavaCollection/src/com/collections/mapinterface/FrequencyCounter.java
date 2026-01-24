package com.collections.mapinterface;

import java.util.*;

public class FrequencyCounter {

	public static void main(String[] args) {

		// creating map
		HashMap<String, Integer> map = new HashMap<>();

		String arr = "Hello world, hello Java !";

		// removing spaces and special character
		arr = arr.toLowerCase().replaceAll("[^a-z0-9 ]", "");

		// converting string to array
		String[] words = arr.split("\\s+");

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		System.out.println(map);
	}

}
