package com.stackroute.exercise3;

import static org.junit.Assert.*;


import org.junit.*;

import static org.junit.Assert.*;

public class MatrixSumTest {
  MatrixSum matrixSum;

  @Before
  public void setUp() throws Exception {
    matrixSum = new MatrixSum();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void check() {
    int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
    int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
    int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
    int[][] actual = matrixSum.checkSum(3, 2, a1, a2);

    assertArrayEquals(expected, actual);
  }

}
