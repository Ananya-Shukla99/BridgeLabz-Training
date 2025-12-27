package com.constructor.levelone;

public class LibraryBookSystem {
    
	// Attributes
	String title;
	String author;
    double price;
    boolean availability;
    
    //Constructor
    public LibraryBookSystem(String title ,String author , double price ,boolean availability) {
    	this.title=title;
    	this.author =author;
    	this.price=price;
    	this.availability=availability;
    }
    public void borrow () {
    	if(availability) {
    		System.out.println("Yes you can borrow "+this.title+" book");
    	}
    	else {
    		System.out.println("Sorry the book "+this.title+" is not availability ");
    	}
    	
    }
    
    
}
