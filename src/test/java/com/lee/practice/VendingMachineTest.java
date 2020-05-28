package com.lee.practice;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;


public class VendingMachineTest {

    private VendingMachine machine;
    private CoffeeMenu menu;

    @Before
    public void setUp() {
        machine = new VendingMachine();
        menu = new CoffeeMenu();
        menu.welcome();

    }

    @Test
    public void printMenu() {
        menu.printMenu();
    }

    @Test
    public void 자판기_종료() {
        machine.terminateMachine(0);
    }

    @Test
    public void 투입한_금액_확인() {
        assertThat(machine.getMoney()).isEqualTo(10000);
    }

    @Test
    public void 금액_투입() {
        machine.insertMoney(1);
    }

    @Test
    public void 제품_구메() {
        int change = machine.buyDrink(3000);

        if (change <= 0) {
            machine.terminateMachine(change);
        }

        assertThat(machine.getMoney()).isEqualTo(change);
    }
}
