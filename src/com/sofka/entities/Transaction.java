package com.sofka.entities;

import java.time.LocalDate;

public class Transaction {

    private Amount amount;
    private LocalDate date;
    private TransactionType transactionType;

    private int balance;

    public Transaction(Amount amount, String date) {
        this.amount = amount;
        this.date = LocalDate.parse(date);
    }

    protected Amount getAmount() {
        return amount;
    }

    protected LocalDate getDate() {
        return date;
    }

    protected void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    protected TransactionType getTransactionType() {
        return transactionType;
    }

    protected void setBalance(int balance) {
        this.balance = balance;
    }

    protected int getBalance() {
        return balance;
    }
}
