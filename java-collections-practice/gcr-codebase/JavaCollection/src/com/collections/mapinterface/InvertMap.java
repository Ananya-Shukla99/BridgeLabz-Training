package com.collections.mapinterface;

import java.util.*;

public class InvertMap {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();

		char brr[] = { 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'D' };

		for (char ch : brr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("Original Map: " + map);

		HashMap<Integer, List<Character>> map2 = new HashMap<>();

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			char key = entry.getKey();
			int value = entry.getValue();

			map2.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
		}

		System.out.println("Inverted map " + map2);
	}
}
