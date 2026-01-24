package com.collections.setinterface;

import java.util.*;

public class FindSubsets {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();

		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		s1.add(7);

		Set<Integer> s2 = new HashSet<>();

		s2.add(44);
		s2.add(7);

		if (!s1.containsAll(s2)) {
			System.out.println("Set2 is not a subset of set1");
			return;
		} else {
			System.out.println("Set2 is subset of set1");
		}

	}
}
