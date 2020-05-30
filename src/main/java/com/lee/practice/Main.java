package com.lee.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 초기 환경 셋팅 및 작동(init)
        Comment.welcome();
        Scanner sc = new Scanner(System.in);
        User user = new User();

        user.insertCoinToMachine(sc.nextInt());
        Comment.insertMoney();

        user.initMenu();
        Comment.printMenu();
        user.orderBeverageToMachine(sc.nextInt());

        Comment.payment();
        user.payment(sc.next().charAt(0));

        Comment.please_wait();
        user.makingBeverage();

        user.returnChange(sc.next().charAt(0));

        sc.close();
    }
}
