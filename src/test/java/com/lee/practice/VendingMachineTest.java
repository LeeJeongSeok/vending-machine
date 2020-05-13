package com.lee.practice;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class VendingMachineTest {

    @Test
    public void VendingMachine_생성후_현재_투입된_금액_표시() {
        VendingMachine machine = new VendingMachine(10000);
        assertThat(10000).isEqualTo(machine.currentMoney());
    }

    @Test
    public void VendingMachine에_남아있는_잔돈반환() {

        //given
        VendingMachine machine = new VendingMachine(5800);

        //when
        machine.returnChange();

        //that
        assertThat(machine.returnChange()).isEqualTo(machine.currentMoney());
    }

    @Test
    public void VendingMachine에서_음료값을_지불() {

        //given
        VendingMachine machine = new VendingMachine(10000);

        //when
        int returnChange = machine.getOrderDrink(5000);

        //that
        assertThat(returnChange).isEqualTo(machine.currentMoney());
    }


}
