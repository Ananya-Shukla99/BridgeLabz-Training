package com.collections.setinterface;

import java.util.*;

public class UnionAndInsertion {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set<Integer> set2 = new HashSet<>();

		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);

		List<Integer> union = new ArrayList<>();
		List<Integer> insertion = new ArrayList<>();

		for (Integer num : set1) {
			if (set2.contains(num)) {
				insertion.add(num);
			}
			union.add(num);
		}

		for (Integer num : set2) {
			if (!set1.contains(num)) {
				union.add(num);
			}
		}

		System.out.println("Union of sets : " + union);
		System.out.println("Insertion of sets : " + insertion);
	}
}
