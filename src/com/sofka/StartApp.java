package com.sofka;

import com.sofka.entities.Account;
import com.sofka.entities.Amount;
import com.sofka.entities.Transaction;

public class StartApp {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(new Transaction(new Amount(1000), "2022-07-11"));
        account.deposit(new Transaction(new Amount(2000), "2022-07-20"));
        account.withdraw(new Transaction(new Amount(500), "2022-07-21"));

        account.printStatements();

    }
}