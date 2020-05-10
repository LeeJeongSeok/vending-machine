package com.lee.practice;

public class Drink {

    private String drink;
    private int price;

    public Drink(String drink) {
        this.drink = drink;
    }

    public Drink(String drink, int price) {
        this.drink = drink;
        this.price = price;
    }

    public String getDrink() {
        return drink;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "현재 주문한 음료는 " + drink + "이며, 가격은 " + price + "입니다.";
    }

}
