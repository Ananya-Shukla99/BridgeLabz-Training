package com.sortingalgorithms;

public class QuickSort {
	
	public static void quickSort(int[]arr, int low, int high) {
		
		if(low<high) {
			int pi=partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
			
		}
	}
	public static int partition(int[]arr, int low, int high) {
        int pivot = arr[high];
        int i=low-1;
        for(int j=low; j<high; j++) {
        	if(arr[j]<pivot) {
        		i++;
        		int temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	}
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;

	}
	public static void main(String []args) {
		//Unsorted array 
		int []arr= {26,74,35,36,74,77};
		
        for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
        
        //function to sort 
        quickSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("Sorted array ");
		
		//printing array 
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
