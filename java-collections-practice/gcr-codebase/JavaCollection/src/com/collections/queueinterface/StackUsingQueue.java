package com.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	protected Queue<Integer> q1;
	protected Queue<Integer> q2;

	public StackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();

	}

	// Push element into stack
	public void push(int x) {

		q2.add(x);

		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// Removing elements
	public int pop() {
		if (!q1.isEmpty()) {
			return q1.remove();
		} else {
			throw new RuntimeException("Stack is empty");
		}
	}

	// Get the top element
	public int top() {
		if (!q1.isEmpty()) {
			return q1.peek();
		} else {
			throw new RuntimeException("Stack is empty");
		}
	}

	// check empty
	public boolean isEmpty() {
		return q1.isEmpty();
	}

	public static void main(String[] args) {

		StackUsingQueue stack = new StackUsingQueue();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Pop the elements : " + stack.pop());

		System.out.println("Check if empty : " + stack.isEmpty());

		System.out.println("Top element of stack : " + stack.top());
	}
}
