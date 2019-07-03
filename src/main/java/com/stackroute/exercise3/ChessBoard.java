package com.stackroute.exercise3;

public class ChessBoard {
  // function for printing chess board

  public String[][] display(int rows, int cols) {
    {
      String output[][] = new String[rows][cols]; // new string for storing output
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
          if (((i + j) % 2) == 0) { // checking the position on the chessboard is even or odd
            output[i][j] = "WW"; // if even then white
          } else {
            output[i][j] = "BB"; // if odd then black
          }

        }
      }
      return output;
    }
  }
}

