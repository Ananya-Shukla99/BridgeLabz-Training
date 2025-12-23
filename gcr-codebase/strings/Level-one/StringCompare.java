// program to compare two strings using the charAt() method and equals
import java.util.Scanner;

public class StringCompare{

    //method to compare strings using charAt
	public static boolean compareChar(String s1, String s2){
	
	    if(s1.length() != s2.length()){
		    return false;
		}
	    for(int i=0;i<s1.length(); i++){
		
		    if(s1.charAt(i)!=s2.charAt(i)){
			    return false;
			}
		}
		return true;
	}
	
	//method to compare strings equals()
	public static boolean compareEquals(String s1, String s2){
	
	    return s1.equals(s2);
	
	}
	public static void main(String[]args){
	
		//Creat the Scanner object
		Scanner sc=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Input string 1");
		String s1=sc.next();
		System.out.println("Input string s2");
		String s2=sc.next();
		
		//Calling the methods
		boolean ans1=compareChar(s1, s2);
		boolean ans2=compareEquals(s1, s2);
		
	    //Printing the result
		if((ans1 == ans2)&& !ans1){
		    System.out.println("both results are same and false");
		}
		if((ans1 == ans2)&& ans1){
		    System.out.println("both results are same and True");
		}
		
		sc.close();
	}
}