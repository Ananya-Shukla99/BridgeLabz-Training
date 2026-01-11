package com.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BookShelf {

	private HashMap<String , BookLinkedList> Index=new HashMap<>();
	
	private HashSet<Integer>checkList=new HashSet<>();
	
	//add book
	public void addBook(Book book) {
		if(checkList.contains(book.id)) {
			System.out.println("Duplicate Book not allowed");
			return ;
		}
		
		Index.putIfAbsent(book.genre , new BookLinkedList());
		Index.get(book.genre).add(book);
		checkList.add(book.id);
		System.out.println("Added : "+ book);
	}
	
	//borrow book

	public void borrowBook(int id) {
		if(!checkList.contains(id)) {
			System.out.println("Book not found");
		    return;
		}
	
		for(BookLinkedList list: Index.values()) {
	    
			if(list.remove(id)) {
				checkList.remove(id);
				System.out.println("Book borrowed : "+ id);
				return ;
			}
		}
	}
	
	//show genre
	public void showGenre(String genre) {
		
		if(!Index.containsKey(genre)) {
			System.out.println("No such genre");
		    return ;
		}
		
		System.out.println(" Books in "+genre + " :");
		Index.get(genre).display();
		}

}
