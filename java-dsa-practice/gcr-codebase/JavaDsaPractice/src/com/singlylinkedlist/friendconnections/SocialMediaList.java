package com.singlylinkedlist.friendconnections;

class SocialMediaList {
	
    UserNode head;

    //add new user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    //find user by ID
    UserNode findUserById(int id) {
    	
        UserNode temp = head;
        
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    //find user by name
    UserNode findUserByName(String name) {
    	
        UserNode temp = head;
        
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    //add friend connection
    void addFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friends;
        user.friends = newFriend;
    }

    //remove friend connection
    void removeFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null || user.friends == null) return;

        if (user.friends.friendId == friendId) {
            user.friends = user.friends.next;
            return;
        }

        FriendNode temp = user.friends;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    //display all friends of a user
    void displayFriends(int userId) {
    	
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        
        FriendNode temp = user.friends;
        
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //count friends
    void countFriends(int userId) {
    	
        UserNode user = findUserById(userId);
        if (user == null) return;

        int count = 0;
        FriendNode temp = user.friends;
        
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total friends: " + count);
    }

    //find mutual friends
    void mutualFriends(int user1, int user2) 
    {
        UserNode u1 = findUserById(user1);
        UserNode u2 = findUserById(user2);
        
        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        
        FriendNode f1 = u1.friends;
        
        while (f1 != null) {
        	
            FriendNode f2 = u2.friends;
            while (f2 != null) {
            	
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            
            f1 = f1.next;
        }
        
        System.out.println();
    }
}
