package com.sortingalgorithms.artexpo;

public class InsertionSort {

	public static void insertionSort(Artist art[], int n) {
		
		for(int i=1; i<n; i++) {
			
			Artist key=art[i];
			
			int j=i-1;
			
			while(j>=0 && art[j].regTime>key.regTime) {
				
				art[j+1]=art[j];
				
				j--;
			}
			art[j+1]=key;
		}
	}
}
