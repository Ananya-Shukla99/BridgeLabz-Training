package com.solve;

import java.util.Scanner;

public class Main{

	public static boolean checkString(String str)throws InvalidRegexException{

		String regex="^[A-Z]{2}[a-z]{2}+@[2-9][0]{3}$";
		
		if(str.matches(regex)){
			return true;
		}else{
			throw new InvalidRegexException("Invalid Regex");
		}
	}
	public static void main(String[]args){
		
		Scanner sc= new Scanner(System.in);
		
		String s=sc.next();
		
		sc.close();
		try{
			checkString(s);
		}catch( InvalidRegexException e){
			
			System.out.println(e.getMessage());
		
		}
	
	}

}

