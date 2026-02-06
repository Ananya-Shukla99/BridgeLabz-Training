package com.multithreading.monitoringsystem;

import java.time.LocalTime;

public class MyThread extends Thread {

	LocalTime time = LocalTime.now();

	@Override
	public void run() {

		try {

			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			System.out.println("Excetion occurs....");
		}
	}
}
