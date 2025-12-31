package com.designprinciples.levelone;

public class LibraryMain {

	public static void main(String[]args) {
		
		Book b1 = new Book("Anna", "George Paul");
        Book b2 = new Book("The Thesist", "Paulo Coelho");
        Book b3 = new Book("Java", "James Gosline");
        Book b4 = new Book("c++", "Poppy James");
        
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
	
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib1.addBook(b3);
        lib1.addBook(b4);        

        lib2.addBook(b1); 
        lib2.addBook(b4);
        lib2.addBook(b3);

        // Display books
        lib1.displayBooks();
        lib2.displayBooks();
	}
}
