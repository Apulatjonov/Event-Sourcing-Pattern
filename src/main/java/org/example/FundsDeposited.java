package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/13/2024 18:41
 */

public class FundsDeposited implements Event{
    private final String accountId;
    private final Double amount;

    public FundsDeposited(String accountId, Double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public Double getAmount() {
        return amount;
    }
}
