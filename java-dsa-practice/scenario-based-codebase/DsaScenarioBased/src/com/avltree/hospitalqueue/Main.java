package com.avltree.hospitalqueue;

public class Main {
	public static void main(String[] args) {

		Patient queue = new Patient();

		queue.root = queue.insert(queue.root, "Alice", 900);
		queue.insert(queue.root, "Bob", 930);
		queue.insert(queue.root, "Charlie", 915);
		queue.insert(queue.root, "David", 945);

		System.out.println("Patients by Arrival Time:");
		queue.display(queue.root);

		System.out.println("\nDischarging patient checked in at 915");
		queue.root = queue.delete(queue.root, 915);

		System.out.println("\nUpdated Queue:");
		queue.display(queue.root);
		
	}
}
