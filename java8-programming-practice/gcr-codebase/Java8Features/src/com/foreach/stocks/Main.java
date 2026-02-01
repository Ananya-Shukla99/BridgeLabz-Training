package com.foreach.stocks;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Stock> stocks = new ArrayList<>();

		stocks.add(new Stock("Apple", 192.45));
		stocks.add(new Stock("Microsoft", 378.20));
		stocks.add(new Stock("Amazon", 161.80));
		stocks.add(new Stock("Google", 145.65));
		stocks.add(new Stock("Tesla", 224.90));

		// Display all stock prices from a live feed
		stocks.forEach(System.out::println);
	}
}
