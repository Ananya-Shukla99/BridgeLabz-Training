package com.binarysearchtree.universityrecord;

public class Student {

	class Node {
		int rollNo;
		String name;
		Node left, right;

		Node(int rollNo, String name) {
			this.rollNo = rollNo;
			this.name = name;
			left = right = null;
		}
	}

	Node root;

	// insert a student
	Node insert(Node root, int rollNo, String name) {
		if (root == null) {
			return new Node(rollNo, name);
		}

		if (rollNo < root.rollNo) {
			root.left = insert(root.left, rollNo, name);
		} else if (rollNo > root.rollNo)
			root.right = insert(root.right, rollNo, name);

		return root;
	}

	// delete a node
	Node delete(Node root, int rollNo) {
		if (root == null)
			return root;

		if (rollNo < root.rollNo)
			root.left = delete(root.left, rollNo);
		else if (rollNo > root.rollNo)
			root.right = delete(root.right, rollNo);
		else {
			// Node with one or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Node with two children
			Node successor = minValueNode(root.right);
			root.rollNo = successor.rollNo;
			root.name = successor.name;
			root.right = delete(root.right, successor.rollNo);
		}
		return root;
	}

	Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	// searching in student
	void search(Node root, int rollNo) {
		if (root == null) {
			System.out.println("Student not found.");
			return;
		}

		if (rollNo == root.rollNo)
			System.out.println("Found: Roll No " + root.rollNo + ", Name: " + root.name);
		else if (rollNo < root.rollNo)
			search(root.left, rollNo);
		else
			search(root.right, rollNo);
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println("Roll No: " + root.rollNo + ", Name: " + root.name);
			inorder(root.right);
		}
	}
}
