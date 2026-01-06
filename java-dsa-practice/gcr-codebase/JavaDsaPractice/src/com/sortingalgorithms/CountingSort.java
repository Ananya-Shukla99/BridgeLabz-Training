package com.sortingalgorithms;

public class CountingSort {

	public static void countingSort(int[] arr) {
		
        if (arr.length == 0) return;

        //find the maximum and minimum values
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        //initialize count array
        int range = max - min + 1;
        int[] count = new int[range];

        //count occurrences
        for (int num : arr) {
            count[num - min]++;
        }

        //reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[index++] = i + min;
                count[i]--;
            }
        }
    }
	//main method 
	public static void main(String []args) {
			
		//creating student marks array 
		int []arr= {12, 16, 18, 18,18, 14, 14, 15, 15, 13, 12, 16, 18, 18,18, 14, 14, 15, 15, 13};
		int n=arr.length;
			
		System.out.println("Marks before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
			
		System.out.println();
		countingSort(arr);
		
		System.out.println("Marks after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
