package com.singlylinkedlist.friendconnections;

public class Main {
	//main method
    public static void main(String[] args) {

    	//creating social media node
        SocialMediaList sm = new SocialMediaList();

        //performing operation 
        sm.addUser(1, "Amit", 21);
        sm.addUser(2, "Neha", 22);
        sm.addUser(3, "Rahul", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.countFriends(1);

        sm.mutualFriends(1, 2);

        sm.removeFriend(1, 3);
        sm.displayFriends(1);
    }
}

