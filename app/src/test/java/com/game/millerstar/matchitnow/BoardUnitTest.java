package com.game.millerstar.matchitnow;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardUnitTest {

    @Test
    public void board_beginnerLevel_deck_of_12_cards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        Board beginnerBoard = new Board(beginnerCardDeck.getCardDeck());

        int numOfCards = beginnerBoard.getCards().size();

        assertEquals("Column Number is incorrect", 12, numOfCards);
    }

}
