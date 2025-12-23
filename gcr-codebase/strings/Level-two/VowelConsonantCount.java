// a program to find vowels and consonants in a string and 
//display the count of  Vowels and Consonants in the string
import java.util.Scanner;

public class VowelConsonantCount {

    // method to check vowel or consonant
    static String checkChar(char ch) {

        //uppercase to lowercase 
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // method to count vowels and consonants
    static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = str.charAt(i);

                if (result.equals("Vowel"))
                    vowels++;
                else if (result.equals("Consonant"))
                    consonants++;
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) { 
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsConsonants(input);

        System.out.println("Vowels count:" + result[0]);
        System.out.println("Consonants count:" + result[1]);
		
		sc.close();
    }
}
 