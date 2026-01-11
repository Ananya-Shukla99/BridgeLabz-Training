package com.bookshelf;

public class Book {

	//attribute
	protected String name;
	protected int id;
	protected String genre;
	
	//constructor
	public Book(String name, int id, String genre) {
		this.name = name;
		this.id = id;
		this.genre=genre;
	}
	
	public String toString() {
		return name +" - id - " + id;
	}
}
