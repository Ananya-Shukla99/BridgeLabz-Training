//a program to convert the complete text to uppercase and compare the results

import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert using ASCII
	
    static String convertToUpper(String text) {
        String result="";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // ASCII conversion
            }

            result = result + ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        //create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();
        String manualUpper = convertToUpper(input);

        // printing results
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Uppercase using user-defined method: " + manualUpper);

        // Compare both
        boolean isSame = compareStrings(builtInUpper, manualUpper);

        System.out.println("Are both results equal? " + isSame);

        sc.close();
    }
}
