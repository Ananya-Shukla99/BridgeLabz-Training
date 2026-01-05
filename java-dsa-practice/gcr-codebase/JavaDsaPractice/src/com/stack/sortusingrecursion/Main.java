package com.stack.sortusingrecursion;

import java.util.Stack;

public class Main {

	 public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();

	        stack.push(30);
	        stack.push(10);
	        stack.push(20);
	        stack.push(5);

	        System.out.println("Original Stack: " + stack);

	        RecursiveStack.sortStack(stack);

	        System.out.println("Sorted Stack (Ascending): " + stack);
	    }
}
