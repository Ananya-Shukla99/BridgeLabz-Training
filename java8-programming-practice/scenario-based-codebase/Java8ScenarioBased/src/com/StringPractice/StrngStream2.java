package com.StringPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StrngStream2 {

	public static void main(String[] args) {

//		1.Character Frequency Count
//
//		Input: "banana"
//		Output: {b=1, a=3, n=2}

		String s1 = "banana";

		Map<Character, Long> map1 = s1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(map1);

//		2.Word Frequency Count
//
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}

		String s2 = "java is java and java is fast";

		Map<String, Long> map2 = Arrays.stream(s2.split(" "))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		System.out.println(map2);

//		3.First Non-Repeating Character
//
//		Input: "stress"
//		Output: t

		String s3 = "stress";

		Character ch = s3.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).findFirst().get().getKey();

		System.out.println(ch);
//
//		4.All Non-Repeating Characters
//
//		Input: "programming"
//		Output: p o g r a i n (only chars with count = 1)

		String p = "programming";

		String s = p.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> String.valueOf(x.getKey()))
				.collect(Collectors.joining(" "));

		System.out.println(s);
//		
//		5.Remove Duplicate Characters
//
//		Input: "banana"
//		Output: "ban"

		String s4 = "banana";

		String repeat = s4.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> String.valueOf(x.getKey()))
				.collect(Collectors.joining());

		String result = s4.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(repeat);
		System.out.println(result);
//		
//		6.Remove Repeating Characters (Keep Only Unique Once)
//
//		Input: "aabbccdde"
//		Output: "e"

		String s5 = "aabbccdde";

		String result2 = s5.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(x -> String.valueOf(x.getKey())).collect(Collectors.joining());

		System.out.println(result2);

//		7.Remove Non-Alphanumeric Characters
//
//		Input: "ja@va#8!!"
//		Output: "java8"

		String r = "ja@va#8!!";

		String result3 = r.chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit).map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(result3);

//		8.Keep Only Alphabets
//
//		Input: "java8stream2025"
//		Output: "javastream"

		String q = "java8stream2025";
		String result4 = q.chars().mapToObj(c -> (char) c).filter(Character::isLetter).map(String::valueOf)
				.collect(Collectors.joining());

		System.out.println(result4);
//		
//		9.Keep Only Digits
//
//		Input: "orderId=AB123XZ9"
//		Output: "1239"
		String order = "AB123XCV33";
		String result5 = order.chars().mapToObj(c -> (char) c).filter(Character::isDigit).map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(result5);

//		10.Count Each Character Except Spaces
//
//		Input: "java stream"
//		Output: frequency map without space

		String j = "java stream";

		long countt = j.chars().mapToObj(c -> (char) c).filter(x -> !Character.isWhitespace(x)).count();

		System.out.println(countt);

		Map<Character, Long> mp = j.chars().mapToObj(c -> (char) c).filter(c -> !Character.isWhitespace(c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(mp);

	}

}
