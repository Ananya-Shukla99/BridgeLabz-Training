package com.doublylinkedlist.librarymanagementsystem;

class LibraryList {
	
    BookNode head;
    BookNode tail;

    //add at beginning
    void addAtBeginning(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add at end
    void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //add at specific position 
    void addAtPosition(int pos, String title, String author, String genre, int bookId, boolean available) {
        if (pos == 1) {
            addAtBeginning(title, author, genre, bookId, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, author, genre, bookId, available);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    //remove by Book ID
    void removeById(int bookId) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Book removed");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    //search by Title
    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title))
                displayBook(temp);
            temp = temp.next;
        }
    }

    //search by Author
    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author))
                displayBook(temp);
            temp = temp.next;
        }
    }

    //update availability
    void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.available = status;
                System.out.println("Availability updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    //display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    //display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }

    void displayBook(BookNode b) {
        System.out.println(
            b.bookId + " | " +
            b.title + " | " +
            b.author + " | " +
            b.genre + " | Available: " + b.available
        );
    }
}
