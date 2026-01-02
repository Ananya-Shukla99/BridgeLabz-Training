package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {


    private int patientId;
    private String name;
    private int age;

   
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }


    public abstract double calculateBill();

  
    public String getPatientDetails() {
        return "Patient ID: " + patientId +", Name: " + name +", Age: " + age;}

    
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // defensive copy
    }
}
