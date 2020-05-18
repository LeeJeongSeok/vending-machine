package com.lee.practice;

public class VendingMachine {

    private int money;
    private int priceOfDrink;

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

    public int chooseDrink(int priceOfDrink) {

        System.out.println("주문한 음료의 가격은 : " + priceOfDrink + "원 입니다.");
        System.out.println("결제하시겠습니까?");

        this.priceOfDrink += priceOfDrink;
        return priceOfDrink;
    }

}
