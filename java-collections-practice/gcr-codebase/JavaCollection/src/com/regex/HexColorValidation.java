package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexColorValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hex color code:");
        String colorCode = sc.nextLine();

        
        String regex = "^#[A-Fa-f0-9]{6}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(colorCode);

        if (matcher.matches()) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }

        sc.close();
    }
}

