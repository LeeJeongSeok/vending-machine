package com.lee.practice;

import javafx.geometry.VerticalDirection;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public int selectDrink(int i) {
        if (i == 1) {
            return 500;
        } else if (i == 2) {
            return 1000;
        }  else {
            return 1500;
        }
    }

    public int currentAmount() {
        return money;
    }

    public int pay(int price) {
        return this.money -= price;
    }

    public int returnChange() {
        this.money = 0;
        return money;
    }
}
