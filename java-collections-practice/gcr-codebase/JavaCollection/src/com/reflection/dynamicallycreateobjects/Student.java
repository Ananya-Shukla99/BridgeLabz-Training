package com.reflection.dynamicallycreateobjects;

public class Student {

    private int id;
    private String name;

    public Student() {
        this.id = 1;
        this.name = "Student";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
