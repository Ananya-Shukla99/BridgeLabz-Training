package com.warehouse;

import java.util.*;

public class Storage <T extends WarehouseItem>{

	private List<T> items=new ArrayList<>();
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public T getItem(int index) {
		return items.get(index);
	}
	
	public List<T> getAllItems(){
		return items;
	}
	
	public static void displayItems(List<? extends WarehouseItem> items) {
		for(WarehouseItem item : items) {
			System.out.println(item);
		}
	}
	
}
