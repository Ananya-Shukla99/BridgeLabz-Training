package com.functionalInterface.jobexecution;

import java.util.List;

public class Asynchronous {

	public static void main(String[] args) {

		List<String> tasks = List.of("first", "Second", "Third", "Four", "Five");

		for (String task : tasks) {
			Runnable job = () -> {
				System.out.println("Executing task " + task + " Thread  " + Thread.currentThread().getName());
			};

			Thread t = new Thread(job);
			t.start();
		}

		System.out.println("Main thread finished creating tasks");
	}
}
