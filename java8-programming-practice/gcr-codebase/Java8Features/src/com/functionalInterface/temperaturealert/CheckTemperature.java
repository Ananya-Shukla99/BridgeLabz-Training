package com.functionalInterface.temperaturealert;

@FunctionalInterface
public interface CheckTemperature {

	boolean threshold(int temp);

}
