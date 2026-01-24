package com.collections.listinterface;

import java.util.*;

public class RotateElement {

	public static void main(String[] args) {

		// creating the list
		List<Integer> list = new ArrayList<>();

		// adding the elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int n = list.size();

		// before rotating
		System.out.println(list);

		System.out.println("Enter the number to rotate element : ");

		// Creating Scanner object
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		x=x%n;
		
		List<Integer> result = new ArrayList<>();

		result.addAll(list.subList(x, n));
		result.addAll(list.subList(0, x));

		System.out.println("Rotated list : " + result);

		sc.close();
	}
}
