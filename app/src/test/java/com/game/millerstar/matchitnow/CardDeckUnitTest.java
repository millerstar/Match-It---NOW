package com.game.millerstar.matchitnow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CardDeckUnitTest {

    @Test
    public void cardDeck_beginnerLevel_generateBeginnerDeck12Cards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        ArrayList<Card> cardsArray = beginnerCardDeck.getCardDeck();

        assertEquals("Beginner deck size in incorrect", 12, cardsArray.size());
    }

    @Test
    public void cardDeck_compare2EqualCards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        ArrayList<Card> cardsArray = beginnerCardDeck.getCardDeck();

        boolean isEqual = cardsArray.get(0).equals(cardsArray.get(1));

        assertTrue("The pair of cards is not equal",isEqual);
    }

    @Test
    public void cardDeck_beginnerLevel_isValidDeck() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        ArrayList<Card> cardsArray = beginnerCardDeck.getCardDeck();
        HashMap<Integer, Integer> cardDeckMap = new HashMap<>();

        for (Card card : cardsArray) {
            if (!cardDeckMap.containsKey(card.getImageId())) {
                cardDeckMap.put(card.getImageId(), 1);
            } else {
                cardDeckMap.put(card.getImageId(), cardDeckMap.get(card.getImageId()) + 1);
            }
        }

        for (Integer val : cardDeckMap.values()) {
            assertTrue("Number of card pairs is incorrect",val == 2);
        }
    }

}
