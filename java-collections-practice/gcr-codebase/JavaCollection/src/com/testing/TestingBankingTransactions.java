package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingBankingTransactions {

	private BankingTransactions account;

    @BeforeEach
    void setUp() {
        account = new BankingTransactions(1000.0);
    }

    @Test
    void testDeposit() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }
    
    @Test
    void testWithdrawSuccess() {
        boolean result = account.withdraw(300.0);

        assertTrue(result);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        boolean result = account.withdraw(1500.0);

        assertFalse(result);
        assertEquals(1000.0, account.getBalance());
    }
}
