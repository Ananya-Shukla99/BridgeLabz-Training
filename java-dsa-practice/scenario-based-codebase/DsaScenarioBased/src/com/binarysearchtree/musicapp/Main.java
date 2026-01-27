package com.binarysearchtree.musicapp;

public class Main {
	public static void main(String[] args) {

		Track trackBST = new Track();

		// Insert songs 
		trackBST.root = trackBST.insert(trackBST.root, "Believer", "T101", "Imagine Dragons");

		trackBST.insert(trackBST.root, "Shape of You", "T102", "Ed Sheeran");

		trackBST.insert(trackBST.root, "Counting Stars", "T103", "OneRepublic");

		// Search song by Track ID 
		System.out.println("Searching for Track ID T102:");
		Track.Node result = trackBST.search(trackBST.root, "T102");

		if (result != null) {
			System.out.println("Found → " + result.title + " | " + result.artist);
		} else {
			System.out.println("Track not found.");
		}

		// Show play list alphabetically
		
		System.out.println("\nPlaylist (In-order Traversal):");
		trackBST.showPlaylist(trackBST.root);
	}
}
