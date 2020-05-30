package com.lee.practice;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine(3000);
    }

    @Test
    public void initMenu() {
        machine.menuInit();
    }

    @Test
    public void insertCoinToMachine() {
        assertThat(machine.currentAmount()).isEqualTo(3000);
    }

    @Test
    public void orderBeverageToMachine() {
        int userChoice = 3;
        machine.selectDrink(userChoice);
    }

    @Test
    public void payment() {
        // 결제(payment)
        System.out.println("결제 하시겠습니까? (y/n)");

        char pay = 'y';

        if (pay == 'y')
            machine.pay();

        System.out.println("결제가 취소되었습니다.");
    }

    @Test
    public void makingBeverage() {

    }

    @Test
    public void returnChange() {

    }
}
