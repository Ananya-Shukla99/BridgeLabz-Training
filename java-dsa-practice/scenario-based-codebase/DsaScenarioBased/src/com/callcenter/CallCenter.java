package com.callcenter;

import java.util.Queue;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class CallCenter {

	// Normal customers
	Queue<Customer> normalQueue = new LinkedList<>();

	// VIP customers
	PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> 0);

	// Stores how many times each customer called
	HashMap<String, Integer> callCount = new HashMap<>();

	// Add a customer call
	public void addCall(Customer c) {

		// Put customer in correct queue
		if (c.vip) {
			vipQueue.add(c);
		} else {
			normalQueue.add(c);
		}

		// Increase call count
		if (callCount.containsKey(c.id)) {
			callCount.put(c.id, callCount.get(c.id) + 1);
		} else {
			callCount.put(c.id, 1);
		}

		System.out.println(c.name + " added to queue");
	}

	// Serve next customer
	public void serveNext() {

		if (!vipQueue.isEmpty()) {
			Customer c = vipQueue.poll();
			System.out.println("Serving VIP: " + c.name);
		} else if (!normalQueue.isEmpty()) {
			Customer c = normalQueue.poll();
			System.out.println("Serving: " + c.name);
		} else {
			System.out.println("No customers waiting");
		}
	}

	// Show how many times customer called
	public void showCallCount(String id) {
		System.out.println("Customer " + id + " called " + callCount.getOrDefault(id, 0) + " times");
	}
}
