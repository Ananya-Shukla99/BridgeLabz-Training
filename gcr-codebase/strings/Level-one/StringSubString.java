// program to compare two strings using the charAt() method and substr()
import java.util.Scanner;

public class StringSubString{

    //method to compare strings using charAt
	public static String compareChar(String s, int start ,int end){
	
	    String sub="";
	    for(int i=s;i<=e; i++){
		
		    sub+=(s.charAt(i));
			 
		}
		return sub;
	}
	
	//method to compare strings equals()
	public static String usingSubString(String s,int start, int end ){
	
	    return s.substing(start, end);
	
	}
	public static void main(String[]args){
	
		//Creat the Scanner object
		Scanner sc=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Input string ");
		String s=sc.next();
		System.out.println("Input starting index :");
		String start=sc.next();
		System.out.println("Input ending index :");
		String end=sc.next();
		
		//Calling the methods
		String subString1 =compareChar(s, start, end);
		String subString2=usingSubString(s, start, end);
		
	    //Printing the result
		if((usingSubString)&&(compareChar)){
		    System.out.println("Both resuls are equals");
		}
		if((ans1 == ans2)&& ans1){
		    System.out.println("Both resuls are not equals");
		}
		
		sc.close();
	}
}