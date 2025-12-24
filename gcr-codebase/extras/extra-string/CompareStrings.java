//compare two string

import java.util.*;

public class CompareStrings{
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next(); 
		System.out.println("Enter the string : ");
		String t= sc.next(); 
	    
		int result=s.compareTo(t);
		
		if(result==0){
		    System.out.println("Both String are equal");
		}
		else if (result < 0) {
            System.out.println(s1 + " comes before " + s2);
        } 
		else {
            System.out.println(s1 + " comes after " + s2);
        }
    }

    
}