package com.ewalletapplication;

public class Main {

	public static void main(String[] args) {

		//creating user objects
        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");

		//creating wallet objects
        Wallet w1 = new PersonalWallet(100);   
        Wallet w2 = new BusinessWallet();

        //calling the methods 
        u1.setWallet(w1);
        u2.setWallet(w2);

        w1.loadMoney(1000);
        w1.transferTo(u2, 300);

        u1.viewBalance();
        u2.viewBalance();

        u1.viewTransactions();
        u2.viewTransactions();
    }
}
