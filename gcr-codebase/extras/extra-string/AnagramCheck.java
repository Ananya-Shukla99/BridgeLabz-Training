//program to check anagramsm

public class AnagramCheck  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next();  
		System.out.println("Enter the string : ");
		String t= sc.next();  
	    
        System.out.println(areAnagrams(s , t));
    }

    static boolean areAnagrams(String s, String t) {
        return s.length() == t.length() && 
               Arrays.equals(
                   str1.chars().sorted().toArray(), 
                   str2.chars().sorted().toArray()
               );
    }
}
