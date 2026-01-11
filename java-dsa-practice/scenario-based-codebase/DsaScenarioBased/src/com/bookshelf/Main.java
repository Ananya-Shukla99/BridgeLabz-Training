package com.bookshelf;

public class Main {

	public static void main(String []args) {
		
		BookShelf shelf=new BookShelf ();
		
		Book b1 =new Book("The Hobbit", 101 , "Fantasy");
		Book b2 =new Book("The Lion", 102 , "Fantasy");
		Book b3 =new Book("She: A History of Adventure", 103 , "Mystery");
		Book b4 =new Book("The Da Vinci Code ", 104 , "Adventure");
		Book b5 =new Book("The Hobbit", 101 , "Fantasy");
	
		shelf.addBook(b1);
		shelf.addBook(b2);
		shelf.addBook(b3);
		shelf.addBook(b4);
		shelf.addBook(b5);
		
		shelf.showGenre("Mystery");
		shelf.showGenre("Fantasy");
		
		shelf.borrowBook(102);
		
		shelf.showGenre("Fantasy");
		
		
		
	
	
	}
	
}
