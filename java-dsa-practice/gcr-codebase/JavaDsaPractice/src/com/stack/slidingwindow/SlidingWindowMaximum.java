package com.stack.slidingwindow;

import java.util.ArrayDeque;

import java.util.Deque;

class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] arr, int k) {
    	
        int n = arr.length;
        if (n == 0 || k == 0) return new int[0];

        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            //remove indices out of this window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            //remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            //add current index
            deque.offerLast(i);

            //window is ready
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}
