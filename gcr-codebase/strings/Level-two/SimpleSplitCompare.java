// program to find and return the length of a string

import java.util.Scanner;

public class SimpleSplitCompare {

    // find length
    static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {}
        return i;
    }

    // Split string manually
    static String[] customSplit(String s) {
        int len = findLength(s);
        int words = 1;

        for (int i = 0; i < len; i++){
            if (s.charAt(i) == ' '){
                words++;
			}
        }
		
        String[] result = new String[words];
		
        int start = 0, index = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                result[index++] = s.substring(start, i);
                start = i + 1;
            }
        }
        result[index] = s.substring(start, len);

        return result;
    }

    // Compare arrays
    static boolean compare(String[] a, String[] b) {
	
        if (a.length != b.length) {
		    return false;
		}
        for (int i = 0; i < a.length; i++){
            if (!a[i].equals(b[i])) {
			
			    return false;
		    }
		}
        return true;
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Same result? " + compare(custom, builtIn));
    }
}
