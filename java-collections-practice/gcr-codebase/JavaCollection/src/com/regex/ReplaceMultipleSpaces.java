package com.regex;

public class ReplaceMultipleSpaces {

    public static void main(String[] args) {

        String text = "This   is    an example   with   multiple     spaces.";

        String regex = "\\s+";

        String result = text.replaceAll(regex, " ");

        System.out.println("Original Text:");
        System.out.println(text);

        System.out.println("Modified Text:");
        System.out.println(result);
    }
}

