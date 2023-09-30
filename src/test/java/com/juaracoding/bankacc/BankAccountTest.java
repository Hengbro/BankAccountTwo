package com.juaracoding.bankacc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    private BankAccount account;
    @Before
    public void setUp() {

        account = new BankAccount(12345, "John Doe", 1000.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(500.0);

        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawSufficientBalance() {

        account.withdraw(200.0);

        assertEquals(800.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientBalance() {

        account.withdraw(2000.0);

        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testInvalidDeposit() {

        account.deposit(-100.0);

        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testInvalidWithdraw() {

        account.withdraw(-100.0);

        assertEquals(1000.0, account.getBalance(), 0.001);
    }
}
