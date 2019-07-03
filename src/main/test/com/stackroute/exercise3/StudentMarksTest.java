package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.*;

public class StudentMarksTest {

  StudentMarks studentMarks;

  @Before
  public void setUp() throws Exception {
    studentMarks = new StudentMarks();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void TestCheckMarks() {
    String expected = "All marks are correct";
    int array[] = {62, 23, 34};
    String actual = studentMarks.check(array, 3);

    assertEquals("Following is of studentmarks class", expected, actual);
  }

  @Test
  public void TestCheckFailure() {
    String expected = "Error";
    int array[] = {62, 23, 134};
    String actual = studentMarks.check(array, 3);

    assertEquals("Following is of studentmarks class", expected, actual);
  }
}
