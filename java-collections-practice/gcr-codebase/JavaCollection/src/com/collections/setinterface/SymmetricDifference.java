package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

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

		Set<Integer> difference = new HashSet<>(set1);

		difference.addAll(set2);

		Set<Integer> intersection = new HashSet<>(set1);

		intersection.retainAll(set2);

		difference.removeAll(intersection);

		System.out.println(difference);
	}
}
