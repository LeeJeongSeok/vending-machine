package com.lee.practice;

public class Comment {

    public void welcome() {
        System.out.println("========================================================");
        System.out.println("================== 커피 자판기의 메뉴입니다. ==================");
        System.out.println("================== 돈을 입력해주세요. ==================");

    }

    public void insertMoney() {
        System.out.println("================== 돈을 투입되었습니다. ==================");
        System.out.println("================== 커피 자판기가 작동합니다. ==================");
    }

    public void printMenu() {

        System.out.println("========================================================");
        System.out.println("================== 커피 자판기의 메뉴입니다. ==================");
        System.out.println("1. 아메리카노 : 500");
        System.out.println("2. 카페 라때 : 1000");
        System.out.println("3. 마끼야또 : 2000");
        System.out.println("========================================================");
        System.out.println("========================================================");
        System.out.println("원하시는 음료의 번호를 입력해주세요");
    }
}