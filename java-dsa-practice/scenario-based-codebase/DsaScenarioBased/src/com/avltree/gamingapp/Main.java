package com.avltree.gamingapp;

public class Main {
	public static void main(String[] args) {

		Leaderboard lb = new Leaderboard();

		lb.root = lb.insert(lb.root, "Ananya", 1200);
		lb.insert(lb.root, "Bhanu", 1500);
		lb.insert(lb.root, "Suman", 900);
		lb.insert(lb.root, "Dhruv", 1800);
		lb.insert(lb.root, "Eva", 1600);

		System.out.println("Top Players:");
		lb.showTopPlayers(lb.root);

		System.out.println("Removing Bhanu");
		lb.root = lb.delete(lb.root, 1500);

		lb.count = 0;
		System.out.println("\nUpdated Leaderboard:");
		lb.showTopPlayers(lb.root);
	}
}
