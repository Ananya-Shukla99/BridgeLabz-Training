//program to MostFrequentChar

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next();  
	    
        System.out.println(findFrequentChar(str));
    }

    static char findFrequentChar(String str) {
        int[] freq = new int[256];  
        
        // Count frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;   
        }

        int maxCount = 0;
        char mostFrequent = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (freq[current] > maxCount) {
                maxCount = freq[current];
                mostFrequent = current;
            }
        }
        return mostFrequent;
    }
}
