package com.constructor.levelone;

public class BookLibrarySystem {

	// Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BookLibrarySystem(String ISBN, String title, String author)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    public void setAuthor(String Author) {
    	this.author=Author;
    }
    
    public String getAuthor() {
    	return author;
    }
}
