package com.example.day04exception.banktransactionsystem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    public void testValidWithdrawal() throws InsufficientBalanceException {
        BankAccount account = new BankAccount(5000);
        account.withdraw(1000); // New balance should be 4000
        assertEquals(4000, account.getBalance());
    }

    @Test
    public void testInsufficientBalanceException() {
        BankAccount account = new BankAccount(2000);
        Exception exception = assertThrows(InsufficientBalanceException.class, () -> {
            account.withdraw(5000); // More than balance
        });
        assertEquals("Insufficient balance!", exception.getMessage());
    }

    @Test
    public void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(3000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100); // Negative amount
        });
        assertEquals("Invalid amount!", exception.getMessage());
    }
}

