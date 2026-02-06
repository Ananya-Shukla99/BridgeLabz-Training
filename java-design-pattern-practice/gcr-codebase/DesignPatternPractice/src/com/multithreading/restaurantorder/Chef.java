package com.multithreading.restaurantorder;

public class Chef extends Thread {

	private String name;
	private String dish;
	private int wait;

	public Chef(String name, String dish, int wait) {
		this.name=name;
		this.dish = dish;
		this.wait = wait;
	}

	@Override
	public void run() {

		System.out.println("Chef "+ name +" started erparing "+dish);
		
		try {
			for (int i = 0; i <= 100; i += 25) {
				
				Thread.sleep(wait);
				
				System.out.println("Chef "+ name +" preparing "+dish +" : "+i+" % complete");
				
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}
}
