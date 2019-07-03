package com.stackroute.exercise3;

public class MatrixSum {

  // for finding matrix sum

  public int[][] checkSum(int rows, int colums, int a1[][], int a2[][]) {
    int sum[][] = new int[rows][colums];// array variable to store result
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colums; j++) {
        sum[i][j] = a1[i][j] + a2[i][j]; // adding two matrices and storing in sum
      }
    }
    return sum;
  }

}
