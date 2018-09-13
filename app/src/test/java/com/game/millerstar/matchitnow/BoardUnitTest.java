package com.game.millerstar.matchitnow;

import android.content.res.Resources;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardUnitTest {
    private Resources resources;

    @Test
    public void board_updateDiscrepancy_score() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER, resources);
        Board beginnerBoard = new Board(beginnerCardDeck.getCardDeck());

        beginnerBoard.updateScore(false);
        assertEquals("",0,beginnerBoard.getNumOfMatches());
    }

    @Test
    public void board_update_score() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER, resources);
        Board beginnerBoard = new Board(beginnerCardDeck.getCardDeck());

        beginnerBoard.updateScore(true);
        beginnerBoard.updateScore(true);

        assertEquals("",2,beginnerBoard.getNumOfMatches());
    }

}
