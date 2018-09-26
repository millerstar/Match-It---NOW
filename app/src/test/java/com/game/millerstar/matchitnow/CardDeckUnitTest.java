package com.game.millerstar.matchitnow;

import android.content.res.Resources;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static com.google.common.truth.Truth.assertThat;


public class CardDeckUnitTest {
//    @Before
//    public void setUp() {
//        CardDeck.setRandomSeed(15L); // Shuffle array will be the same for all tests
//    }

    @Test
    public void cardDeck_beginnerLevel_generateBeginnerDeck12Cards() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray = beginnerCardDeck.getCardDeck();

        assertEquals("Beginner deck size in incorrect", Level.BEGINNER.getNumOfCards(), cardsArray.size());
    }

    @Test
    public void cardDeck_beginnerLevel_generateBeginnerDeck6Pairs() {
        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray = beginnerCardDeck.getCardDeck();

        HashMap<Integer, Integer> cardDeckMap = new HashMap<>();

        for (Card card : cardsArray) {
            if (!cardDeckMap.containsKey(card.getImageId())) {
                cardDeckMap.put(card.getImageId(), 1);
            } else {
                cardDeckMap.put(card.getImageId(), cardDeckMap.get(card.getImageId()) + 1);
            }
        }

        for (Integer val : cardDeckMap.values()) {
            assertTrue("Number of card pairs is incorrect", val == 2);
        }
    }

    @Test
    public void cardDeck_beginnerLevel_generateBeginnerDeck_shuffleUniqueDeck() {
        CardDeck beginnerCardDeck1 = new CardDeck(Level.BEGINNER);
        CardDeck beginnerCardDeck2 = new CardDeck(Level.BEGINNER);
        List<Card> cardsArray1 = beginnerCardDeck1.getCardDeck();
        List<Card> cardsArray2 = beginnerCardDeck2.getCardDeck();

        assertTrue("The card deck is not unique", !cardsArray1.equals(cardsArray2));
    }

//    @Test
//    public void cardDeck_beginnerLevel_TwoConsecutiveCardsAreEqualInTheGeneratedCardsArray() {
//        CardDeck beginnerCardDeck = new CardDeck(Level.BEGINNER);
//        List<Card> cardsArray = beginnerCardDeck.getCardDeck();
//
//        HashMap<Integer, Integer[]> cardDeckMap = new HashMap<>();
//        cardDeckMap.put(cardsArray.get(0).getImageId(), new Integer[]{0, 0});
//        int secondCardIndex = 0;
//        for (int i = 1; i < cardsArray.size(); i++) {
//
//            if (cardDeckMap.containsKey(cardsArray.get(i).getImageId())) {
//                secondCardIndex = i;
//                cardDeckMap.put(cardsArray.get(i).getImageId(), new Integer[]{0, secondCardIndex});
//            }
//        }
//
//        boolean isEqual = cardsArray.get(0).equals(cardsArray.get(secondCardIndex));
//
//        assertTrue("The pair of cards is not equal", isEqual);
//    }

    /*@Test
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
    }*/

}
