package com.reviewManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReviewAnalyzer {

	public static List<Review> ReviewList=new ArrayList<>();
	
	public void addReview(Review r) {
		ReviewList.add(r);
		
		System.out.println("Add the review to ReviewBoard");
	}
	
	public String formatMessage(String msg) {
		
		if(msg.length()>12) {
			
			msg= msg.toLowerCase();
			StringBuffer sb= new StringBuffer(msg);
			sb= sb.reverse();
			for(int i=0;i<sb.length();i++) {
				
				char c= sb.charAt(i);
				if(!Character.isWhitespace(c)) {
					if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') {
						sb.setCharAt(i, '#');
					}
				}
			}
			String result= new String (sb);
			return result;
		}
		else {
			return msg.toUpperCase();
		}
		
	}
	
	
	public Map<String , Integer> countCharacter(String message){
		
		message= message.toLowerCase();
		Map<String , Integer>map= new HashMap<>();
		
		int vowel=0;
		int consonant=0;
		
		for(int i=0;i<message.length();i++) {
			
			char c= message.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
					vowel++;
				}
				else {
					consonant++;
				}
			}
			
		}
		map.put("Vowels", vowel);
		map.put("Consonant", consonant);
		return map;
	}
	
	public List<String> getTopReviewers(int limit){
		List<String>list= new ArrayList<>();
		
		for(Review r:ReviewList) {
			
			Map<String, Integer> map=countCharacter(r.message);
			
			if(map.get("Vowels")>=limit) {
				list.add(r.userName);
			}
		}
		return list;
	}
}
