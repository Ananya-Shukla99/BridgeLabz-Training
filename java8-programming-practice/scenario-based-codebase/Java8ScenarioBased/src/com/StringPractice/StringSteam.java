package com.StringPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StringSteam {


	public static void main(String[] args) {

		countVowels("programming");
		countWords("Java is very powerful");

		filterEvenNumbers(List.of(2, 5, 7, 8, 10, 13));
		convertToUppercase(List.of("java", "spring", "boot"));

		printStringLengths(List.of("cat", "elephant", "dog"));
		countStartingWithA(List.of("apple", "banana", "ant", "car"));

		removeEmptyStrings(List.of("java", "", "spring", "", "boot"));
		sumNumbers(List.of(1, 2, 3, 4, 5));

		findMaxNumber(List.of(10, 25, 3, 99, 45));
		reverseStrings(List.of("java", "api"));

		removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5));
		sortDescending(List.of(5, 1, 9, 3));

		findSecondHighest(List.of(10, 40, 30, 20));
		joinWithComma(List.of("Java", "Spring", "Boot"));

		characterFrequency("banana");
		filterGreaterThan50(List.of(10, 55, 60, 23, 90));

		groupByLength(List.of("a", "bb", "ccc", "dd"));
		firstNonRepeatedChar("stress");

		convertIntegerToString(List.of(1, 2, 3));
		wordFrequency("java is java and java is fast");

		partitionEvenOdd(List.of(1, 2, 3, 4, 5, 6));
		findDuplicates(List.of(1, 2, 3, 2, 4, 5, 1));

		findLongestString(List.of("java", "microservices", "api"));
		topThreeNumbers(List.of(10, 90, 30, 70, 50));

		flattenList(List.of(List.of(1, 2), List.of(3, 4), List.of(5)));

		sumOfSquaresOfEven(List.of(1, 2, 3, 4, 5));
		sortMapByValue();

		findCommonElements(List.of(1, 2, 3, 4, 5), List.of(3, 4, 5, 6, 7));

		findKthSmallest(List.of(9, 1, 5, 3, 7), 4);
	}

	// 1. Count vowels
	static void countVowels(String input) {
		long count = input.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();

		System.out.println("Vowels: " + count);
	}

	// 2. Count words
	static void countWords(String sentence) {
		long count = Arrays.stream(sentence.split("\\s+")).count();
		System.out.println("Words: " + count);
	}

	// 3. Filter even numbers
	static void filterEvenNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers:");
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

	// 4. Upper case strings
	static void convertToUppercase(List<String> words) {
		System.out.println("Uppercase:");
		words.stream().map(String::toUpperCase).forEach(System.out::println);
	}

	// 5. String lengths
	static void printStringLengths(List<String> words) {
		System.out.println("Lengths:");
		words.stream().map(String::length).forEach(System.out::println);
	}

	// 6. Count strings starting with 'a'
	static void countStartingWithA(List<String> words) {
		long count = words.stream().filter(w -> w.startsWith("a")).count();

		System.out.println("Starts with 'a': " + count);
	}

	// 7. Remove empty strings
	static void removeEmptyStrings(List<String> words) {
		System.out.println("Without Empty:");
		words.stream().filter(w -> !w.isEmpty()).forEach(System.out::println);
	}

	// 8. Sum numbers
	static void sumNumbers(List<Integer> numbers) {
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();

		System.out.println("Sum: " + sum);
	}

	// 9. Max number
	static void findMaxNumber(List<Integer> numbers) {
		numbers.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max: " + max));
	}

	// 10. Reverse strings
	static void reverseStrings(List<String> words) {
		System.out.println("Reversed:");
		words.stream().map(s -> new StringBuilder(s).reverse().toString()).forEach(System.out::println);
	}

	// 11. Remove duplicates
	static void removeDuplicates(List<Integer> numbers) {
		System.out.println("Unique:");
		numbers.stream().distinct().forEach(System.out::println);
	}

	// 12. Sort descending
	static void sortDescending(List<Integer> numbers) {
		System.out.println("Descending:");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

	// 13. Second highest
	static void findSecondHighest(List<Integer> numbers) {
		numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.ifPresent(n -> System.out.println("Second Highest: " + n));
	}

	// 14. Join strings
	static void joinWithComma(List<String> words) {
		String result = String.join(",", words);
		System.out.println("Joined: " + result);
	}

	// 15. Character frequency
	static void characterFrequency(String input) {

		Map<Character, Long> frequency = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		System.out.println("Char Frequency: " + frequency);
	}

	// 16. Greater than 50
	static void filterGreaterThan50(List<Integer> numbers) {

		List<Integer> result = numbers.stream().filter(n -> n > 50).toList();

		System.out.println("Greater than 50: " + result);
	}

	// 17. Group by length
	static void groupByLength(List<String> words) {

		Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(String::length));

		System.out.println("Grouped: " + map);
	}

	// 18. First non-repeated character
	static void firstNonRepeatedChar(String input) {

		Optional<Character> result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();

		result.ifPresent(c -> System.out.println("First Unique: " + c));
	}

	// 19. Convert Integer to String
	static void convertIntegerToString(List<Integer> numbers) {

		List<String> result = numbers.stream().map(String::valueOf).toList();

		System.out.println("String List: " + result);
	}

	// 20. Word frequency
	static void wordFrequency(String sentence) {

		Map<String, Long> frequency = Arrays.stream(sentence.split("\\s+"))
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		System.out.println("Word Frequency: " + frequency);
	}

	// 21. Partition even & odd
	static void partitionEvenOdd(List<Integer> numbers) {

		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println("Partitioned: " + map);
	}

	// 22. Find duplicates
	static void findDuplicates(List<Integer> numbers) {

		System.out.println("Duplicates:");

		numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
	}

	// 23. Longest string
	static void findLongestString(List<String> words) {

		words.stream().max(Comparator.comparingInt(String::length)).ifPresent(s -> System.out.println("Longest: " + s));
	}

	// 24. Top 3 numbers
	static void topThreeNumbers(List<Integer> numbers) {

		List<Integer> top = numbers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();

		System.out.println("Top 3: " + top);
	}

	// 25. Flatten list
	static void flattenList(List<List<Integer>> lists) {

		System.out.println("Flattened:");

		lists.stream().flatMap(List::stream).forEach(System.out::println);
	}

	// 26. Sum of squares of even
	static void sumOfSquaresOfEven(List<Integer> numbers) {

		int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

		System.out.println("Sum of Squares: " + sum);
	}

	// 27. Sort map by value
	static void sortMapByValue() {

		Map<Character, Integer> map = new HashMap<>();

		map.put('A', 3);
		map.put('B', 1);
		map.put('C', 2);

		System.out.println("Sorted Map:");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

	// 29. Common elements
	static void findCommonElements(List<Integer> list1, List<Integer> list2) {

		System.out.println("Common:");

		list1.stream().filter(list2::contains).forEach(System.out::println);
	}

	// 30. Kth smallest
	static void findKthSmallest(List<Integer> numbers, int k) {

		numbers.stream().sorted().skip(k - 1).findFirst().ifPresent(n -> System.out.println("Kth Smallest: " + n));
	}
}
