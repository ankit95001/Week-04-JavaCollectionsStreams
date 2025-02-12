package com.example.day02collections.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 7000);
        bank.addAccount(103, 3000);
        bank.addAccount(104, 9000);

        // Deposits
        bank.deposit(101, 2000);
        bank.deposit(103, 1000);

        // Withdrawal requests
        bank.requestWithdrawal(102, 1500);
        bank.requestWithdrawal(104, 2500);

        // Display sorted accounts by balance
        System.out.println();
        bank.displaySortedByBalance();

        // Process withdrawals
        System.out.println();
        bank.processWithdrawals();
    }
}
