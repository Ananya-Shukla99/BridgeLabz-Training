package com.sortingalgorithms.tailorshop;

import java.util.List;

public class TailorShop {

	//attributes
	public String name;
	protected List<Integer> list;
	
	public static void instertionSort(Order[] orders , Order newOrder) {
		
		for(int i=1;i< orders.length; i++) {
			
			Order key= orders[i];
			int j=i-1;
			
			while(j>=0 && orders[j].deadline >key.deadline) {
				
				orders[j+1]=orders[j];
				j--;
			}
			orders[j+1]=key;
		}
	}
	
}
