package com.lee.practice;

public class VendingMachine {

    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public void setBalance(int money) {
        this.money = money;
    }

    public int getBalance() {
        return this.money;
    }

    public void selectDrink(Drink drink) {
        money -= drink.getPrice();
    }
}
