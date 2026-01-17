package com.sortingalgorithms.artexpo;

public class Main {

	public static void main(String []args) {
		
		Artist[] art= {new Artist("Madhubani", 2), new Artist("Poppy", 7), new Artist("Black&White", 4), new Artist("Classic", 3) , new Artist("Morden", 8)};
		
		System.out.println("Printing the arting without sorting ");
		for(Artist a:art) {
			
			System.out.println(a);
		}
		
		InsertionSort.insertionSort(art, art.length);
		
		
		System.out.println("\nPrinting the arting with sorting ");
		for(Artist a:art) {
			
			System.out.println(a);
		}
	}
}
