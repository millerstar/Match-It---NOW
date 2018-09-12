package com.game.millerstar.matchitnow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardUnitTest {

    @Test
    public void board_updateDiscrepancy_score() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        Board beginnerBoard = new Board(beginnerCardDeck.getCardDeck());

        beginnerBoard.updateScore(false);
        assertEquals("",0,beginnerBoard.getNumOfMatches());
    }

    @Test
    public void board_update_score() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        Board beginnerBoard = new Board(beginnerCardDeck.getCardDeck());

        beginnerBoard.updateScore(true);
        beginnerBoard.updateScore(true);

        assertEquals("",2,beginnerBoard.getNumOfMatches());
    }

}
