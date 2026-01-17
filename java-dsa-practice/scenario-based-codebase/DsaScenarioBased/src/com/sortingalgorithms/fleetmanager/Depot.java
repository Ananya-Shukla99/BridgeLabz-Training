package com.sortingalgorithms.fleetmanager;

public class Depot {

	public static void mergeSort(Vehicle[] vehicle, int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(vehicle, left, mid);

			mergeSort(vehicle, mid + 1, right);

			merge(vehicle, left, mid, right);
		}

	}

	public static void merge(Vehicle[] vehicle, int left, int mid, int right) {

		// get the size of array
		int n = mid - left + 1;
		int m = right - mid;

		// declare array
		Vehicle L[] = new Vehicle[n];
		Vehicle R[] = new Vehicle[m];

		// insert data
		for (int i = 0; i < n; i++) {
			L[i] = vehicle[left + i];
		}
		for (int j = 0; j < m; j++) {
			R[j] = vehicle[mid + 1 +j];
		}

		int i = 0, j = 0, k = left;

		while (i < n && j < m) {

			if (L[i].mileage < R[j].mileage) {
				vehicle[k++] = L[i++];
			} else {
				vehicle[k++] = R[j++];
			}

		}

		while(i < n) {
			vehicle[k++] = L[i++];
		}
		while(j < m) {
			vehicle[k++] = R[j++];
		}
	}

}
