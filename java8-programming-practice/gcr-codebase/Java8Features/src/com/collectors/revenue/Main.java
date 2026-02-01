package com.collectors.revenue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("Rahul", 250.75), new Order("Priya", 120.50),
				new Order("Rahul", 300.00), new Order("Sneha", 500.25), new Order("Priya", 80.00),
				new Order("Rahul", 150.00));

		Map<String, Double> revenue = orders.stream()
				.collect(Collectors.groupingBy(o -> o.customer, Collectors.summingDouble(o -> o.total)));

		revenue.forEach((customer, total) -> System.out.println(customer + " -> " + total));
	}
}
