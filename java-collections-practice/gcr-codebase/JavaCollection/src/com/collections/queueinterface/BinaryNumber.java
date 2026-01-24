package com.collections.queueinterface;

import java.util.*;

public class BinaryNumber {

	public static List<String> generateBinarySearch(int n) {

		List<String> result = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();

		queue.add("1");

		for (int i = 0; i < n; i++) {

			String curr = queue.remove();
			result.add(curr);

			queue.add(curr + "0");
			queue.add(curr + "1");

		}

		return result;
	}

	public static void main(String[] args) {

		int n = 6;
		System.out.println(generateBinarySearch(n));

	}
}
