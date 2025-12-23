//Write a program to split the text into words and return the words along with their lengths in a 2D array
import java.util.Scanner;

public class WordLength2DArray {

    // method to find length of a string 
    public static int findLength(String s) {
	
        int count = 0;
        try {
            while (true) {
			
                s.charAt(count);
				
                count++;
            }
        } 
		catch (Exception e) {
           
        }
        return count;
    }

    // method to split text into words 
	
    public static String[] splitWords(String text) 
	{
	
        int wordCount = 0;
		
        boolean inWord = false;

        // Count words
        for (int i = 0; i < findLength(text); i++)
		{
            if (text.charAt(i) != ' ' && !inWord)
			{
                wordCount++;
				
                inWord = true;
				
            } 
			else if (text.charAt(i) == ' ') 
			{
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
		
        int index = 0;
		
        String word = "";

        // Extract words
        for (int i = 0; i < findLength(text); i++) 
		{
            if (text.charAt(i) != ' ')
			{
                word += text.charAt(i);
            } 
			else if (!word.equals("")) 
			{
                words[index++] = word;
                word = "";
            }
        }

        if (!word.equals("")) 
		{
            words[index] = word;
        }

        return words;
    }

    // method to create 2D array of word and its length
	
    public static String[][] wordLengthArray(String[] words)
	{
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++)
		{
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) 
{

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // method calls
        String[] words = splitWords(input);
        String[][] result = wordLengthArray(words);

        // Display output
        System.out.println("Word    Length");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "    " + length);
        }

        sc.close();
    }
}
