package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckCharTest {
    CheckChar checkChar;

    @Before
    public void setUp() throws Exception {
        checkChar = new CheckChar();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestCheck() {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = checkChar.remVow(str);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestCheckGivenOnlyConsonents() {
        String[] expected = {"bcdfg", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"bcdfg", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] actual = checkChar.remVow(str);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void TestCheckGivenOnlyVowels() {
        String[] expected = {"", "", "", "", ""};
        String[] str = {"aeiou", "aei", "ou", "aoui", ""};
        String[] actual = checkChar.remVow(str);

        assertArrayEquals(expected, actual);
    }
}