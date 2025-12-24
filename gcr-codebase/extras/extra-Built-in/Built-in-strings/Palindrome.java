// a program to check palindrome
import java.util.*;

public class Palindrome{
	
	public static boolean palindromeCheck(s){
		
		int start=0;
		int end=s.length()-1;
		while(start<=end){
		    
			if(s.charAt(start)!=s.charAt(end)){
			    return false;
			}
		    start ++;
			end--;
		}
		return true;
	}
	
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s= sc.next();
		
		int ans=1;
		//calling the function
		boolean falg=palindrome(s);
		
		if(flag){
		    System.out.println("String is palindrome");
		}
		
		else{
		    System.out.println("This is not palindrome");
		}
		sc.close();
	}
	
}