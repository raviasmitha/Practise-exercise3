package com.stackroute.exercise3;

import static org.junit.Assert.*;


import org.junit.*;

import static org.junit.Assert.*;

public class MyDateTest {


  MyDate myDate;

  @BeforeClass
  public static void setUpOnce() {
  }

  @AfterClass
  public static void teardownOnce() {
  }

  @Before
  public void setUp() {
    myDate = new MyDate();
  }

  @After
  public void tearDown() {
    myDate = null;
  }

  @Test
  public void TestStartDate() {
    boolean expectedValue = true;
    boolean actualValue = myDate.startDate();
    assertEquals(expectedValue, actualValue);
    assertNotNull(actualValue);
  }

  @Test
  public void TestEndDate() {
    boolean expectedValue1 = true;
    boolean actualValue1 = myDate.endDate();
    assertEquals(expectedValue1, actualValue1);
    assertNotNull(actualValue1);
  }


}
