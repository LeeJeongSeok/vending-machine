package com.lee.practice;

public class VendingMachine {

    private int money;

    public void terminateMachine(int code) {
        if (code <= 0) {
            System.out.println("Vending Machine이 종료되었습니다.");
        }
    }

    public void insertMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int buyDrink(int i) {

        if (money <= 0) {
            return 0;
        }

        return money -= i;
    }
}
