package com.constructor.levelone;

public class BookLibrarySystemMain {

	public static void main(String[] args) {

        EBook ebook = new EBook("001","Java","Joshua Bloch",5.6);

        ebook.displayEBookDetails();

        // Modify author using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
