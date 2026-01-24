package com.collections.queueinterface;

import java.util.*;

public class HospitalTriageSystem {

	public static void main(String[] args) {

		// Priority Queue with custom comparator
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

		triageQueue.add(new Patient("John", 3));
		triageQueue.add(new Patient("Alice", 5));
		triageQueue.add(new Patient("Bob", 2));

		System.out.println("Treatment Order:");

		while (!triageQueue.isEmpty()) {

			Patient p = triageQueue.poll();
			System.out.println(p.name);
		}
	}
}
