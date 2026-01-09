package com.algorithmanalysis;

public class StringConcatenationPerformance {

    private static final int N = 1_000_000;

    //using String
    public static void stringConcat() {
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "a";
        }
    }

    //using StringBuilder
    public static void stringBuilderConcat() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
    }

    //using StringBuffer
    public static void stringBufferConcat() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
    }

    public static void main(String[] args) {

        //string concatenation
        long start = System.nanoTime();
        stringConcat();
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000.0 + " ms");

        //stringBuilder concatenation
        start = System.nanoTime();
        stringBuilderConcat();
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000.0 + " ms");

        //stringBuffer concatenation
        start = System.nanoTime();
        stringBufferConcat();
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
