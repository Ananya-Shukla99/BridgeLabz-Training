package com.collections.queueinterface;

import java.util.*;

public class CircularBuffer {
	// attribute
	Queue<Integer> buffer;
	int bufferSize = 3;

	public CircularBuffer() {

		buffer = new LinkedList<>();
	}

	public void addElement(int x) {

		if (buffer.size() == bufferSize) {

			System.out.println("Removed an element : " + buffer.poll());
			buffer.add(x);
			System.out.println("Added a element : " + x);
		} else {
			buffer.add(x);
			System.out.println("Added a element : " + x);
		}

	}

	public static void main(String[] agrs) {

		CircularBuffer buffer = new CircularBuffer();

		buffer.addElement(1);
		buffer.addElement(2);
		buffer.addElement(3);
		buffer.addElement(4);
		buffer.addElement(5);
	}
}
