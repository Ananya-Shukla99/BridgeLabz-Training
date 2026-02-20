package com.StringPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStream3 {

	public static void main(String[] args) {

		// 1.Convert List of strings to Map with string as key and length as value

		List<String> list = Arrays.asList("Hello", "World", "This", "Is", "Java");

		Map<String, Integer> stringAndLength = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));

		stringAndLength.forEach((x, y) -> System.out.println(x + " : " + y));

		// 2.Convert List of integers to Map with number and its square

		List<Integer> m = Arrays.asList(2, 3, 5, 4);

		Map<Integer, Integer> convert = m.stream().collect(Collectors.toMap(x -> x, x -> x * x));

		convert.forEach((k, v) -> System.out.println(k + ":" + v));
		

		//Convert List of words to Map with word and frequency

		List<String > words= Arrays.asList("hello", "world", "my" , "java", "java", "my","my");
		
		Map<String, Long> map= words.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
		
		System.out.println(map);
		
		//5.Convert List to Map with index as key and element as value
		
		
		
		
		
	}
}
