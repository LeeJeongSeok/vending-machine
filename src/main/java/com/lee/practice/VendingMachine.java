package com.lee.practice;

public class VendingMachine {

    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public int currentMoney() {
        return money;
    }

    public int returnChange() {
        this.money = 0;
        return money;
    }

    public int getOrderDrink(int amount) {
        money -= amount;
        return money;
    }

    public int chooseDrink(String drink) {

        return 2000;
    }

}
