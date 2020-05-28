package com.lee.practice;

public class User {

    private int money;

    private VendingMachine machine;

    // when user input money
    public void insertMoney(int money) {
        machine = new VendingMachine(10000);
    }

    // when user input order number
    public void orderToMachine(int number) {
        machine.receiveFromUser(number);
    }
}
