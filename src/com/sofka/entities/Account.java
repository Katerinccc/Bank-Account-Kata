package com.sofka.entities;

public class Account {

    private Statement statement;
    private int balance;
    private Amount amount;


    public Account() {
        this.statement = new Statement();
    }

    public void deposit(Transaction transaction) {
        transaction.transactionType = TransactionType.CREDIT;
        statement.addStatement(transaction);
        amount = transaction.getAmount();
        balance += amount.getAmount();
        statement.addStatement(transaction);
    }

    public void withdraw(Transaction transaction){
        transaction.transactionType = TransactionType.DEBIT;
        statement.addStatement(transaction);
        amount = transaction.getAmount();
        balance -= amount.getAmount();
        statement.addStatement(transaction);
    }

    public void printStatements() {

    }

}
