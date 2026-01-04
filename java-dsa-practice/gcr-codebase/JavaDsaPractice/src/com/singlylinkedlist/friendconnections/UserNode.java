package com.singlylinkedlist.friendconnections;

public class UserNode {

	//attributes
	int userId;
    String name;
    int age;
    FriendNode friends;   
    UserNode next;

    //constructor
    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}
