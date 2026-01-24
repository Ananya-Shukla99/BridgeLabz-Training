package com.collections.setinterface;

import java.util.*;

public class SetToSortedList {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();

		s.add(3);
		s.add(40);
		s.add(30);
		s.add(92);
		s.add(52);

		System.out.println("Set : " + s);
		List<Integer> list = new ArrayList<>(s);

		System.out.println("list : " + list);

		Collections.sort(list);

		System.out.println("Sorted list :" + list);

	}
}
