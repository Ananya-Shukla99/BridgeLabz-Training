package com.regex;

public class CensorBadWords {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            String regex = "\\b" + word + "\\b";
            text = text.replaceAll(regex, "****");
        }

        System.out.println("Censored Sentence:");
        System.out.println(text);
    }
}
