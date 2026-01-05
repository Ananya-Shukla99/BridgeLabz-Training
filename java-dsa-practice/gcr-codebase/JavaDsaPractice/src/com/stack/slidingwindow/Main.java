package com.stack.slidingwindow;


public class Main {
	//main method 
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] max = SlidingWindowMaximum.maxSlidingWindow(arr, k);

        System.out.print("Sliding Window Maximums: ");
        
        for (int m : max) {
            System.out.print(m + " ");
        }
    }
}

