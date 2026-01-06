package com.sortingalgorithms;

public class HeapSort {
    public static void heapSort(int []arr, int n) {
    	
    	for(int i= n/2 -1; i>=0; i--) {
    		heapify(arr, n, i);
    	}
    	
    	for(int i=n-1; i>0; i--) {
    		
    		int temp=arr[0];
    		arr[0]=arr[i];
    		arr[i]=temp;
    	}
    }
    
    static void heapify(int []arr, int n , int i) {
    	
    	int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

     
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

  
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

           
            heapify(arr, n, largest);
            
        }
    	
    }
    
	public static void main(String[]args) {
		
		//different expected salary demands
		int []arr= {5550,73840, 53673,3628, 67839, 89098};
		
		int n=arr.length;
		
		System.out.println("salary before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		heapSort(arr, n);
		
		System.out.println("salary after sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
}
