package com.sortingalgorithms.zipzipmart;

public class Main {
	public static void main(String[] args) {

		SalesRecord[] sales = { new SalesRecord("T01", "2025-01-10", 500), new SalesRecord("T02", "2025-01-08", 1200),
				new SalesRecord("T03", "2025-01-10", 300), new SalesRecord("T04", "2025-01-09", 700),
				new SalesRecord("T05", "2025-01-08", 800) };

		ZipZipMart.mergeSort(sales, 0, sales.length - 1);

		System.out.println("Sorted Sales Report:");
		for (SalesRecord s : sales)
			System.out.println(s);
	}
}
