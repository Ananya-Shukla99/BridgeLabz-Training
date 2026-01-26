package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

    public static void main(String[] args) {

        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        String regex = "\\d{2}/\\d{2}/\\d{4}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Dates:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

