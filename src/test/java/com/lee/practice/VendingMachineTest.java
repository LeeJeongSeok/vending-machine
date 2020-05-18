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
    Map<String, Integer> menuList;

    @Rule
    public final ProvideSystemProperty myPropertyHasMyValue
            = new ProvideSystemProperty("MyProperty", "MyValue");

    @Before
    public void setUp() {
        machine = new VendingMachine(10000);
        menuList = new HashMap<>();

        menuList.put("아메리카노", 2000);
        menuList.put("카페라때", 2500);
        menuList.put("돌체라때", 3000);
    }

    @Test
    public void 메뉴판_출력() {

        System.out.println("VendingMachine V1 입니다.");
        System.out.println("원하는 음료는 입력해주세요");
        System.out.println("아메리카노 : " + menuList.get("아메리카노") + "원");
        System.out.println("카페라때 : " + menuList.get("카페라때") + "원");
        System.out.println("돌체라때 : " + menuList.get("돌체라때") + "원");
    }

    @Test
    public void VendingMachine_생성후_현재_투입된_금액_표시() {
        assertThat(10000).isEqualTo(machine.currentMoney());
    }

    @Test
    public void 음료_선택() {

        String americano = "아메리카노";
        String latte = "카페라때";
        String dolce = "돌체라때";

        assertThat(menuList.get("아메리카노")).isEqualTo(machine.chooseDrink(menuList.get(americano)));
        assertThat(menuList.get("카페라때")).isEqualTo(machine.chooseDrink(menuList.get(latte)));
        assertThat(menuList.get("돌체라때")).isEqualTo(machine.chooseDrink(menuList.get(dolce)));


    }

    @Test
    public void VendingMachine에서_음료값을_지불() {


        assertThat(machine.getOrderDrink(menuList.get("아메리카노"))).isEqualTo(machine.currentMoney());
        assertThat(machine.getOrderDrink(menuList.get("카페라때"))).isEqualTo(machine.currentMoney());
        assertThat(machine.getOrderDrink(menuList.get("돌체라때"))).isEqualTo(machine.currentMoney());

    }

    @Test
    public void VendingMachine에_남아있는_잔돈반환() {
        assertThat(machine.returnChange()).isEqualTo(machine.currentMoney());
    }
}
