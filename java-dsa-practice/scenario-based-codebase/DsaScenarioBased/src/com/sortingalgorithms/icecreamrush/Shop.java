package com.sortingalgorithms.icecreamrush;

public class Shop {
	
	public static void bubbleSort(IceCream[]brr, int n) {
		boolean swapped;
		for(int i=0;i<n;i++) {
			swapped=false;
			for(int j=0;j<n-i; j++) {
				
				if(brr[j].choiceCount > brr[j+1].choiceCount ) {
					IceCream temp= brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}

}
