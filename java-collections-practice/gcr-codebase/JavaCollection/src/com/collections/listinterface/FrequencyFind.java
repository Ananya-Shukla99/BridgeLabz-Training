package com.collections.listinterface;

import java.util.*;

public class FrequencyFind {

	public static void main(String[] args) {

		// creating a list
		List<String> list = new ArrayList<>();

		// adding elements
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		list.add("apple");

		// creating a map to store key value pair
		HashMap<String, Integer> map = new HashMap<>();

		for (String s : list) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		// printing a map
		System.out.println(map);
	}

}
