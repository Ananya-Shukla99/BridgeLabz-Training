package com.techNova;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Encryption {

	public static String encrypt(String input) {

		input = input.toUpperCase();

		Map<Character, Long> mp = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		// System.out.println(mp);
		String even ="";
		String odd = "";
		int count=0;
		for (Character c : mp.keySet()) {
			if (mp.get(c) % 2 == 0) {
				even += c;
			} else {
				odd += c;
			}
			if(mp.get(c)==1) {
				count++;
			}
			
		}
		
		String result=even+odd;
		for(Map.Entry<Character, Long> entry :mp.entrySet()) {
			
			char c= entry.getKey();
			long rem= entry.getValue()-1;
			
			for(int i=0;i<rem;i++) {
				result+=c;
			}
			
		}
		
		if(result.length()%2!=0) {
			
			String st=result.substring(0,(result.length()/2)+1);
			String ed=result.substring((result.length()/2)+
					1,result.length());
			result= st+count+ed;
		}
		
		
		else {
			String st=result.substring(0,result.length()/2);
			String ed=result.substring(result.length()/2,result.length());
			result= st+count+ed;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");

		
		String input = sc.next();
		sc.close();
		String regex = "^[A-Za-z]+$";
		try {
			input.matches(regex);
			String hello=encrypt(input);
			
			System.out.println(hello);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		
	}
}
