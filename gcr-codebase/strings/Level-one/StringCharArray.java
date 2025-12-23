// program to compare two strings using the charAt() method and CharArray()
import java.util.Scanner;

public class StringCharArray{

    //method to store in char array
	public static char[] storeInArray(String s){
	
	    char [] arr=new char[s.length()];
		
	    for(int i=0;i<=s.length(); i++){
		
		    arr[i]=(s.charAt(i));
			 
		}
		return arr;
	}
	
	//method to use charArray
	public static char[] usingCharArray(String s ){
	
	    char []arr=new char[s.length()];
	    arr=s.toCharArray();

		return arr;
	
	}
	//method to compare to methods
	public static boolean compareMethods(char[]arr , char[]brr){
		
		for(int i=0;i<arr.length(); i++){
			if(arr.charAt(i)!=brr.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args){
	
		//Creat the Scanner object
		Scanner sc=new Scanner(System.in);
		
		//Taking user input
		System.out.println("Input string ");
		String s=sc.next();
		
		//Calling the methods
		char []arr =storeInArray(s);
		char []brr=usingCharArray(s);
	    boolean flag=compareMethods(arr ,brr);
		
	    //Printing the result
		if(flag){
		    System.out.println("Both resuls are equals");
		}
		else{
		    System.out.println("Both resuls are not equals");
		}
		
		sc.close();
	}
}