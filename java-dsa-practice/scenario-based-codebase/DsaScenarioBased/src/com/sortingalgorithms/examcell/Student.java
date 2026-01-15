package com.sortingalgorithms.examcell;

public class Student {

	//attribute
	int rollNo;
    String name;
    int score;

    //constructor
    Student(int rollNo, String name, int score) {
        this.rollNo = rollNo;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return rollNo + "  " + name + "  Score: " + score;
    }
}
