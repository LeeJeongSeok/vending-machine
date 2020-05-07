package com.lee.practice;

public class Drink {

    private String drink;
    private int amount;

    public Drink(String drink, int amount) {
        this.drink = drink;
        this.amount = amount;
    }

    public int getPrice() {
        return this.amount;
    }
}
