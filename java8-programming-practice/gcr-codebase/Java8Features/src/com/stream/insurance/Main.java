package com.stream.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Claim> claims = new ArrayList<>();

		claims.add(new Claim("Medical", 15000.0));
		claims.add(new Claim("Travel", 8000.0));
		claims.add(new Claim("Vehicle", 25000.0));
		claims.add(new Claim("Home", 40000.0));
		claims.add(new Claim("Medical", 12000.0));
		claims.add(new Claim("Travel", 6000.0));
		claims.add(new Claim("Life", 100000.0));
		claims.add(new Claim("Vehicle", 18000.0));

		System.out.println("All available claim ");
		claims.stream().forEach(System.out::println);

		Map<String, Double> average = claims.stream()
				.collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

		average.forEach((type, avg) -> System.out.println(type + " : " + avg));
	}

}
