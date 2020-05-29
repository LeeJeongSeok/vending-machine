package com.lee.practice;

import javafx.geometry.VerticalDirection;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private int money;
    private int paymentAmount;

    public VendingMachine(int money) {
        this.money = money;
    }

    public Map<Integer, Integer> menuInit() {
        Map<Integer, Integer> list = new HashMap<>();
        list.put(1, 500);
        list.put(2, 1000);
        list.put(3, 1500);
        return list;
    }

    public int selectDrink(int i) {
        if (i == 1) {
            paymentAmount += 500;
        } else if (i == 2) {
            paymentAmount += 1000;
        }  else {
            paymentAmount += 1500;
        }
        return paymentAmount;
    }

    public int currentAmount() {
        return money;
    }

    public int pay() {
        return this.money -= paymentAmount;
    }

    public int returnChange() {
        this.money = 0;
        return money;
    }
}
