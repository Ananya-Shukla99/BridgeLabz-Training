package com.encapsulationandpolymorphism.levelone;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    
    private String borrowerName;
    private String borrowerContact;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }


    public abstract int getLoanDuration();


    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title +", Author: " + author; }

    public void setBorrower(String name, String contact) {
        this.borrowerName = name;
        this.borrowerContact = contact;
    }

    protected String getBorrowerInfo() {
        return borrowerName != null ? borrowerName : "Not Borrowed";
    }
}

