package com.lee.practice;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ClearSystemProperties;
import org.junit.contrib.java.lang.system.ProvideSystemProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;


public class VendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine(10000);
    }

    private Map<Integer, Integer> menuInit() {
        Map<Integer, Integer> list = new HashMap<>();
        list.put(1, 500);
        list.put(2, 1000);
        list.put(3, 1500);
        return list;
    }

    @Test
    public void 제품_choice() {

        //given
        Map<Integer, Integer> list = menuInit();

        //when
        int userChoice = 3;

        //then
        assertThat(machine.selectDrink(userChoice)).isEqualTo(list.get(userChoice));

        System.out.println("현재 주문하신 음료는 " + userChoice + "번 음료이며, 가격은" + list.get(userChoice) + "원 입니다.");
    }

    @Test
    public void 제품_pay() {

        //given
        Map<Integer, Integer> list = menuInit();

        //when
        int userChoice = 3;

        //then
        assertThat(machine.pay(list.get(userChoice))).isEqualTo(machine.currentAmount());
        System.out.println(list.get(userChoice) + "원이 결제됩니다.  잔돈 : " + machine.currentAmount() + "원");

    }

    @Test
    public void 잔돈_반환() {

        //given
        Map<Integer, Integer> list = menuInit();

        //then
        assertThat(0).isEqualTo(machine.returnChange());
        System.out.println("잔돈이 반환되었습니다. 안녕히 가세요  잔돈 : " + machine.currentAmount() + "원");
    }
}
