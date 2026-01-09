package com.algorithmanalysis;

public class FibonacciComparison {

    //recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    //iterative Fibonacci 
    public static int fibonacciIterative(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};

        for (int n : testValues) {
            System.out.println("Fibonacci Number: " + n);

            //iterative Timing 
            long start = System.nanoTime();
            int iterResult = fibonacciIterative(n);
            long end = System.nanoTime();
            System.out.println("Iterative Result: " + iterResult);
            System.out.println("Iterative Time: " +
                    (end - start) / 1_000_000.0 + " ms");

            //recursive Timing
            if (n <= 30) 
            {   start = System.nanoTime();
                int recResult = fibonacciRecursive(n);
                end = System.nanoTime();
                System.out.println("Recursive Result: " + recResult);
                System.out.println("Recursive Time: " +(end - start) / 1_000_000.0 + " ms");
            } 
            else 
            {
                System.out.println("Recursive Result: Skipped (Too Slow)");
            }

        }
    }
}
