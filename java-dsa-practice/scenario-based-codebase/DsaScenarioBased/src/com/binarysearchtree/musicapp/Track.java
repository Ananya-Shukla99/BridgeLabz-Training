package com.binarysearchtree.musicapp;

public class Track {

	class Node {
		String title;
		String trackID;
		String artist;
		Node left, right;

		Node(String title, String trackID, String artist) {
			this.title = title;
			this.trackID = trackID;
			this.artist = artist;
			left = right = null;
		}
	}

	Node root;

	// insert song
	Node insert(Node root, String title, String trackID, String artist) {
		if (root == null) {
			return new Node(title, trackID, artist);
		}

		if (trackID.compareTo(root.trackID) < 0) {
			root.left = insert(root.left, title, trackID, artist);
		} else if (trackID.compareTo(root.trackID) > 0) {
			root.right = insert(root.right, title, trackID, artist);
		}

		return root;
	}

	// search
	Node search(Node root, String trackID) {
		if (root == null || root.trackID.equals(trackID))
			return root;

		if (trackID.compareTo(root.trackID) < 0)
			return search(root.left, trackID);

		return search(root.right, trackID);
	}

	// Show Play list
	void showPlaylist(Node root) {
		if (root == null)
			return;

		showPlaylist(root.left);
		System.out.println("Track ID : " + root.trackID + " | Title : " + root.title + " | Artist : " + root.artist);
		showPlaylist(root.right);
	}
}
