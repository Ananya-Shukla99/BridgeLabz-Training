//a program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class LowerCaseCompare {

    // method to convert string to lowercase 
    static String convertToLower(String text) {
        String result = "";

        for (int i=0;i<text.length();i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch =(char)(ch + 32); 
            }

            result = result + ch;
        }
        return result;
    }

    // method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length()!=s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        // Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String builtInLower = input.toLowerCase();

        String manualLower = convertToLower(input);

        // display results
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Lowercase using user-defined method: " + manualLower);

        // compare both strings
        boolean isSame = compareStrings(builtInLower, manualLower);

        System.out.println("Are both results equal? " + isSame);

        sc.close();
    }
}
