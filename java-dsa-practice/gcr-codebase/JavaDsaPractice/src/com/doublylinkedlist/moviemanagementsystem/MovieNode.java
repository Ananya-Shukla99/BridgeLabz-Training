package com.doublylinkedlist.moviemanagementsystem;

public class MovieNode {

	//attribute
	String title;
    String director;
    int year;
    double rating;

    //nodes
    MovieNode next;
    MovieNode prev;

    //constructor
    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
