package com.reflection.retrieveannotations;

public class RetrieveAnnotation {

	public static void main(String[] args) {

		Class<Book> cls = Book.class;

		if (cls.isAnnotationPresent(Author.class)) {

			Author author = cls.getAnnotation(Author.class);

			System.out.println("Author Name: " + author.name());
		} else {
			System.out.println("Author annotation not found.");
		}
	}
}
