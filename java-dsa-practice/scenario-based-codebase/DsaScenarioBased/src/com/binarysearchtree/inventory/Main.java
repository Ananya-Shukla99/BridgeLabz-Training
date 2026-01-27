package com.binarysearchtree.inventory;

public class Main {

	public static void main(String[] args) {

		Product inventory = new Product();

		// insert products
		inventory.root = inventory.insert(inventory.root, "SKU-3005", "Laptop", 85000);
		inventory.insert(inventory.root, "SKU-1002", "Mouse", 1200);
		inventory.insert(inventory.root, "SKU-4501", "Keyboard", 2500);
		inventory.insert(inventory.root, "SKU-2203", "Monitor", 15000);
		inventory.insert(inventory.root, "SKU-1100", "USB Cable", 500);

		// Lookup
		System.out.println("Searching for SKU-2203");
		Product.Node result = inventory.lookUp(inventory.root, "SKU-2203");
		if (result != null) {
			System.out.println("Found  " + result.name + ", Price: " + result.price);
		} else {
			System.out.println("Product not found.");
		}

		// Update
		System.out.println("\nUpdating price for SKU-1002");
		inventory.updatePrice("SKU-1002", 1400);

		// display
		System.out.println("\nProducts Sorted by SKU:");
		inventory.display(inventory.root);
	}
}
