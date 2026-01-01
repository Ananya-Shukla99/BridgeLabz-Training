package com.Inheritance.leveltwo;

public class Book {

	String title;
	int publicationYear;
	
	public Book(String title,int publicationYear) {
		this.title=title;
		this.publicationYear=publicationYear;
	}
	
	public void displayInfo() {
		System.out.println("Display book details :");
		System.out.println("Title : " +title);
		System.out.println("Publication Year : "+ publicationYear);
	}
}
