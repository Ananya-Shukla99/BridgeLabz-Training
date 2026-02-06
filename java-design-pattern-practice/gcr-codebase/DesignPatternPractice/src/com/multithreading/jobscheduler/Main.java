package com.multithreading.jobscheduler;

public class Main {

	public static void main(String []args) throws InterruptedException {
		
		System.out.println("Starting printing jobs ...");
		
		long startTime = System.currentTimeMillis();
		Job first =new Job("first", 10,5);
		Thread t1= new Thread(first);
		t1.setPriority(5);
		t1.start();
		
		Job second =new Job("second", 5,8);
		Thread t2= new Thread(second);
		t2.setPriority(8);
		t2.start();

		Job third =new Job("third", 15,3);
		Thread t3= new Thread(third);
		t3.setPriority(3);
		t3.start();
		

		Job fourth =new Job("fourth", 8,6);
		Thread t4= new Thread(fourth);
		t4.setPriority(6);
		t4.start();
		

		Job fifth =new Job("fifth", 13,7);
		Thread t5= new Thread(fifth);
		t5.setPriority(7);
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		long endTime = System.currentTimeMillis();

        System.out.println("\nAll jobs completed in " +
                (endTime - startTime) + " ms");
        

	}
	
	
}
