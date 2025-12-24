//remove dupliate 

import java.util.*;
public class RemoveDuplicates 
{
    public static void main(String[] args) {
	    
        Scanner sc=new Scanner (System.in);
		String s=sc.next();
		
        String output = removeDuplicates(input);
        System.out.println(output); 
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
