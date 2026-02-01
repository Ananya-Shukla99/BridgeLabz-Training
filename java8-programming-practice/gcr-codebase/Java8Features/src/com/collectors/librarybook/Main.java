package com.collectors.librarybook;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		// Create book objects
		Book book1 = new Book("Atomic Habits", "Self-Help", 320);
		Book book2 = new Book("The Alchemist", "Fiction", 208);
		Book book3 = new Book("Clean Code", "Programming", 464);
		Book book4 = new Book("Wings of Fire", "Autobiography", 180);
		Book book5 = new Book("Rich Dad Poor Dad", "Personal Finance", 336);
		Book book6 = new Book("Think Like a Monk", "Self-Help", 352);
		Book book7 = new Book("The Power of Habit", "Self-Help", 371);
		Book book8 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 309);
		Book book9 = new Book("The Hobbit", "Fantasy", 310);
		Book book10 = new Book("Effective Java", "Programming", 416);

		List<Book> books = Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);

		Map<String, IntSummaryStatistics> average = books.stream()
				.collect(Collectors.groupingBy(Book::getGenres, Collectors.summarizingInt(Book::getPage)));

		average.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("  Total pages   : " + stats.getSum());
			System.out.println("  Average pages : " + stats.getAverage());
			System.out.println("  Maximum pages : " + stats.getMax());
		});

	}
}
