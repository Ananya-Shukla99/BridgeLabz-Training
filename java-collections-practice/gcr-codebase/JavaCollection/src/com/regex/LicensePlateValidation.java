package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter license plate number:");
        String plateNumber = sc.nextLine();

        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plateNumber);

        if (matcher.matches()) {
            System.out.println("Valid License Plate Number");
        } else {
            System.out.println("Invalid License Plate Number");
        }

        sc.close();
    }
}
