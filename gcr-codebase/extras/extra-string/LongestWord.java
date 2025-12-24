//program to find longest word

import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next();       
		System.out.println(findLongestWord(sentence));
    }

    public static String findLongestWord(String s) {
        
		String []words=s.spilt(" ");
		String longest="";
		for(String word:words){
		
		    if(word.length()>longest.length()){
			
			    longet =word;
			}
		}
		return longest;
    }
}