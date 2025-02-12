package com.example.day02collections.bankingsystem;

import java.util.*;

class BankingSystem {
    Map<Integer, Double> accounts;
    Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Deposit money into an account
    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
        System.out.println("Deposited $" + amount + " to Account: " + accountNumber);
    }

    public void requestWithdrawal(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found!");
            return;
        }
        withdrawalQueue.add(accountNumber);
        System.out.println("Withdrawal request for $" + amount + " from Account: " + accountNumber);
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    // Display accounts sorted by balance
    public void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Accounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " -> Balance: $" + entry.getKey());
        }
    }
}
