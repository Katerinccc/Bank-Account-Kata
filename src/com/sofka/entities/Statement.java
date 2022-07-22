package com.sofka.entities;

import java.util.ArrayList;
import java.util.List;

public class Statement {

    List<Transaction> statements = new ArrayList<>();

    public void addStatement(Transaction transaction) {
        this.statements.add(transaction);
    }

}
