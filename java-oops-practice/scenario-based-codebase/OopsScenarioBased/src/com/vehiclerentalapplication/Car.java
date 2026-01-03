package com.vehiclerentalapplication;

public class Car extends Vehicle
{

	//field 
	double ExtraCharge = 200;

	//constructor 
    Car(String id, String brand, int rent) {
        super(id, brand, rent);
    }

    //method overriding 
    @Override
    public double calculateRent(int days) {
        return (rent * days) + ExtraCharge;
    }

}
