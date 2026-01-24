package com.collections.mapinterface;

import java.util.*;

public class KeyWithHighestValue {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('A', 10);
		map.put('B', 20);
		map.put('C', 30);
		map.put('D', 40);

		char maxKey = '\0';
		int maxValue = Integer.MIN_VALUE;

		for (Character i : map.keySet()) {

			if (map.get(i) > maxValue) {
				maxValue = map.get(i);
				maxKey = i;

			}

		}
		System.out.println("the Key with the Highest Value is : " + maxKey);
	}
}
