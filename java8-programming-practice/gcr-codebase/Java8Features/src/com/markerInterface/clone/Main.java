package com.markerInterface.clone;

public class Main {

	 public static void main(String[] args) {

	        try {
	        	Prototype m1 = new Prototype(1, "Prototype");
	        	Prototype m2 = (Prototype) m1.clone();

	            System.out.println(m1.name);
	            System.out.println(m2.name);

	        } catch (CloneNotSupportedException e) {
	            System.out.println("Cloning not allowed");
	        }
	    }
}
