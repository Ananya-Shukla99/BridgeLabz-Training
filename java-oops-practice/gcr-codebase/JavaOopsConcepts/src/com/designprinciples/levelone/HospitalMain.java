package com.designprinciples.levelone;

public class HospitalMain {

	public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor("Dr. Bhuvan");
        Doctor d2 = new Doctor("Dr. Aman");

        Patient p1 = new Patient("Jimmy");
        Patient p2 = new Patient("Emma");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
