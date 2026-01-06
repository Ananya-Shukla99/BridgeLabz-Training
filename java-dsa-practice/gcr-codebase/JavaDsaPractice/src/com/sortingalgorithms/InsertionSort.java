package com.sortingalgorithms;

public class InsertionSort {
	
	public static void insertionSort(int []employeeIDs) {
		
		int n=employeeIDs.length;
        for(int i=0;i<n;i++) {
        	int key =employeeIDs[i];
        	int j= i-1;
        	while(j>=0 && employeeIDs[j]>key) {
        		employeeIDs[j+1]=employeeIDs[j];
        		j--;
        	}
        	employeeIDs[j+1] =key;
        }
	}

	public static void main(String []args) {
		//unsorted employee IDs array
		int employeeIDs[]= {200, 390, 442, 100, 688, 270};
		System.out.println("Unsorted array ");
		//printing array
		for(int i=0; i<employeeIDs.length;i++) {
			
			System.out.print(employeeIDs[i]+" ");
		}
		//calling insertion sort 
		insertionSort(employeeIDs);
		
		System.out.println();
		System.out.println("Sorted array ");
		//printing array 
		for(int i=0; i<employeeIDs.length;i++) {
			
			System.out.print(employeeIDs[i]+" ");
		}
	}
}
