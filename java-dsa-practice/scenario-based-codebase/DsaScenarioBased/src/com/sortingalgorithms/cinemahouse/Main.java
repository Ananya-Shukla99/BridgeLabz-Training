package com.sortingalgorithms.cinemahouse;

public class Main {

	public static void main(String[] args) {

		Movie[] movies = { new Movie("Avatar", 1800), new Movie("Inception", 1500), new Movie("Titanic", 2100),
				new Movie("Jaws", 1200), new Movie("Interstellar", 2000) };

		System.out.println("Before Sorting:");
		for (Movie m : movies)
			System.out.println(m);

		CinemaHouse.bubbleSort(movies);

		System.out.println("\nAfter Sorting by Criticality:");
		for (Movie m : movies)
			System.out.println(m);
	}
}
