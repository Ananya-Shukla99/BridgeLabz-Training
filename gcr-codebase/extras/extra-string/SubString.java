//program to find substring occurance

import java.util.*;
public class SubString {
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next(); 
		System.out.println("Enter the sub string : ");
		String sub= sc.next(); 
		System.out.println(countOccurrences(text, sub));
    }

    public static int countOccurrences(String s, String sub) {
        int count=0;
		int index=0;
		while((index=s.indexOf(sub, index))!=-1){
		    count++;
			index=index+sub.length();
		}
		return count;
    }
}