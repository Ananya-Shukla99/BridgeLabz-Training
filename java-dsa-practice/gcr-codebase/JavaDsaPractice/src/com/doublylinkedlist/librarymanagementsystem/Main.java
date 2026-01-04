package com.doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {

    	//creating node 
        LibraryList library = new LibraryList();

        //performing operation
        library.addAtEnd("Java Basics", "James", "Programming", 101, true);
        library.addAtEnd("Data Structures", "Mark", "CS", 102, true);
        library.addAtBeginning("Algorithms", "Robert", "CS", 103, false);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        library.searchByAuthor("Mark");

        library.updateAvailability(103, true);

        library.removeById(101);

        library.countBooks();

        System.out.println("\nAfter Updates:");
        library.displayForward();
    }
}
