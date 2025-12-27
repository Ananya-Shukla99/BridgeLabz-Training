package com.constructor.levelone;

public class Book {
	
	String title;
	String author;
	double  price;
	
	public Book (String title, String author, double  price) {
		this.title=title;
		this.author =author;
		this.price=price;
	}
	public Book() {
		System.out.println("This is the Default constructor");
	}

	public void Display() {
		System.out.println("Title :"+ this.title);
		System.out.println("Author :"+ this.author);
		System.out.println("Price "+ this.price);
	}
	public static void main(String[]args) {
		Book b1=new Book("Hello", "Robin", 700.0);
		b1.Display();
	}
}
