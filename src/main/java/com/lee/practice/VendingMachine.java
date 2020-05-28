package com.lee.practice;

import javafx.geometry.VerticalDirection;

public class VendingMachine {

    private int money;

    public VendingMachine(int money) {
        this.money = money;
    }

    public void terminateMachine(int code) {
        if (code <= 0) {
            System.out.println("Vending Machine이 종료되었습니다.");
        }
    }

    public int receiveFromUser(int i) {
        return i;
    }

    public int returnChange(int i) {



        return money = 0;
    }

}
