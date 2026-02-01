package com.stream.movies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {

		//List to store movies
		List<Movie> movies = new ArrayList<>();

		//Adding movies in list
		movies.add(new Movie("Sholay", 8.2, 1975));
		movies.add(new Movie("Dilwale Dulhania Le Jayenge", 8.0, 1995));
		movies.add(new Movie("3 Idiots", 8.4, 2009));
		movies.add(new Movie("Lagaan", 8.1, 2001));
		movies.add(new Movie("Kabhi Khushi Kabhie Gham", 7.4, 2001));
		movies.add(new Movie("Bajrangi Bhaijaan", 8.0, 2015));
		movies.add(new Movie("PK", 8.1, 2014));
		movies.add(new Movie("Andhadhun", 8.2, 2018));
		movies.add(new Movie("Gully Boy", 7.9, 2019));
		movies.add(new Movie("Dangal", 8.3, 2016));

		//Using stream to sort top 5 movies
		List<Movie> topFive = movies.stream().sorted((m, n) -> Double.compare(n.rating, m.rating)).limit(5)
				.collect(Collectors.toList());

		// All listed movie
		System.out.println("Unsorted list of movies : ");

		movies.stream().forEach(System.out::println);

		System.out.println("*************************************************************");
		
		//Top five rated movies
		System.out.println("Sorted list of top five movies : ");

		topFive.stream().forEach(System.out::println);

	}
}
