package com.sortingalgorithms.smartlibrary;

public class Main {

	public static void main(String[] args) {

		Book [] book = { new Book("Hindi", "Bheem Shingh"), new Book("English", "Ram Rao"),
				new Book("Math", "Smith jhon"), new Book("Science", "Smriti Jain"),
				new Book("Social Science", "Raman Rao"), };

		System.out.println("Books before sorting");

		for (Book b : book) {
			System.out.println(b);
		}

		Library.insertionSort(book);

		System.out.println();
		
		System.out.println("Books after sorting");

		for (Book b : book) {
			System.out.println(b);
		}

	}
}
