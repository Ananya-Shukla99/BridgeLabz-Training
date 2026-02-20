package com.StringPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice4 {

	public static void main(String[]args) {
		
		List<Integer> scores = Arrays.asList(85, 92, 78, 90, 88, 95, 80);
		
		List<Integer>li=scores.stream().sorted((a,b)->b-a).limit(3).toList();

		System.out.println(li);
		
		List<Double> salaries = Arrays.asList(30000.0, 45000.0, 50000.0);

		List<Double> list=salaries.stream().map(x->x+(x*0.1)).toList();
		
		System.out.println(list);
		
		List<String> products =
		        Arrays.asList("Laptop", "OutdatedPhone", "Tablet", "outdatedTV");

		List<String>ans=products.stream().filter(x-> !x.toLowerCase().startsWith("outdated")).toList();
		
		System.out.println(ans);
		
		List<Integer> nums =
		        Arrays.asList(1, 2, 2, 3, 4, 3, 5, 1);

		Set<Integer>st= nums.stream().distinct().collect(Collectors.toSet());
		
		System.out.println(st);
	}
}
