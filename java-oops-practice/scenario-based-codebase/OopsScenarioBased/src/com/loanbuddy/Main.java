package com.loanbuddy;

public class Main {
	//main method 
    public static void main(String[] args) {

    	//creating applicant 
        Applicant applicant = new Applicant("Amit", 720, 45000, 500000);

        //extending loan class 
        LoanApplication loan =new HomeLoan(applicant, 240);

        //
        if (loan.approveLoan()) {
        	
            System.out.println("Loan Approved");
            
            System.out.println("Monthly EMI: " + loan.calculateEMI());
        } 
        
        else 
        {
            System.out.println("Loan Rejected");
        }

        System.out.println("Loan Status: " + loan.getStatus());
    }
}
