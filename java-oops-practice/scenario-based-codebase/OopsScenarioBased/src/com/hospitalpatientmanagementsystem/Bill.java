package com.hospitalpatientmanagementsystem;

class Bill implements Payable {
	//Attributes 
    double baseAmount;
    double tax = 0.05;      
    double discount = 0.10; 

    //constructor 
    Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }
    
    //Overriding the methods 
    @Override
    public double calculatePayment() {
        double discounted = baseAmount - (baseAmount * discount);
        return discounted + (discounted * tax);
    }
}
