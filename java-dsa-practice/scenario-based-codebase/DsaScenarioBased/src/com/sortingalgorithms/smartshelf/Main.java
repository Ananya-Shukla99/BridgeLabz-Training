package com.sortingalgorithms.smartshelf;

public class Main {
	public static void main(String[] args) {

		Book[] shelf = new Book[10];
		
		int count = 0;

		// Books added one by one
		shelf[count++] = new Book("Java Programming", "James");
		SmartShelf.insertionSort(shelf, count);

		shelf[count++] = new Book("Algorithms", "Cormen");
		SmartShelf.insertionSort(shelf, count);

		shelf[count++] = new Book("Data Structures", "Sahni");
		SmartShelf.insertionSort(shelf, count);

		shelf[count++] = new Book("Artificial Intelligence", "Russell");
		SmartShelf.insertionSort(shelf, count);

		System.out.println("SmartShelf (Sorted):");

		for (int i = 0; i < count; i++) {
			System.out.println(shelf[i]);
		}
	}
}
