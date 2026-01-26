package com.testing;

public class StringUtils {

	public static String reverse(String s) {
       
		if(s==null)return null;
		String reversed="";
		for(int i=s.length()-1; i>=0; i--) {
			reversed+=s.charAt(i);
		}
		return reversed;
	}
	
	public static boolean isPalindrome(String s) {
		if(s==null)return false;
		String reversed= reverse(s);
		return s.equals(reversed);
	}
	
	public static String toUpperCase(String s) {
		if(s==null)return null;
		return s.toUpperCase();
	}
}
