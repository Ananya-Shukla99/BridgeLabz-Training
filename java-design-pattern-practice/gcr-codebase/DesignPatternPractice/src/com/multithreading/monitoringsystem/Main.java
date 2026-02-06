package com.multithreading.monitoringsystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm:ss");
		String time = LocalTime.now().format(form);
		MyThread thread1 = new MyThread();
		System.out.println("Task- 1 is in " + thread1.getState() + " at " + time);
		thread1.start();
		System.out.println("Task- 1 is in " + thread1.getState() + " at " + time);

		try {
			Thread.sleep(1000);
			System.out.println("Task- 1 is in " + thread1.getState() + " at " + time);

			thread1.join();
			System.out.println("Task- 1 is in " + thread1.getState() + " at " + time);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Task-1 went through 4 states");
	}
}
