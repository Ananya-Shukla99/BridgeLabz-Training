package com.sortingalgorithms.eduresults;

public class MergeList {

	public static void mergeSort(Student []brr, int left, int right) {
		
		if(left<right) {
			
			int mid=left + (right -left)/2;
			
			mergeSort(brr, left , mid);
			
			mergeSort(brr, mid+1 ,right);
			
			merge(brr, left, mid, right);

		}
	}
	
	public static void merge(Student [] brr, int left, int mid,  int right) {
		
		int n=mid-left+1;
		int m=right -mid;
		
		Student [] L=new Student [n];
		Student [] R=new Student [m];
		
		for(int i=0;i<n;i++) {
			L[i]=brr[i+left];
		}
		for(int i=0;i<m;i++) {
			R[i]=brr[i+mid+1];
		}
		
		int i=0, j=0, k=left;
		
		while(i<n && j<m) {
			
			if(L[i].getMarks()>= R[j].getMarks()) {
				brr[k++]=L[i++];
			}
			else {
				brr[k++]=R[j++];
			}
		}
		
		while(i<n) {
			brr[k++]=L[i++];
		}
		while(j<m) {
			brr[k++]=R[j++];
		}
	}
}
