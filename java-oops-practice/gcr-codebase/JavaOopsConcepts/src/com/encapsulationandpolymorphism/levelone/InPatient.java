package com.encapsulationandpolymorphism.levelone;

public class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;
    private double treatmentCost;

    public InPatient(int patientId, String name, int age,
                     int numberOfDays, double dailyCharge, double treatmentCost) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.dailyCharge = dailyCharge;
        this.treatmentCost = treatmentCost;
    }

    @Override
    public double calculateBill() {
        return (numberOfDays * dailyCharge) + treatmentCost;
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records: " + getMedicalHistory());
    }
}
