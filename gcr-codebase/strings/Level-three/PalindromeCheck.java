import java.util.Scanner;

public class PalindromeCheck {

    // method to check palindrome method 1
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method 
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // method to reverse 
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reverse = new char[length];

        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }
        return reverse;
    }

    // method to check palindrome 
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);

        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);

        boolean result3 = isPalindromeUsingArray(input);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Logic 1 Iterative : " + result1);
        System.out.println("Logic 2 Recursive : " + result2);
        System.out.println("Logic 3 Character Array : " + result3);

        //closing the sc
        sc.close();
    }
}
