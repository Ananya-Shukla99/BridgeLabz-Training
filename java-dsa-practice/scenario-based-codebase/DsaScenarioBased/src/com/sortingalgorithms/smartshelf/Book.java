package com.sortingalgorithms.smartshelf;

public class Book {

	//attribute
	String title;
    String author;

    //constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
