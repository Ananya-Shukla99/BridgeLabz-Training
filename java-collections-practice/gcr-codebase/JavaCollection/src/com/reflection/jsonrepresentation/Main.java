package com.reflection.jsonrepresentation;

public class Main {
    public static void main(String[] args) throws Exception {

        Person p = new Person(1, "John", 25);

        String json = JsonUtil.toJson(p);
        System.out.println(json);
    }
}
