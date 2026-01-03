package com.ewalletapplication;

public class PersonalWallet extends Wallet {

	//creating static attribute
    private static final double LIMIT = 5000;

    //constructor
    public PersonalWallet() {
        super();
    }

    public PersonalWallet(double bonus) {
        super(bonus);
    }

    //Overriding methods 
    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > LIMIT) {
            System.out.println("Transfer limit exceeded");
            return;
        }

        if (canTransfer(amount)) {
            deduct(amount);
            receiver.getWallet().loadMoney(amount);
            transactions.add(new Transaction("Transfer Sent", amount));
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
