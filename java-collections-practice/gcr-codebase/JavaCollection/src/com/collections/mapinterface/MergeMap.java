package com.collections.mapinterface;

import java.util.HashMap;

public class MergeMap {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('A', 10);
		map.put('B', 20);
		map.put('C', 30);
		map.put('D', 40);

		HashMap<Character, Integer> map2 = new HashMap<>();

		map2.put('A', 2);
		map2.put('B', 5);
		map2.put('E', 20);

		HashMap<Character, Integer> mergeMap = new HashMap<>();

		for (char ch : map.keySet()) {

			mergeMap.put(ch, mergeMap.getOrDefault(ch, map.get(ch)));
		}

		for (char ch : map2.keySet()) {

			mergeMap.put(ch, mergeMap.getOrDefault(ch, 0) + map2.get(ch));
		}
		System.out.println(mergeMap);
	}
}
