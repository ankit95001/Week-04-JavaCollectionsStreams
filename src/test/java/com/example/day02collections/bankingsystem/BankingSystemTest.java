package com.example.day02collections.bankingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();
        bank.addAccount(101, 5000);
        bank.addAccount(102, 7000);
        bank.addAccount(103, 3000);
        bank.addAccount(104, 9000);
    }

    @Test
    void testAddAccount() {
        bank.addAccount(105, 4000);
        assertTrue(bank.accounts.containsKey(105));
        assertEquals(4000, bank.accounts.get(105));
    }

    @Test
    void testDeposit() {
        bank.deposit(101, 2000);
        assertEquals(7000, bank.accounts.get(101));

        bank.deposit(103, 1000);
        assertEquals(4000, bank.accounts.get(103));
    }

    @Test
    void testDepositAccountNotFound() {
        bank.deposit(999, 1000);
        assertFalse(bank.accounts.containsKey(999));
    }

    @Test
    void testRequestWithdrawal() {
        bank.requestWithdrawal(102, 1500);
        bank.requestWithdrawal(104, 2500);

        assertFalse(bank.withdrawalQueue.isEmpty());
        assertEquals(102, bank.withdrawalQueue.poll());
        assertEquals(104, bank.withdrawalQueue.poll());
    }

    @Test
    void testProcessWithdrawals() {
        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 1000);

        assertFalse(bank.withdrawalQueue.isEmpty());
        bank.processWithdrawals();
        assertTrue(bank.withdrawalQueue.isEmpty());
    }
}
