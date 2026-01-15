package com.sortingalgorithms.zipzipmart;

class SalesRecord {
	
	//attributes
    String transactionId;
    String date;    
    double amount;

    //constructor
    SalesRecord(String id, String date, double amount) {
        this.transactionId = id;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return transactionId + "  " + date + "  ₹" + amount;
    }
}
