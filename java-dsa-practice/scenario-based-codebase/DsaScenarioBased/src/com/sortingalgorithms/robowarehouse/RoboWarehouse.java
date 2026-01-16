package com.sortingalgorithms.robowarehouse;

public class RoboWarehouse {
	
	public static void insertionSort(Package brr[], int n) {
		
		for(int i=1; i<n; i++) {
			Package key=brr[i];
			int j=i-1;
			
			while(j>=0 && brr[j].weight >key.weight) {
				brr[j+1]=brr[j];
				j--;
			}
			
			brr[j+1] =key;
		}
	}
}
