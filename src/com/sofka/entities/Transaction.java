package com.sofka.entities;

import java.time.LocalDate;

public class Transaction {

    private int amount;
    private LocalDate date;
    protected TransactionType transactionType;

    public Transaction(int amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

}
