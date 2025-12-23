// program to find and return the length of a string
import java.util.Scanner;

public class StringLength{
	
	//method to calculate length manually
	public static int lengthManually(String s){
		
		int lenCount=0;
		try{
			while(true){
				s.charAt(lenCount);
				lenCount++;
			}
		}
		catch(StringIndexOutOfBoundsException e){
			
		}
		
		return lenCount;
	}
	
	public static void main(String[]agrs){
		
		//Taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		
		int length=s.length();
		int length2=lengthManually(s);
		
		//printing the output 
		//comparing the results
		if(length==length2){
			System.out.println("Both the methods work same and the length is :"+ length);
		}
		else{
		    System.out.println("Both the methods do not work the same and the correct length is :"+ length);
		}
		
		sc.close();
	}
}