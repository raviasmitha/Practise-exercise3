package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckCharTest {
    CheckChar cc;

    @Before
    public void setUp() throws Exception {
        cc = new CheckChar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = cc.remVow(str);

        assertArrayEquals(expected, actual);
    }

}