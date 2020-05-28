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

    VendingMachine machine;

    private void setUp() {
        machine = new VendingMachine();
    }
    @Test
    public void canCreateVendingMachine() {
        setUp();
    }

    @Test
    public void insertMoney() {
        setUp();
        machine.insertMoney(1);
    }
}
