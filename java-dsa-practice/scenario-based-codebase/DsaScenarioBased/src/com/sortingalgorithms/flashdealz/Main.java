package com.sortingalgorithms.flashdealz;

public class Main {

	public static void main(String[] args) {

		Product[] products = { new Product("Smartphone", 30000, 40.0), new Product("Laptop", 75000, 25.5),
				new Product("Headphones", 5000, 60.0), new Product("Smartwatch", 15000, 35.0),
				new Product("Camera", 45000, 20.0), new Product("Bluetooth Speaker", 8000, 50.0) };

		System.out.println("Before Sorting (Unsorted Discounts):");
		for (Product p : products) {
			System.out.println(p.name + " - " + p.discount + "%");
		}

		// Quick Sort by discount (descending)
		QuickSort.quickSort(products, 0, products.length - 1);

		System.out.println("\nFlash Sale – Top Discounted Products:");
		for (int i = 0; i < products.length; i++) {
			System.out.println((i + 1) + ". " + products[i].name + "   Price: ₹" + products[i].price + "   Discount: "
					+ products[i].discount + "%");
		}
	}
}
