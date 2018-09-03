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
    public void cardDeck_beginnerLevel_generateBeginnerDeck() {
        Board beginnerBoard = new Board(Level.BEGINNER);
        CardDeck beginnerCardDeck = new CardDeck(beginnerBoard.getBoardLevel());
        beginnerCardDeck.generateCardDeck();

        int beginnerDeckSize = beginnerCardDeck.getCardDeck().size();

        assertEquals("Beginner deck size in incorrect", 12, beginnerDeckSize);
    }


   /* @Test
    public void board_generat12eCards_beginnerLevel() {
        Board beginnerBoard = new Board(Level.BEGINNER);
        int numOfCards = beginnerBoard.getCards().size();

        assertEquals("Number of cards is incorrect",12,numOfCards);
    }*/


}
