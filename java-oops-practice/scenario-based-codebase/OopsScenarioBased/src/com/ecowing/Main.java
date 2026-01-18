package com.ecowing;

import java.util.*;

public class Main {

	public static void main(String[]args) {
		
		Bird b= new Duck("Toto",101 );
		Bird b1= new Eagle("Boba",102 );
		Bird b2= new Kiwi("Somu",103 );
		Bird b3= new Seagull("Suzi",104 );
		Bird b4= new Sparrow("Mathu",105 );
		Bird b5= new Sparrow("Para",106 );
		Bird b6= new Duck("Bingo",107 );
		Bird b7= new Seagull("Toto",108 );
		Bird b8= new Kiwi("Kuhu",109 );
		
		ArrayList<Bird> list=new ArrayList<>();
		Sanctuary s= new Sanctuary("Eco-Wing", list);
		
		list.add(b8);
		list.add(b7);
		list.add(b6);
		list.add(b5);
		list.add(b4);
		list.add(b3);
		list.add(b2);
		list.add(b1);
		list.add(b);
		
		s.display();
        s.displayFlyingBird();
        s.displaySwimmingBird();
        s.sanctuaryReport();
	}
}
