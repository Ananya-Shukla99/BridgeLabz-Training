package com.hashmaps;

import java.util.*;

public class ZeroSumSubarray {

	public static void ZeroSum(int []arr) {
		
		HashMap<Integer, List<Integer>> mp=new HashMap<>();
		
		mp.put(0, new ArrayList<>());
		mp.get(0).add(-1);
		
	    int currSum=0;
		for(int i=0;i<arr.length; i++) {
			
			currSum+=arr[i];
			
			if(mp.containsKey(currSum)) {
				List<Integer> previous=mp.get(currSum);
				
				for(int index:previous) {
					System.out.println("Subarray with sum zero is indexed from : "+ (index+1) +" To "+ i);
				}
			}
			
			mp.putIfAbsent(currSum, new ArrayList<>());
			mp.get(currSum).add(i);
		}
	}
	
	public static void main(String []args) {
		
		int []arr= {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		
	    ZeroSum(arr);
		
	}
}
