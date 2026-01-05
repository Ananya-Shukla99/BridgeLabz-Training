package com.stack.stockspan;

public class Main {
	//main method
    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(price);

        System.out.print("Stock Spans: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

