package com.collections.listinterface;

import java.util.List;
import java.util.LinkedList;

public class ReverseUsingLinkedList {

	public static void main(String[] args) {

		// creating a linked list
		List<Integer> list = new LinkedList<>();

		// adding elements
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("List : " + list);

		// reversed list
		List<Integer> reversed = new LinkedList<>();

		for (int e : list) {
			reversed.addFirst(e);
		}

		System.out.println("Reversed list : " + reversed);
	}
}
