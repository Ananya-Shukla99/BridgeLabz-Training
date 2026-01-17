package com.sortingalgorithms.smartlibrary;

public class Library {

	public static void insertionSort(Book book[]) {
		
		int n=book.length;
		for(int i=1;i<n; i++) {
			
			Book key=book[i];
			int j=i-1;
			
			while(j>=0 && book[j].title.compareToIgnoreCase(key.title)>0) {
				
			     book[j+1]=book[j];
			     j--;
			}
			book [j+1]=key;
		}
		
	}
}
