package com.resumebubby;

import java.util.Arrays;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Allu"));

		Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bhuvan"));

		Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Chavi"));

		Screening.screenResume(seResume);
		Screening.screenResume(dsResume);
		Screening.screenResume(pmResume);

		List<JobRole> candidates = Arrays.asList(new SoftwareEngineer("Dheeru"), new DataScientist("Eva"),
				new ProductManager("Farhan"));

		Screening.screenMultipleResumes(candidates);
	}
}
