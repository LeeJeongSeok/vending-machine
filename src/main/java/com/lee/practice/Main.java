package com.lee.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.showMenu1();

        Scanner scanner = new Scanner(System.in);

        VendingMachine vendingMachine = new VendingMachine(scanner.nextInt());
        System.out.println("현재 금액 : " + vendingMachine.getBalance());

        coffeeMenu.showMenu2();
        scanner.nextLine();

        Drink drink = new Drink(scanner.nextLine());
        System.out.println("선택한 메뉴 : " + drink.getDrink());

    }
}
