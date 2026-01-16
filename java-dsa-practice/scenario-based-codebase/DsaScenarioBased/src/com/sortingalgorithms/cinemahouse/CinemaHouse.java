package com.sortingalgorithms.cinemahouse;

public class CinemaHouse {

	public static void bubbleSort(Movie brr[]) {
		
		boolean swapped ;
		for(int i=0; i<brr.length-1; i++) {
			swapped =false;
			for(int j=0; j<brr.length-i-1; j++) {
				
				if(brr[j].timing>brr[j+1].timing) {
					Movie temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
					swapped =true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
