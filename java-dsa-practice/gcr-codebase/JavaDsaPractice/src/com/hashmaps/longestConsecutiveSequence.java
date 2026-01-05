package com.hashmaps;

import java.util.*;

public class longestConsecutiveSequence {

	public static int longestSequence(int []arr) {
		
		HashMap<Integer, Boolean> mp=new HashMap<>();
		
		for(int num:arr) {
			mp.put(num, true);
		}
		
		int longest=0;
		
		for(int  num:arr) {
			
			if(!mp.containsKey(num-1)) {
				
				int curr=num;
				int count=1;
				
				while(mp.containsKey(curr+1)) {
					curr++;
					count++;
				}
				
				longest=Math.max(count, longest);
			}
		}
		return longest;
	}
	
	//main method
	public static void main(String[]args) {
		
		 int[] arr = {100, 4, 200, 1, 3, 2};
		 
	     System.out.println(longestSequence(arr));
	}
}
