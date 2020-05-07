package com.lee.practice;

public class MoneyChange {

    private int money;

    public void addChange(int money) {
        this.money += money;
    }

    public int getBalance() {
        return money;
    }
}
