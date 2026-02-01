package com.collectors.frequencycounter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		String text = "Java is easy to learn. Java is powerful. Learning Java improves programming skills.";

		String[] words = text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");

		Map<String, Integer> wordCount = Arrays.stream(words)
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));

		wordCount.forEach((word, count) -> System.out.println(word + " -> " + count));

	}
}
