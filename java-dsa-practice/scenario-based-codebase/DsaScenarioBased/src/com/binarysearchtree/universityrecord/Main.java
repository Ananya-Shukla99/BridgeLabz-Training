package com.binarysearchtree.universityrecord;

public class Main {

	public static void main(String[] args) {

		Student tree = new Student();

		// insertion
		tree.root = tree.insert(tree.root, 1, "Ananya");
		tree.insert(tree.root, 2, "Rani");
		tree.insert(tree.root, 3, "Om");
		tree.insert(tree.root, 4, "Pavan");
		tree.insert(tree.root, 5, "Tarun");
		tree.insert(tree.root, 6, "Sudha");

		// display
		System.out.println("Sorted List of students ");
		tree.inorder(tree.root);

		// Search
		System.out.println("Search roll no 5 -");
		tree.search(tree.root, 5);

		// deletion
		System.out.println("Deletion of roll no 5");
		tree.root = tree.delete(tree.root, 5);

		// display
		System.out.println("Sorted List of students ");
		tree.inorder(tree.root);

	}

}
