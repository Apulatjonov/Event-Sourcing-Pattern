package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/13/2024 18:38
 */


public class AccountOpened implements Event{
    private final String accountId;
    private final String accountHolder;
    private final Double initialBalance;

    public AccountOpened(String accountId, String accountHolder, Double initialBalance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.initialBalance = initialBalance;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }
}
