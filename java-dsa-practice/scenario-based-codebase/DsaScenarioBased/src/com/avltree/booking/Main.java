package com.avltree.booking;

public class Main {

	public static void main(String[] args) {

		Event bst = new Event();

		// Insert events
		bst.root = bst.insert(bst.root, "Concert", 1900);
		bst.insert(bst.root, "Movie", 1600);
		bst.insert(bst.root, "Stand-up Comedy", 2100);
		bst.insert(bst.root, "Drama Play", 1800);

		// Display upcoming events
		System.out.println("Upcoming Events:");
		bst.showEvents(bst.root);

		// Cancel an event
		System.out.println("\nCancelling event at 1800");
		bst.root = bst.delete(bst.root, 1800);

		// Display updated list
		System.out.println("\nUpdated Events:");
		bst.showEvents(bst.root);
	}
}
