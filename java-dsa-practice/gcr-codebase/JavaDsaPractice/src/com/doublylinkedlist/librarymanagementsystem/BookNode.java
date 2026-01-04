package com.doublylinkedlist.librarymanagementsystem;

class BookNode {
	//attribute
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    //nodes
    BookNode next;
    BookNode prev;

    //constructor
    BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
