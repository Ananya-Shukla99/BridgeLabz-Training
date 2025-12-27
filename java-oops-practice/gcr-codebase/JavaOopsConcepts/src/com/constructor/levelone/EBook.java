package com.constructor.levelone;

public class EBook extends BookLibrarySystem {

	double fileSize;
	
	public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
	
	public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);        // public → accessible
        System.out.println("Title: " + title);       // protected → accessible in subclass
        System.out.println("Author: " + getAuthor()); // private → accessed via getter
        System.out.println("File Size: " + fileSize + " MB");
    }

}
