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
    private CoffeeMenu menu;


    @Before
    public void setUp() {
        machine = new VendingMachine(10000);
        menu = new CoffeeMenu();
        menu.welcome();
    }

    @Test
    public void 자판기_종료() {
        machine.terminateMachine(0);
    }

    @Test
    public void 거스름돈_반환() {

        //given

        //when

        //then


        assertThat(machine.returnChange(0)).isEqualTo(0);
        assertThat(machine.returnChange(1)).isEqualTo(1);
        assertThat(machine.returnChange(300)).isEqualTo(300);
        assertThat(machine.returnChange(3005)).isEqualTo(3005);
    }

    @Ignore
    @Test
    public void 사용자로_부터_넘어온_키값_매칭() {
        Map<Integer, Integer> list = new HashMap<>();
        list.put(1, 500);
        list.put(2, 1000);
        list.put(3, 2000);

        assertThat(500).isEqualTo(list.get(machine.receiveFromUser(1)));
        assertThat(1000).isEqualTo(list.get(machine.receiveFromUser(2)));
        assertThat(2000).isEqualTo(list.get(machine.receiveFromUser(3)));
    }
}
