//a program to find the frequency of characters in a string 
import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {

    // method to find unique characters
    public static char[] uniqueCharacters(String text) {

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // method to find frequency 
    public static String[][] characterFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        // Store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
		
            result[i][0] = String.valueOf(uniqueChars[i]);
			
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string ");
        String input = sc.nextLine();

        String[][] output = characterFrequency(input);

        System.out.println("Character Frequency:");
		
        for (int i = 0; i < output.length; i++) {
		
            System.out.println(output[i][0] + "  " + output[i][1]);
        }
        
		//close Scanner object
        sc.close();
    }
}
