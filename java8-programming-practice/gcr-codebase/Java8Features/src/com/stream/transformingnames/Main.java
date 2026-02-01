package com.stream.transformingnames;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Customer> customers = new ArrayList<>();

		customers.add(new Customer("Ravi", 12000.0));
		customers.add(new Customer("Anita", 25000.0));
		customers.add(new Customer("Suresh", 18000.0));
		customers.add(new Customer("Meena", 30000.0));
		customers.add(new Customer("Karan", 15000.0));
		customers.add(new Customer("Pooja", 22000.0));
		customers.add(new Customer("Aman", 27000.0));
		customers.add(new Customer("Neha", 20000.0));

		System.out.println("Customer List ");
		customers.forEach(System.out::println);

		List<String> list = customers.stream().map(c -> c.name.toUpperCase())
				.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

		list.stream().forEach(System.out::println);
	}
}
