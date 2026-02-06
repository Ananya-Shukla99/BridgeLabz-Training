package com.multithreading.restaurantorder;

public class Main {

	public static void main(String[] args) {

		// creating threads
		Chef thread1 = new Chef("Hariom", "Pizza", 300);
		
		Chef thread2 = new Chef("Suman", "Pasta", 200);
		
		Chef thread3 = new Chef("Ananya", "Salad", 100);
		
		Chef thread4 = new Chef("Raman", "Burger", 250);

		// start preparing dishes
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			System.out.println("Kitchen closed - All orders completed !");
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}
