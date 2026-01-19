package com.sortingalgorithms.fitnesstracker;

public class Main {

	public static void main(String[] args) {

		User[] users = { new User("Amit", 6500), new User("Riya", 9200), new User("Suresh", 4800),
				new User("Neha", 8000), new User("Karan", 9290) };

		System.out.println("Before Sorting (Live Steps):");
		for (User u : users) {
			System.out.println(u.name + " - " + u.step);
		}

		// Real-time ranking update
		Tracker.bubbleSort(users);

		System.out.println("\nDaily Step Leaderboard:");
		for (int i = users.length - 1; i >= 0; i--) {
			System.out.println(users[i].name + " - " + users[i].step);
		}
	}
}
