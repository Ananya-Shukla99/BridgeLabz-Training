package com.bookshelf;

public class BookLinkedList {

	private BookNode head;
	
	//Insert book
	public void add(Book book) {
		
		BookNode node= new BookNode(book);
		
		if(head ==null) {
			head =node;
			return ;
		}
		BookNode temp=head;
		while(temp.next!=null) {
			 temp=temp.next;
		}
		temp.next=node;
	} 
	
	//Delete node
	public boolean remove(int id) {
	
		if(head ==null)return false;
		
		if(head.book.id == id) {
			
			head=head.next;
			return true;
		}
		BookNode temp=head;
		
		while(temp.next!=null) {
			if(temp.next.book.id == id) {
				temp.next=temp.next.next;
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public void display() {
		BookNode temp =head;
		while(temp != null) {
			System.out.println(temp.book);
			temp=temp.next;
		}
	}
}
