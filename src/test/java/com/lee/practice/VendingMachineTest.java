package com.lee.practice;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class VendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine(10000);
    }

    @Test
    public void VendingMachine_생성후_현재_투입된_금액_표시() {
        assertThat(10000).isEqualTo(machine.currentMoney());
    }

    @Test
    public void VendingMachine에_남아있는_잔돈반환() {
        assertThat(machine.returnChange()).isEqualTo(machine.currentMoney());
    }

    @Test
    public void VendingMachine에서_음료값을_지불() {

        assertThat(machine.getOrderDrink(4000)).isEqualTo(machine.currentMoney());
    }


}
