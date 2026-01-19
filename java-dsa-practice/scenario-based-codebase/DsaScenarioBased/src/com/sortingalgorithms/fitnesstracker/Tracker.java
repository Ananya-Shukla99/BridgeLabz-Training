package com.sortingalgorithms.fitnesstracker;

public class Tracker {

	public static void bubbleSort(User[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i -1; j++) {

				if (arr[j + 1].step < arr[j].step) {

					User temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
}
