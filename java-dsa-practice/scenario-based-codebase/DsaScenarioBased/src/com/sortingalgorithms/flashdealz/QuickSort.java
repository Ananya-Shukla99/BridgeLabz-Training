package com.sortingalgorithms.flashdealz;

public class QuickSort {

	public static void quickSort( Product [] brr , int low, int high) {
		
		if(low<high) {
			
			int index= partition(brr, low , high);
			
			quickSort(brr, low, index-1);
			
			quickSort(brr, index +1, high);
		}
	}
	
	public static int partition( Product [] brr, int low, int high) {
		
		double pivot = brr[high].discount;
		int i= low-1;
		
		for(int j= low; j<high ; j++) {
			
			if(brr[j].discount>= pivot) {
				
				i++;
				Product temp=brr[i];
				brr[i]=brr[j];
				brr[j]=temp;
			}
		}
		
		Product temp= brr[i+1];
		brr[i+1] =brr[high];
		brr[high] = temp;
		
		return i+1;
	}
}
