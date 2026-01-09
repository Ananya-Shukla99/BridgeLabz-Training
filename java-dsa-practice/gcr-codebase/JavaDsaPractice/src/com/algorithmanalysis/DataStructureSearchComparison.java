package com.algorithmanalysis;

import java.util.*;

public class DataStructureSearchComparison {

    //linear search 
    public static boolean arraySearch(int[] arr, int target) {
        for (int value : arr) {
            if (value == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 100_000, 1_000_000};

        for (int size : sizes) {

            System.out.println("Dataset Size: " + size);

            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
           
            for (int i = 0; i < size; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            int target = size - 1; 

            //array Search
            long start = System.nanoTime();
            arraySearch(array, target);
            long end = System.nanoTime();
            System.out.println("Array Search Time: " +(end - start) / 1_000_000.0 + " ms");

            //hashSet Search
            start = System.nanoTime();
            hashSet.contains(target);
            end = System.nanoTime();
            System.out.println("HashSet Search Time: " +(end - start) / 1_000_000.0 + " ms");

            //treeSet Search 
            start = System.nanoTime();
            treeSet.contains(target);
            end = System.nanoTime();
            System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000.0 + " ms");
        }
    }
}
