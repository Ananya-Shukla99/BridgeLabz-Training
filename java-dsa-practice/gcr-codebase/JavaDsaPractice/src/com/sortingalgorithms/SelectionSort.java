package com.sortingalgorithms;

public class SelectionSort {

	public static void selectionSort(int[]arr, int n) {
		
		for(int i=0;i<n-1; i++) {
			int minIndex=i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			 int temp = arr[minIndex];
	         arr[minIndex] = arr[i];
	         arr[i] = temp;
		}
	}
	//main method 
	public static void main(String []args) {
		//creating student marks array 
		int []arr= {84, 88, 90, 99, 55, 63, 34, 42};
		int n=arr.length;
			
		System.out.println("Before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
			
		System.out.println();
		selectionSort(arr, n);
			
		System.out.println("After sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
