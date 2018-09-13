package com.game.millerstar.matchitnow;

import android.content.res.Resources;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static com.google.common.truth.Truth.assertThat;


public class CardDeckUnitTest {
    @Before
    public void setUp(){
        CardDeck.setRandomSeed(15L); // Shuffle array will be the same for all tests
    }

    @Test
    public void cardDeck_beginnerLevel_generateBeginnerDeck12Cards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray = beginnerCardDeck.getCardDeck();

        assertEquals("Beginner deck size in incorrect", Level.BEGINNER.getNumOfCards(), cardsArray.size());
    }

    @Test
    public void cardDeck_beginnerLevel_TwoConsecutiveCardsAreEqualInTheGeneratedCardsArray() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray = beginnerCardDeck.getCardDeck();

        boolean isEqual = cardsArray.get(0).equals(cardsArray.get(1));

        assertTrue("The pair of cards is not equal",isEqual);
    }

    @Test
    public void cardDeck_beginnerLevel_isValidDeck() {

        List<Card> expected = new ArrayList<>(12);
        expected.add(new Card(6));
        expected.add(new Card(11));
        expected.add(new Card(1));
        expected.add(new Card(2));
        expected.add(new Card(10));
        expected.add(new Card(5));
        expected.add(new Card(4));
        expected.add(new Card(7));
        expected.add(new Card(3));
        expected.add(new Card(8));
        expected.add(new Card(0));
        expected.add(new Card(9));

        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray = beginnerCardDeck.getCardDeck();

        assertThat(cardsArray).containsExactlyElementsIn(expected).inOrder();

//        HashMap<Integer, Integer> cardDeckMap = new HashMap<>();
//
//        for (Card card : cardsArray) {
//            if (!cardDeckMap.containsKey(card.getImageId())) {
//                cardDeckMap.put(card.getImageId(), 1);
//            } else {
//                cardDeckMap.put(card.getImageId(), cardDeckMap.get(card.getImageId()) + 1);
//            }
//        }
//
//        for (Integer val : cardDeckMap.values()) {
//            assertTrue("Number of card pairs is incorrect",val == 2);
//        }
    }

}
