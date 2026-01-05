package com.hashmaps;

import java.util.*;

public class PairSum {

	public static boolean findPair(int []arr, int target) {
		
		//creating HashMap 
        HashMap<Integer, Integer> mp=new HashMap<>();
        
        boolean found = false;
        //iterating loop to find pair
        for(int i=0;i<arr.length; i++) {
        	int curr=arr[i];
        	int required=target-curr;
        	
        	if(mp.containsKey(required)) {
        		System.out.println("The pair found at : "+curr+" : "+ required);
        	    found=true;
        	}
        	
        	mp.put(curr, i);
        	
        }
        return found;
	}
	
	//main method 
	public static void main(String []args) {
		
		int[]arr= {2,3,4,1,0,5, 9,2,0};
		
		int target=5;
		
		if(!findPair(arr, target)) {
			System.out.println("No pair found ");
		}
		
	}
}
