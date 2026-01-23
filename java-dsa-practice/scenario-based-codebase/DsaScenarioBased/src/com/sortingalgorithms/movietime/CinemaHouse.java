package com.sortingalgorithms.movietime;

public class CinemaHouse {

	public static void insertionSort(Movie brr[]) {
		
		for(int i=1;i<brr.length; i++) {
			
			Movie key=brr[i];
			int j=i-1;
			
			while(j>=0 && brr[j].timing >key.timing) {
				
				brr[j+1]=brr[j];
				j--;
			}
			brr[j+1]=key;
		}
	}
}
