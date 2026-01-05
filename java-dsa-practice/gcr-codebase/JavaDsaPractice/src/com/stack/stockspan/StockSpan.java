package com.stack.stockspan;

import java.util.Stack;

class StockSpan {

    static int[] calculateSpan(int[] price) {
    	
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        //first day span is always 1
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {

            //pop elements while current price is greater
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            //if stack is empty, price is greater than all previous prices
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            //push current index
            stack.push(i);
        }

        return span;
    }
}
