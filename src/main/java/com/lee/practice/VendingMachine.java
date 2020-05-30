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
        list.put(3, 2000);
        list.put(4, 1500);
        list.put(5, 1000);
        list.put(6, 1000);
        list.put(7, 1500);
        list.put(8, 500);
        return list;
    }

    public int selectDrink(int i) {
       switch (i) {
           case 1:
               paymentAmount = 500;
               break;
           case 2:
               paymentAmount = 1000;
               break;
           case 3:
               paymentAmount = 2000;
               break;
           case  4:
               paymentAmount = 1500;
               break;
           case 5:
               paymentAmount = 1000;
               break;
           case 6:
               paymentAmount = 1000;
               break;
           case 7:
               paymentAmount = 1500;
               break;
           case 8:
               paymentAmount = 500;
               break;
           default:
               System.out.println("자판기에 없는 메뉴를 선택하셨습니다.");
               break;
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
        return money = 0;
    }
}
