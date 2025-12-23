// a program to trim the leading and trailing spaces from a string
import java.util.Scanner;

public class CustomTrim 
{
    // method to find start and end index
    public static int[] findTrimIndexes(String s) {
        int start = 0, end = 0;

        // find staring & end
        try {
            while (true) {
                s.charAt(end);
                end++;
            }
        } catch (Exception e) {
            end--;
        }

        // trim leading spaces
        while (s.charAt(start) == ' '){
            start++;}

        // trim trailing spaces
        while (s.charAt(end) == ' ')
		{
            end--;
		}

        return new int[]{start, end};
    }

    // create substring using charAt()
    public static String customSubstring(String s, int start, int end) {
	
        String result = "";
        for(int i = start; i <= end; i++){
            result = result + s.charAt(i);
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String a, String b) {
        int i = 0;
        try {
            while (true) {
                if (a.charAt(i) != b.charAt(i))
                    return false;
                i++;
            }
        } catch (Exception e) {
            // End of both strings
        }

        // Check if both end at same time
        try {
            a.charAt(i);
            return false;
        } catch (Exception e) {}

        try {
            b.charAt(i);
            return false;
        } catch (Exception e) {}

        return true;
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrimmed = customSubstring(input, indexes[0], indexes[1]);

        String builtInTrimmed = input.trim();

        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("Custom trimmed text: " + customTrimmed );
        System.out.println("Built-in trimmed text: " + builtInTrimmed);
        System.out.println("Both results are same? " + isSame);
		
		sc.close();
    }
}
