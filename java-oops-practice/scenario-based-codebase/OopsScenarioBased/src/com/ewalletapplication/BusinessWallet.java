package com.ewalletapplication;

public class BusinessWallet extends Wallet {

	// static attribute
    private static final double TAX = 0.05;

    //constructor
    public BusinessWallet() {
        super();
    }

    public BusinessWallet(double bonus) {
        super(bonus);
    }

    //methods to show transfer
    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * TAX;
        double total = amount + tax;

        if (canTransfer(total)) {
            deduct(total);
            receiver.getWallet().loadMoney(amount);
            transactions.add(new Transaction("Business Transfer (Tax: " + tax + ")", amount));
        }
        else {
            System.out.println("Insufficient balance (including tax)");
        }
    }
}
