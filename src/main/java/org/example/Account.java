package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/13/2024 19:05
 */

public class Account {
    private String accountId;
    private String accountHolder;
    private Double balance;
    private List<Event> changes;

    // Constructor
    public Account() {
        changes = new ArrayList<>();
    }

    // Methods to apply events
    public void apply(AccountOpened event) {
        this.accountId = event.getAccountId();
        this.accountHolder = event.getAccountHolder();
        this.balance = event.getInitialBalance();
    }

    public void apply(FundsDeposited event) {
        this.balance = this.balance + event.getAmount();
    }

    public void apply(FundsWithdrawn event) {
        this.balance = this.balance - event.getAmount();
    }

    // Method to record changes (events)
    public void record(Event event) {
        changes.add(event);
        applyEvent(event);
    }

    // Replay events to rebuild state
    public void replay(List<Event> events) {
        events.forEach(this::applyEvent);
    }

    // Helper method to apply individual event
    private void applyEvent(Event event) {
        if (event instanceof AccountOpened) {
            apply((AccountOpened) event);
        } else if (event instanceof FundsDeposited) {
            apply((FundsDeposited) event);
        } else if (event instanceof FundsWithdrawn) {
            apply((FundsWithdrawn) event);
        }
    }

    // Getters for properties

    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public List<Event> getChanges() {
        return changes;
    }
}
