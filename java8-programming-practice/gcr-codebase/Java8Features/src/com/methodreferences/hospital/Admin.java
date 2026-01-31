package com.methodreferences.hospital;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	public static void main(String []args) {
		
		// Creating Patient object
		Patient p=new Patient("Ramesh", 101);
		Patient p1=new Patient("Deshmuk", 102);
		Patient p2=new Patient("Amit", 103);
		Patient p3=new Patient("Sudha", 104);
		Patient p4=new Patient("Yuvika", 105);
		
		//List of patient 
		List<Patient> list=new ArrayList<>();
		
		//Adding elements
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		//Method reference 
		list.forEach(Patient::print);
		
	}

}
