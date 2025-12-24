//program to Toggle Case 

import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next(); 
		 
		System.out.println(toggle(s));
    }

    public static String toggle(String s) {
	
	    String result="";
		for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
            result += Character.toLowerCase(ch);
        } 
		else if (Character.isLowerCase(ch)) {
            result += Character.toUpperCase(ch);
        }
        
		return result;
    }
}