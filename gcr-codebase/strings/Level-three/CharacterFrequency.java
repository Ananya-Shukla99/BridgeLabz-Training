//a program to find the frequency of characters in a string
import java.util.Scanner;

public class CharacterFrequency {

    // method to find frequency
    public static int[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] result = new int[uniqueCount][2];

        // Store character and frequency
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;             
                result[index][1] = frequency[i];  
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[][] frequencyResult = findCharacterFrequency(input);

        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencyResult.length; i++) {
		
            System.out.println((char) frequencyResult[i][0] + " -> " + frequencyResult[i][1]);
        }

        sc.close();
    }
}
