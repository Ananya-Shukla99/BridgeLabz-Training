package com.librarymanagementsystem;

public class Main {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println(" SMART UNIVERSITY LIBRARY SYSTEM ");
		System.out.println("************************************\n");

		// 1. Get Singleton Catalog

		LibraryCatalog catalog = LibraryCatalog.getInstance();
		System.out.println("Library catalog initialized.\n");

		// 2. Create Users (Factory)

		User studentUser = UserFactory.createUser("student", "Ananya");
		User facultyUser = UserFactory.createUser("faculty", "Anjani");
		User librarianUser = UserFactory.createUser("librarian", "Suman");

		System.out.println("Users created using Factory Pattern:");
		studentUser.showRole();
		facultyUser.showRole();
		librarianUser.showRole();
		System.out.println();

		// 3. Register Observers

		Student s1 = new Student("Aman");
		Student s2 = new Student("Shara");

		catalog.addObserver(s1);
		catalog.addObserver(s2);

		System.out.println("Students subscribed for notifications:");
		System.out.println("- " + s1.getName());
		System.out.println("- " + s2.getName());
		System.out.println();

		// 4. Create Books (Builder)

		Book book1 = new Book.BookBuilder("Data Structures").authors("Cormen").edition("3rd Edition")
				.genre("Computer Science").publisher("MIT Press").build();

		Book book2 = new Book.BookBuilder("Clean Code").authors("Robert C. Martin").genre("Software Engineering")
				.build();

		System.out.println("Books created using Builder Pattern:");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println();

		// 5. Add Books to Catalog

		System.out.println("Adding books to library catalog...\n");

		catalog.addBook(book1);
		catalog.addBook(book2);

		// 6. Display Catalog

		System.out.println("\nCurrent Books in Library:");

		for (Book b : catalog.getBooks()) {
			System.out.println("- " + b.getTitle());
		}

		System.out.println("\n********************************");
		System.out.println(" System Execution Completed ");
		System.out.println("**********************************");
	}
}
