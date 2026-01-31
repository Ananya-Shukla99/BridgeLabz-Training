package com.functionalInterface.stringlength;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hey! Are you free this evening?",
				"Don’t forget about our meeting at 4 PM today", "Sorry for the late reply", "Thanks a lot",
				"I really appreciate it");

		LengthCheck find = (s) -> s.length();

		int charLimit = 15;

		System.out.println("String Length Checker ");
		for (String s : list) {

			if (find.limit(s) > charLimit) {
				System.out.println(s + " -> message exceeds character limit ");
			} else {
				System.out.println(s + " ->  message do not exceeds character limit");
			}
		}

	}

}
