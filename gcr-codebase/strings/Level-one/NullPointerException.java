//Method to demonstrate NullPointerException
import java.util.*;

public class NullException{
	
	//method to generate Exception
	static void generateException(){
		String text =null;
		Sytem.out.println(text.length());
	}
	
	//method to handle Exception
	static void handleException(){
		String text=null;
		
		try{
			System.out.println(text.length());
		}catch(NullPointerException e){
			System.out.prinln("NullPointerException handled");
			System.out.prinln(e);
		}
	}
	public static void main(String[]args){
		System.out.println("Generate Exception: ");
		
		try{
			generateException();
		}catch(NullPointerException e){
		    System.out.println("Exception caught in main");
		}
	}
	System.out.println("Handling Exception");
	handleException();
}