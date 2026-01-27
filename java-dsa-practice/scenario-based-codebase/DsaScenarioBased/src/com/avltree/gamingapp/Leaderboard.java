package com.avltree.gamingapp;

public class Leaderboard {

	class Node {
		String playerName;
		int score;
		int height;
		Node left, right;

		Node(String playerName, int score) {
			this.playerName = playerName;
			this.score = score;
			this.height = 1;
		}
	}

	Node root;

	// Height
	int height(Node n) {
		return n == null ? 0 : n.height;
	}

	// Balance factor
	int getBalance(Node n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}

	// Right rotate
	Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;

		x.right = y;
		y.left = t2;

		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotate
	Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;

		y.left = x;
		x.right = t2;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Insert
	Node insert(Node node, String name, int score) {

		if (node == null)
			return new Node(name, score);

		if (score < node.score)
			node.left = insert(node.left, name, score);
		else if (score > node.score)
			node.right = insert(node.right, name, score);
		else
			return node; // duplicate score ignored (simplified)

		node.height = 1 + Math.max(height(node.left), height(node.right));

		int balance = getBalance(node);

		// LL
		if (balance > 1 && score < node.left.score)
			return rightRotate(node);

		// RR
		if (balance < -1 && score > node.right.score)
			return leftRotate(node);

		// LR
		if (balance > 1 && score > node.left.score) {
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}

		// RL
		if (balance < -1 && score < node.right.score) {
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}

		return node;
	}

	// Remove
	Node delete(Node root, int score) {

		if (root == null)
			return root;

		if (score < root.score)
			root.left = delete(root.left, score);
		else if (score > root.score)
			root.right = delete(root.right, score);
		else {
			if ((root.left == null) || (root.right == null)) {
				root = (root.left != null) ? root.left : root.right;
			} else {
				Node temp = minValueNode(root.right);
				root.score = temp.score;
				root.playerName = temp.playerName;
				root.right = delete(root.right, temp.score);
			}
		}

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;

		int balance = getBalance(root);

		// Re balancing
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

	// Get minimum value
	Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}

	// Display value
	int count = 0;

	void showTopPlayers(Node root) {
		if (root == null || count >= 10)
			return;

		showTopPlayers(root.right);
		if (count < 10) {
			System.out.println(root.playerName + " → " + root.score);
			count++;
		}
		showTopPlayers(root.left);
	}
}
