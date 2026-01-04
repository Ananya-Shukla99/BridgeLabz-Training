package com.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {

    	//creating node
        MovieList list = new MovieList();

        //performing operation
        list.addAtEnd("Inception", "Nolan", 2010, 8.8);
        list.addAtEnd("Interstellar", "Nolan", 2014, 8.6);
        list.addAtBeginning("Avatar", "Cameron", 2009, 7.8);

        System.out.println("Movies (Forward):");
        list.displayForward();

        System.out.println("\nMovies (Reverse):");
        list.displayReverse();

        list.searchByDirector("Nolan");

        list.updateRating("Avatar", 8.0);

        list.removeByTitle("Inception");

        System.out.println("\nAfter Updates:");
        list.displayForward();
    }
}

