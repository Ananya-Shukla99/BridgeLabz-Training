package com.designprinciples.levelone;
import java.util.ArrayList;

public class Library {

	String libraryName;
	ArrayList<Book>collect;
	
	Library(String libraryName){
		this.libraryName=libraryName;
		collect=new ArrayList<>();
	}
	
	void addBook(Book book) {
		collect.add(book);
	}
	
	void displayBooks() {
		System.out.println("Book in "+ libraryName + ":");
		for(Book book :collect) {
			book.displayBook();
		}
		System.out.println();
	}
}
