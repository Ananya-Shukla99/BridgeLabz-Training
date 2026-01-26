package com.annotation;

import java.util.ArrayList;

public class UncheckedWarning {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();
        rawList.add("Apple");
        rawList.add("Banana");
        rawList.add(42);

        ArrayList<String> stringList = rawList;

        for (String item : stringList) {
            System.out.println(item);
        }
    }
}
