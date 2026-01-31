package com.methodreferences.invoice;

import java.util.List;

public class InvoiceGenerator {

	public static void main(String[]args) {
		
		List<Integer>list= List.of(101, 102, 103, 104, 105);
		
		List<Invoice>l=list.stream().map(Invoice::new).toList();
		
		l.forEach(System.out::println);
	}
}