package com.sofka.entities;

import java.time.LocalDate;

public class Transaction {

    private Amount amount;
    private LocalDate date;
    protected TransactionType transactionType;

    public Transaction(Amount amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public Amount getAmount() {
        return amount;
    }

}
