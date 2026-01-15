package com.trafficmanager;

import java.util.*;

public class TrafficManager {

	// Queue for waiting vehicles
	Queue<String> waitingQueue = new LinkedList<>();

	int MAX_QUEUE_SIZE = 5;

	// Circular Linked List (Roundabout)
	Vehicle head = null;

	// Add vehicle to waiting queue
	public void addToQueue(String vehicleNo) {
		if (waitingQueue.size() == MAX_QUEUE_SIZE) {
			System.out.println("Queue Overflow! " + vehicleNo + " cannot enter.");
		} else {
			waitingQueue.add(vehicleNo);
			System.out.println(vehicleNo + " added to waiting queue.");
		}
	}
                 
	// Move vehicle from queue to roundabout
	public void enterRoundabout() {
		if (waitingQueue.isEmpty()) {
			System.out.println("Queue Underflow! No vehicles waiting.");
			return;
		}

		String vehicleNo = waitingQueue.poll();
		Vehicle newVehicle = new Vehicle(vehicleNo);

		// If roundabout is empty
		if (head == null) {
			head = newVehicle;
			newVehicle.next = head;
		}
		// Otherwise insert at end
		else {
			Vehicle temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newVehicle;
			newVehicle.next = head;
		}

		System.out.println(vehicleNo + " entered the roundabout.");
	}

	// Remove a vehicle from roundabout
	public void exitRoundabout(String vehicleNo) {
		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		Vehicle curr = head;
		Vehicle prev = null;

		do {
			if (curr.number.equals(vehicleNo)) {

				// If only one vehicle
				if (curr == head && curr.next == head) {
					head = null;
				}
				// If removing head
				else if (curr == head) {
					Vehicle last = head;
					while (last.next != head) {
						last = last.next;
					}
					head = head.next;
					last.next = head;
				}
				// If removing middle or last
				else {
					prev.next = curr.next;
				}

				System.out.println(vehicleNo + " exited the roundabout.");
				return;
			}

			prev = curr;
			curr = curr.next;

		} while (curr != head);

		System.out.println(vehicleNo + " not found in roundabout.");
	}

	// Print roundabout
	public void printRoundabout() {
		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		Vehicle temp = head;
		System.out.print("Roundabout: ");

		do {
			System.out.print(temp.number + " -> ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to start)");
	}
}
