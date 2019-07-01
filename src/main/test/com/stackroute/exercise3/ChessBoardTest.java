package com.stackroute.exercise3;

import static org.junit.Assert.*;

import org.junit.*;

public class ChessBoardTest {

  ChessBoard cb;

  @Before
  public void setUp() throws Exception {
    cb = new ChessBoard();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void Testcheck() {
    String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};

    String [][] actual = cb.display(8,8);

    assertArrayEquals("Following is chessPattern output",expected,actual);
  }

}
