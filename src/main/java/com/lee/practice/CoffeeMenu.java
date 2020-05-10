package com.lee.practice;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMenu {

    public void showMenu1() {
        System.out.println("===============================================================");
        System.out.println("Vending Machine v1 입니다.              ");
        System.out.println("돈을 넣어주세요.          ");
        System.out.println("===============================================================");
    }

    public void showMenu2() {
        System.out.println("===============================================================");
        System.out.println("원하는 음료를 입력해주세요.  Ex) 아메리카노        ");
        System.out.println("===============================================================");
    }

    public void showMenu3() {
        System.out.println("===============================================================");
        System.out.println("음료 값을 계산합니다.          ");
        System.out.println("===============================================================");
    }

    public void showOrderList(String coffee, int price) {
        System.out.println(coffee + "을 주문하셨습니다. 결제 금액은" + price + "원입니다.");
    }
}
