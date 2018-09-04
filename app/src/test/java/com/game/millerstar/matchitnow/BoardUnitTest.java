package com.game.millerstar.matchitnow;

import android.util.Log;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
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
    public void cardDeck_beginnerLevel_generateBeginnerDeck12Cards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        ArrayList<Card> cardsDeckArray = beginnerCardDeck.generateCardDeck();

        assertEquals("Beginner deck size in incorrect", 12, cardsDeckArray.size());
    }

    @Test
    public void cardDeck_beginnerLevel_isValidDeck() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        ArrayList<Card> cardsDeckArray = beginnerCardDeck.generateCardDeck();
        HashMap<String, Integer> cardDeckMap = new HashMap<>();

        for (Card card : cardsDeckArray) {
            if (!cardDeckMap.containsKey(card.getImageURL())) {
                cardDeckMap.put(card.getImageURL(), 1);
            } else {
                cardDeckMap.put(card.getImageURL(), cardDeckMap.get(card.getImageURL()) + 1);
            }
        }

        for (Integer val : cardDeckMap.values()) {
            assertTrue("Number of card pairs is incorrect",val == 2);
        }
    }

    @Test
    public void cardDeck_compare2EqualCards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        Card card1 = new Card("myImageURL");
        Card card2 = new Card("myImageURL");

        boolean isEqual = beginnerCardDeck.compareTwoCards(card1,card2);

        assertTrue("The pair of cards is not equal",isEqual);
    }

    @Test
    public void cardDeck_compare2UnequalCards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        Card card1 = new Card("firstImageURL");
        Card card2 = new Card("secondImageURL");

        boolean isEqual = beginnerCardDeck.compareTwoCards(card1,card2);

        assertFalse("The pair of cards is equal",isEqual);
    }


   /* @Test
    public void board_generat12eCards_beginnerLevel() {
        Board beginnerBoard = new Board(Level.BEGINNER);
        int numOfCards = beginnerBoard.getCards().size();

        assertEquals("Number of cards is incorrect",12,numOfCards);
    }*/


}
