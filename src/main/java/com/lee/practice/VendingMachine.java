package com.lee.practice;

public class VendingMachine {

    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public int currentMoney() {
        System.out.println("현재 투입된 금액은 : " + money);
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

}
