package com.encapsulationandpolymorphism.levelone;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "John Doe", 45, 5, 2000, 15000);
        Patient p2 = new OutPatient(102, "Jane Smith", 30, 800, 1200);

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Diagnosis and treatment updated.");
                record.viewRecords();
            }

            System.out.println("--------------------------------");
        }
    }
}
