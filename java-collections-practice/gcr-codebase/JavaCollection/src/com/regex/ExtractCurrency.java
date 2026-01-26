package com.regex;

import java.util.*;
import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        String patternString = "\\$?\\d+\\.\\d+";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }

        // Print result
        System.out.println(String.join(", ", matches));
    }
}
