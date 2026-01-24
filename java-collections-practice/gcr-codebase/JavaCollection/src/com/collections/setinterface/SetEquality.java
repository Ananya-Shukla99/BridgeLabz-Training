package com.collections.setinterface;

import java.util.Set;
import java.util.HashSet;

public class SetEquality {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);

		Set<Integer> set2 = new HashSet<>();

		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);

		System.out.println("Set1 is equal ot set2 : " + set1.equals(set2));
	}

}
