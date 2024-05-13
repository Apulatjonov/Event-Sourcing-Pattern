package org.example;

public class Main {
    public static void main(String[] args) {
        // Create new account
        Account account = new Account();
        account.record(new AccountOpened("123", "John Doe", 0.0));

        // Deposit funds
        account.record(new FundsDeposited("123", Double.valueOf("100")));

        // Withdraw funds
        account.record(new FundsWithdrawn("123", Double.valueOf("50")));

        // Print final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}