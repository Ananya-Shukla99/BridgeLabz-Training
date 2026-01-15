package com.parceltracker;

public class Main {
    public static void main(String[] args) {
    	
        ParcelTracker parcel = new ParcelTracker();

        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");

        parcel.trackParcel();

        parcel.addCheckpoint("Shipped", "Customs Check");
        parcel.trackParcel();

        parcel.markLost("In Transit");
        parcel.trackParcel();
    }
}
