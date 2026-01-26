package com.regex;

import java.util.regex.Pattern;

public class ValidateUsername {

	public static void main(String[] args) {
        String[] usernames = {"suman_123", "999Ravi", "us", "aman789p"};

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        for (String username : usernames) {
            if (Pattern.matches(regex, username)) {
                System.out.println(username + " → Valid");
            } else {
                System.out.println(username + " → Invalid");
            }
        }
    }
}
