package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.*;

public class ChessBoardTest {

  ChessBoard chessBoard;

  @Before
  public void setUp() throws Exception {
    chessBoard = new ChessBoard();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testCheck() {
    String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

    String [][] actual = chessBoard.display(8,8);

    assertArrayEquals("Following is chessPattern output",expected,actual);
  }

  @Test
  public void testCheckForFour() {
    String expected[][]={{"WW","BB","WW","BB"},{"BB","WW","BB","WW"},{"WW","BB","WW","BB"},{"BB","WW","BB","WW"}};

    String [][] actual = chessBoard.display(4,4);

    assertArrayEquals("Following is chessPattern output",expected,actual);
  }

  @Test
  public void testCheckForTwo() {
    String expected[][]={{"WW","BB"},{"BB","WW"}};

    String [][] actual = chessBoard.display(2,2);

    assertArrayEquals("Following is chessPattern output",expected,actual);
  }

}
