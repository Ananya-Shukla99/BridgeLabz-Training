//program to remove character

import java.util.*;
public class RemoveChar {
    public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next(); 
		System.out.println("Enter the character : ");
		char c= sc.next(); 
		
		String result=s.replace(String.valueOf(c), "");
		System.out.println(result);
    }

}