package com.sortingalgorithms;

public class MergeSort {

	    //merger sort
	public static void mergeSort(int[]arr, int left, int right ) {
			
		if(left<right) {
			int mid=left +(right -left)/2;
				
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
		
	public static void merge(int []arr, int left, int mid, int right ) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
	}
	//main method
	public static void main(String []args) {
		//Unsorted array 
		int []arr= {26,74,35,36,74,77};
		
        for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
        
        //function to sort 
        mergeSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("Sorted array ");
		
		//printing array 
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
