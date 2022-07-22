package com.sofka.entities;

public class Amount {

    private int amount;

    public Amount(int amount) {
        Validate(amount);
        this.amount = amount;
    }

    protected int getAmount(){
        return amount;
    }

    private void Validate(int amount) {
        if(amount < 0){
            throw new IllegalArgumentException("The amount must be positive.");
        }
    }

}
