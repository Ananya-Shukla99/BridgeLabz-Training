package com.avltree.hospitalqueue;

public class Patient {

	class Node {
		String patientName;
		int checkInTime;
		int height;
		Node left, right;

		Node(String patientName, int checkInTime) {
			this.patientName = patientName;
			this.checkInTime = checkInTime;
			height = 1;
		}
	}

	Node root;

	// Height
	int height(Node n) {
		return (n == null) ? 0 : n.height;
	}

	// Balance Factor
	int getBalance(Node n) {
		return (n == null) ? 0 : height(n.left) - height(n.right);
	}

	// Right Rotation
	Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left Rotation
	Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Patient Registration
	Node insert(Node node, String name, int time) {
		if (node == null)
			return new Node(name, time);

		if (time < node.checkInTime)
			node.left = insert(node.left, name, time);
		else if (time > node.checkInTime)
			node.right = insert(node.right, name, time);
		else
			return node;

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		if (balance > 1 && time < node.left.checkInTime)
			return rightRotate(node);

		if (balance < -1 && time > node.right.checkInTime)
			return leftRotate(node);

		if (balance > 1 && time > node.left.checkInTime) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		if (balance < -1 && time < node.right.checkInTime) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Discharge
	Node delete(Node root, int time) {

		if (root == null)
			return root;

		if (time < root.checkInTime)
			root.left = delete(root.left, time);
		else if (time > root.checkInTime)
			root.right = delete(root.right, time);
		else {
			if (root.left == null || root.right == null) {
				root = (root.left != null) ? root.left : root.right;
			} else {
				Node temp = minValueNode(root.right);
				root.checkInTime = temp.checkInTime;
				root.patientName = temp.patientName;
				root.right = delete(root.right, temp.checkInTime);
			}
		}

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balance = getBalance(root);

		// Re balance
		if (balance > 1 && getBalance(root.left) >= 0)
			return rightRotate(root);

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return leftRotate(root);

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	// Display Patients
	void display(Node root) {
		if (root == null)
			return;

		display(root.left);
		System.out.println("Patient: " + root.patientName + " | Check-in Time: " + root.checkInTime);
		display(root.right);
	}
}
