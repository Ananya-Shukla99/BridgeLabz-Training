package com.Inheritance.leveltwo;

public class Author extends Book{
	
	String name; 
	String bio;
    Author(String title, int publicationYear, String name, String bio ){
    	super(title, publicationYear);
    	this.name=name; 
    	this.bio=bio;
    }
	
    @Override
    public void displayInfo() {
		super.displayInfo();
		System.out.println("Author info ");
		System.out.println("Author name : "+name);
		System.out.println("Author bio : "+bio);
		System.out.println();
	}
}
