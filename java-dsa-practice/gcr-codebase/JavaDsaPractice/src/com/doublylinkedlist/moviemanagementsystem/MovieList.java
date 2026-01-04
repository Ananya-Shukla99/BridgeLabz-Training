package com.doublylinkedlist.moviemanagementsystem;

class MovieList {
    MovieNode head;
    MovieNode tail;

    //add at beginning of list
    void addAtBeginning(String title, String director, int year, double rating) {
    	
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add at end of the list
    void addAtEnd(String title, String director, int year, double rating) {
    	
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //add at position
    void addAtPosition(int pos, String title, String director, int year, double rating) {
    	
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    //remove by Movie Title
    void removeByTitle(String title) {
    	
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    //search by Director
    void searchByDirector(String director) {
    	
        MovieNode temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director))
                displayMovie(temp);
            temp = temp.next;
        }
    }

    //search by Rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                displayMovie(temp);
            temp = temp.next;
        }
    }

    //update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    //display forward
    void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    //display reverse
    void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    void displayMovie(MovieNode m) {
        System.out.println(
            m.title + " | " +
            m.director + " | " +
            m.year + " | Rating: " + m.rating
        );
    }
}
