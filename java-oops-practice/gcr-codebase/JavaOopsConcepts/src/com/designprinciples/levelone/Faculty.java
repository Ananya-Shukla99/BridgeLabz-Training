package com.designprinciples.levelone;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
        System.out.println("Faculty created: " + name);
    }

    public String getName() {
        return name;
    }
}