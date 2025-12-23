//a program to split the text into words and find the shortest and longest strings in a given text
import java.util.*;

public class ShortestLongestString
{
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

    // Split text 
    static String[] customSplit(String text) {
		
        int len = findLength(text);
        int count = 1;

        for (int i = 0; i < len; i++){
            if (text.charAt(i) == ' '){
                
				count++;
			}
        }
		
        String[] words = new String[count];
        int start = 0, index = 0;

        for (int i = 0; i < len; i++) 
		{
            if (text.charAt(i) == ' ') 
			{
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, len);

        return words;
    }

    // Create 2D array of word and its length
    static String[][] wordLength(String[] words) 
	{
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Find shortest and longest word indexes
    static int[] findShortestLongest(String[][] data) 
	{
        int min = Integer.parseInt(data[0][1]);
        int max = min;
        int minIndex = 0, maxIndex = 0;


        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] wordData = wordLength(words);
        int[] result = findShortestLongest(wordData);

        System.out.println("Shortest word: " + wordData[result[0]][0]);
        System.out.println("Longest word: " + wordData[result[1]][0]);
		
		sc.close();
	}
	
}