package com.collections.listinterface;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class FindElement {

	// To find the nth element from the end
	public static void main(String[] args) {

		// creating list object
		List<Character> list = new LinkedList<>();

		// adding elements
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');

		int first = 0;
		int second = 0;

		System.out.println("Enter the nth position from last : ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			first++;
		}

		// Moving both the pointers
		while (first < list.size()) {
			first++;
			second++;
		}

		System.out.println(list.get(second));

		sc.close();
	}
}
