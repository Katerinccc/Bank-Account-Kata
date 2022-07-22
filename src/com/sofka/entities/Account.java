package com.sofka.entities;

public class Account {

    private Statement statement;
    private int balance;
    private Amount amount;


    public Account() {
        this.statement = new Statement();
    }

    public void deposit(Transaction transaction) {
        transaction.setTransactionType(TransactionType.CREDIT);
        amount = transaction.getAmount();
        this.balance += amount.getAmount();
        transaction.setBalance(this.balance);
        statement.addStatement(transaction);
    }

    public void withdraw(Transaction transaction){
        transaction.setTransactionType(TransactionType.DEBIT);
        amount = transaction.getAmount();
        this.balance -= amount.getAmount();
        transaction.setBalance(this.balance);
        statement.addStatement(transaction);
    }

    public void printStatements() {
        statement.printStatements();
    }

}
