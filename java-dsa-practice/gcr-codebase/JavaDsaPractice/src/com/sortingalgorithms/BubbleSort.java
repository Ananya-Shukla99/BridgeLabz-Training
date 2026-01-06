package com.sortingalgorithms;

public class BubbleSort {
	
	//method for sorting
	public static void bubbleSort(int[]arr, int n) {
		boolean swapp;
		for(int i=0;i<n; i++) {
			swapp=false;
			for(int j=i+1;j<n; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					swapp=true;
				}
			}
			if(!swapp)break; //if no swap is needed then break
		}
	}
    //main method 
	public static void main(String []args) {
		
		//creating student marks array 
		int []arr= {84, 88, 90, 99, 55, 63, 34, 42};
		int n=arr.length;
		
		System.out.println("Marks before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		bubbleSort(arr, n);
		
		System.out.println("Marks after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
