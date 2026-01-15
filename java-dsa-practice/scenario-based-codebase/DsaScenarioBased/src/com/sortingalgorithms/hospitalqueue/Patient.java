package com.sortingalgorithms.hospitalqueue;

public class Patient {

	//attribute
	String name;
    int criticality;

    //constructor
    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }

    @Override
    public String toString() {
        return name + " (Criticality: " + criticality + ")";
    }
}
