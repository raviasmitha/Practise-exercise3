package com.stackroute.exercise3;

import static org.junit.Assert.*;
import org.junit.*;

import static org.junit.Assert.*;

    public class ConsecutiveNumbersTest {
        ConsecutiveNumbers consecutiveNumbers;

        @Before
        public void setUp() throws Exception {
            consecutiveNumbers = new ConsecutiveNumbers();
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void testcheckNotConsecutive() {
            boolean expected = false;

            boolean actual = consecutiveNumbers.checkConsecutive("98,96,95,94,93");

            assertEquals(expected, actual);
        }

        @Test
        public void testCheckConsecutive() {
            boolean expected = true;
            boolean actual = consecutiveNumbers.checkConsecutive("54,53,52,51,50,49,48");

            assertEquals(expected, actual);
        }

        @Test
        public void testChecknonConsecutiveTwo() {
            boolean expected = false;
            boolean actual = consecutiveNumbers.checkConsecutive("1,2,3,4,5,6,6");

            assertEquals(expected, actual);
        }

        @Test
        public void testCheckNonConsecutive() {
            boolean expected = false;
            boolean actual = consecutiveNumbers.checkConsecutive("54,53,54,55,56,55,56");

            assertEquals(expected, actual);
        }

        @Test
        public void testCheckConsecutivenessNegative() {
            boolean expected = true;
            boolean actual = consecutiveNumbers.checkConsecutive("-1,-2,-3,-4,-5,-6,-7");

            assertEquals(expected, actual);
        }


    }
