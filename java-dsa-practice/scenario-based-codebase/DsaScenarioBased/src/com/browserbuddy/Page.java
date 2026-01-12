package com.browserbuddy;

public class Page {

	//attribute
	String url;
    Page prev;
    Page next;
	
	//constructor
    public Page(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
	
}
