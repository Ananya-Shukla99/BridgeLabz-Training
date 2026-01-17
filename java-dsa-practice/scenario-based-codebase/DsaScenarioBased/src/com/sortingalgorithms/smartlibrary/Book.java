package com.sortingalgorithms.smartlibrary;

public class Book {

	//attribute
	protected String title;
	protected String author;
	
	//constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + " - " + author;
	}
	
}
