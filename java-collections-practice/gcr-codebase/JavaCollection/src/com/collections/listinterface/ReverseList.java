package com.collections.listinterface;

import java.util.*;

public class ReverseList {

	public static void main(String[] args) {

		// creating array list
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("List : " + list);

		// second list to store reversed order
		List<Integer> list2 = new ArrayList<>();

		for (int i = list.size() - 1; i >= 0; i--) {
			list2.add(list.get(i));
		}

		System.out.println("Reversed list : " + list2);
	}
}
