package com.collections.listinterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[]args) {
		
		//Creating the list
		List<Integer> list=Arrays.asList(3, 1, 2, 2, 3, 4);
		

		List<Integer> result=new ArrayList<>();
		
		for(Integer num : list) {
			if(!result.contains(num)) {
				result.add(num);
			}
		}
		
		System.out.println("List before removing duplicate : ");
		System.out.println(list);
		System.out.println("List after removing duplicate : ");
		System.out.println(result);
	}
}
