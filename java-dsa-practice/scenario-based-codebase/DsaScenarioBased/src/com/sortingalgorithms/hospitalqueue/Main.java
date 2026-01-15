package com.sortingalgorithms.hospitalqueue;

public class Main {

	public static void main(String[] args) {

		Patient[] erQueue = { new Patient("Ravi", 4), new Patient("Anita", 9), new Patient("John", 5),
				new Patient("Meera", 10), new Patient("Amit", 6) };

		System.out.println("Before Sorting:");
		for (Patient p : erQueue)
			System.out.println(p);

		HospitalQueue.bubbleSort(erQueue);

		System.out.println("\nAfter Sorting by Criticality:");
		for (Patient p : erQueue)
			System.out.println(p);
	}
}
