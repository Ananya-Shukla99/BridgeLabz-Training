package com.singlylinkedlist.friendconnections;

public class FriendNode {

	//attributes
	int friendId;
    FriendNode next;

    //constructor
    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}
