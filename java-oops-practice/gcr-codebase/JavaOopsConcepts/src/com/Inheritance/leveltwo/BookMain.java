package com.Inheritance.leveltwo;

public class BookMain {

	public static void main(String []agrs) {
		
		Author bookAuthor=new Author("Java", 2001 , "James Goslin",
				"Expert Java developer and author");
		Author bookAuthor2 = new Author("Effective Java", 2018,
	            "Joshua Bloch","Software developer and author");
		Book book=new Book("C++", 1990);
		
		bookAuthor.displayInfo();
		bookAuthor2.displayInfo();
		book.displayInfo();
	}
}
