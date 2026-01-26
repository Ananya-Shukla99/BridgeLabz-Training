package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWordsExtractor {

    public static void main(String[] args) {

        String sentence = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Capitalized Words:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
