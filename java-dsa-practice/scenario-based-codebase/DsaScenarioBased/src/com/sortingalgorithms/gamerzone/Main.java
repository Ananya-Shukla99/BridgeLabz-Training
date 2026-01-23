package com.sortingalgorithms.gamerzone;

public class Main {

	public static void main(String[] args) {

		// Creating Player objects
		Player p1 = new Player("Aman", 85);
		Player p2 = new Player("Uma", 72);
		Player p3 = new Player("Tanu", 95);
		Player p4 = new Player("Dhruv", 60);
		Player p5 = new Player("Ahana", 88);

		// Storing players in an array
		Player[] players = { p1, p2, p3, p4, p5 };

		System.out.println("Before Sorting (Unranked Players):");
		for (Player p : players) {
			System.out.println(p.name + " : " + p.getMarks());
		}

		// Applying Quick Sort
		ScoreRanking.quickSort(players, 0, players.length - 1);

		System.out.println("After Sorting (High Score Ranking):");
		for (Player p : players) {
			System.out.println(p.name + " : " + p.getMarks());
		}

	}
}
