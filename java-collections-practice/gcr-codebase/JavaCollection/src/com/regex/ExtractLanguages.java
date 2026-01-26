package com.regex;

import java.util.*;
import java.util.regex.*;

public class ExtractLanguages {
	
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = {"Python", "Java", "JavaScript", "Go"};

        String patternString = "\\b(" + String.join("|", languages) + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        Set<String> matches = new LinkedHashSet<>();
        while (matcher.find()) {
            matches.add(matcher.group());
        }

        // Print result
        System.out.println(String.join(", ", matches));
    }
}
