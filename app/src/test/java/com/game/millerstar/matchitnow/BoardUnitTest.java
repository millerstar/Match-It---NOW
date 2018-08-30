package com.game.millerstar.matchitnow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardUnitTest {

    @Test
    public void board_beginnerLevel_generates4col3row() {
        Board beginnerBoard = new Board(Level.BEGINNER);

        assertEquals("Column Number is incorrect", 4, beginnerBoard.getColNumber());
        assertEquals("Rows number is incorrect", 3, beginnerBoard.getRowNumber());
        assertEquals("The board level is incorrect", Level.BEGINNER, beginnerBoard.getBoardLevel());
    }

    @Test
    public void board_isBoardSolved_false() {
        Board intermediateBoard = new Board(Level.INTERMEDIATE);
        boolean isSolved = intermediateBoard.isSolved();

        assertFalse("The board is already solved", isSolved);
    }

    @Test
    public void board_generat12eCards_beginnerLevel() {
        Board beginnerBoard = new Board(Level.BEGINNER);
        int numOfCards = beginnerBoard.getCardsBoard().size();

        assertEquals("Number of cards is incorrect",12,numOfCards);
    }


}
