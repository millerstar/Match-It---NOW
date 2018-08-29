package com.game.millerstar.matchitnow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardUnitTest {

    @Test
    public void board_beginnerLevel_generates4col3row() {
        Board beginnerBoard = new Board(Level.BEGINNER);

        assertEquals("Column Number is incorrect",4, beginnerBoard.getColNumber());
        assertEquals("Rows number is incorrect",3, beginnerBoard.getRowNumber());
    }

}
