package com.lee.practice;

public class Comment {

    public static void welcome() {
        System.out.println("===========================================================");
        System.out.println("================== Vending Machine 입니다. ==================");
        System.out.println("================== 원하시는 금액을 넣어주세요.  ==================");

    }

    public static void insertMoney() {
        System.out.println("==================    돈을 투입되었습니다.   ===================");
    }

    public static void printMenu() {

        System.out.println("================== 커피 자판기의 메뉴입니다. ==================");
        System.out.println("1. 아메리카노 : 500");
        System.out.println("2. 카페 라때 : 1000");
        System.out.println("3. 마끼야또 : 2000");
        System.out.println("4. 핫초코 : 1500");
        System.out.println("5. 녹차 : 1000");
        System.out.println("6. 아이스티 : 1000");
        System.out.println("7. 아보카도 : 1500");
        System.out.println("8. 레쓰비 : 500");
        System.out.println("원하시는 음료의 번호를 입력해주세요");
    }

    public static void payment() {
        System.out.println("결제 하시겠습니까? (y/n)");
    }

    public static void please_wait() {
        System.out.println("주문하신 음료가 만들어지는 중입니다. 잠시만 기달려주세요~");
    }

}
