package com.lee.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> list = new HashMap<>();
        list.put(1, 500);
        list.put(2, 1000);
        list.put(3, 1500);

        Comment comment = new Comment();
        comment.welcome();

        Scanner sc = new Scanner(System.in);
        VendingMachine machine = new VendingMachine(sc.nextInt());

        comment.insertMoney();
        System.out.println("현재 자판기에 있는 금액 : " + machine.currentAmount() + "원");

        comment.printMenu();


        int userChoice = sc.nextInt();
        machine.selectDrink(userChoice);

        System.out.println("현재 주문하신 음료는 " + userChoice + "번 음료이며, 가격은" + list.get(userChoice) + "원 입니다.");

        System.out.println("결제 하시겠습니까? (y/n)");

        char pay = sc.next().charAt(0);

        if (pay == 'y') {
            machine.pay();
        } else {
            System.out.println("결제가 취소되었습니다.");
        }

        /*
        음료수가 제조되는 로직 추가
         */

        sc.nextLine();

        System.out.println("잔돈을 반환하시겠습니까? (y/n)");
        char change = sc.next().charAt(0);

        if (change == 'y') {
            machine.returnChange();
        } else {
            System.out.println("자판기에게 용돈을 주셨습니다.");
            sc.close();
        }
    }
}
