package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/13/2024 18:43
 */

public class FundsWithdrawn implements Event{
    private final String accountId;
    private final Double amount;

    public FundsWithdrawn(String accountId, Double amount) {
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
