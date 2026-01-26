package com.regex;

import java.util.regex.*;

public class ValidateSSN {
	public static void main(String[] args) {
		String[] examples = { "123-45-6789", "123456789", "My SSN is 987-65-4321." };

		String ssnPattern = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
		Pattern pattern = Pattern.compile(ssnPattern);

		for (String text : examples) {
			Matcher matcher = pattern.matcher(text);
			if (matcher.find()) {
				System.out.println(" \"" + matcher.group() + "\" is valid");
			} else {
				System.out.println(" \"" + text + "\" is invalid");
			}
		}
	}
}

