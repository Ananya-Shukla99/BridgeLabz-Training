// a program to trim the leading and trailing spaces from a string using the charAt() method 
import java.util.*;

public class RemoveSpacesUsingCharAt{
	
	//method to remove spaces and return start and end
	public static int [] findtheIndexes(String s){
		
		int start=0;
		int end=0;
		
		int len=0;
		try{
			while(true){
				s.charAt(len);
				len++;
			}
		}
		catch(Exception e){
			
		}
		
		while(start<len && s.charAt(start)==' '){
			start++;
		}
		
		end  =len -1;
		while(end>=0 && s.charAt(end)==' '){
			end--;
		}
		
		return new int[]{start,end};
	}
	
	//method for substring
	public static String subString(String s, int start, int end){
		
		String results="";
		
		for(int i=start; i<=end ; i++){
			result +=s.charAt(i);
		}
		return result;
	}
	
	public static boolean comparestring(String s, String t){
		int i=0;
		
		try{
			while(true){
				if(s.charAt(i)!=t.charAt(i)){
					return false;
				}
				i++;
			}
		}
		catch(Exception e){
			
		}
		try {
            s.charAt(i);
            return false;
        } catch (Exception e) {
        }

        try {
            t.charAt(i);
            return false;
        } catch (Exception e) {
        }

        return true;
	}
	public static void main(String[] args)
	{
		//create scanner object
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.println("Enter a string ");
        String input = sc.nextLine();

        // method call
        int[] indexes = findTrimIndexes(input);
        String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

        // Built-in trim for comparison
        String builtInTrimmed = input.trim();

        // compare results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // display results
        System.out.println("\nCustom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both strings equal? " + isSame);

        sc.close();
}