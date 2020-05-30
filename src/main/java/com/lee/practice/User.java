package com.lee.practice;

import org.junit.Test;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class User {

    VendingMachine machine;
    Map<Integer, Integer> list;

    public void insertCoinToMachine(int money) {
        machine = new VendingMachine(money);
        System.out.println("현재 자판기에 있는 금액 : " + machine.currentAmount() + "원");
    }

    public void initMenu() {
        list = machine.menuInit();
    }

    public void  orderBeverageToMachine(int beverage) {
        machine.selectDrink(beverage);
        System.out.println("현재 주문하신 음료는 " + beverage + "번 음료이며, 가격은" + list.get(beverage) + "원 입니다.");
    }

    public boolean payment(char pay) {
        if (pay != 'y') {
            System.out.println("결제가 취소되었습니다.");
            return false;
        }
        machine.pay();
        System.out.println("결제가 완료되었습니다.");
        return true;
    }

    public void makingBeverage() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("주문하신 음료가 나왔습니다!");
                System.out.println("잔돈을 반환하시겠습니까? (y/n)");
                System.out.println("현재 남은 잔돈 : " + machine.currentAmount() + "원");
            }
        };
        timer.schedule(task, 3000);
    }

    public void returnChange(char change) {
        if (change != 'y') {
            System.out.println("자판기에게 용돈을 주셨습니다.");
            System.out.println("안녕히 가세요");
        }
        machine.returnChange();
        System.out.println("현재 자판기에 있는 금액 : " + machine.currentAmount() + "원");
        System.out.println("안녕히 가세요");
    }

}
