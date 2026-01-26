package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card number:");
        String cardNumber = sc.nextLine();

        //A Visa card number starts with 4 and has 16 digits.
        String visaRegex = "^4[0-9]{15}$";
        //A MasterCard starts with 5 and has 16 digits.
        String masterRegex = "^5[0-9]{15}$";

        Pattern visaPattern = Pattern.compile(visaRegex);
        Pattern masterPattern = Pattern.compile(masterRegex);

        Matcher visaMatcher = visaPattern.matcher(cardNumber);
        Matcher masterMatcher = masterPattern.matcher(cardNumber);

        if (visaMatcher.matches()) {
            System.out.println("Valid Visa Card Number");
        } else if (masterMatcher.matches()) {
            System.out.println("Valid MasterCard Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }

        sc.close();
    }
}
