package com.avltree.booking;

public class Event {

	class Node {
		String eventName;
		int eventTime;
		Node left, right;

		Node(String eventName, int eventTime) {
			this.eventName = eventName;
			this.eventTime = eventTime;
			left = right = null;
		}
	}

	Node root;

	// Insert Event
	Node insert(Node root, String eventName, int eventTime) {
		if (root == null) {
			return new Node(eventName, eventTime);
		}

		if (eventTime < root.eventTime) {
			root.left = insert(root.left, eventName, eventTime);
		} else if (eventTime > root.eventTime) {
			root.right = insert(root.right, eventName, eventTime);
		}

		return root;
	}

	// Cancel Event
	Node delete(Node root, int eventTime) {
		if (root == null)
			return root;

		if (eventTime < root.eventTime)
			root.left = delete(root.left, eventTime);
		else if (eventTime > root.eventTime)
			root.right = delete(root.right, eventTime);
		else {
			// One or no child
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			// Two children
			Node temp = minValueNode(root.right);
			root.eventTime = temp.eventTime;
			root.eventName = temp.eventName;
			root.right = delete(root.right, temp.eventTime);
		}

		return root;
	}

	Node minValueNode(Node node) {
		Node current = node;
		while (current.left != null)
			current = current.left;
		return current;
	}
	// Show Events
	void showEvents(Node root) {
		if (root == null)
			return;

		showEvents(root.left);
		System.out.println("Event: " + root.eventName + " | Time: " + root.eventTime);
		showEvents(root.right);
	}
}
