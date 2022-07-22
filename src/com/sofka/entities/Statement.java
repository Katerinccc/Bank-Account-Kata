package com.sofka.entities;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    List<Transaction> statements = new ArrayList<>();

    public void addStatement(Transaction transaction) {
        this.statements.add(transaction);
    }

    protected void printStatements() {
        System.out.printf("%10s %10s %10s %10s", "Date", "Credit", "Debit", "Balance");
        System.out.println();
        for (Transaction transaction : statements) {
            System.out.format("%10s %10s %10s %10s",
                    transaction.getDate().toString(),
                    validateTransactionTypeCredit(transaction),
                    validateTransactionTypeDebit(transaction),
                    transaction.getBalance());
            System.out.println();
        }
    }

    private String validateTransactionTypeCredit(Transaction transaction){
        Amount amount = transaction.getAmount();
        if (transaction.getTransactionType().equals(TransactionType.CREDIT)) {
            return String.valueOf(amount.getAmount());
        }
        return "";
    }

    private String validateTransactionTypeDebit(Transaction transaction){
        Amount amount = transaction.getAmount();
        if (transaction.getTransactionType().equals(TransactionType.DEBIT)) {
            return String.valueOf(amount.getAmount());
        }
        return "";
    }

}
