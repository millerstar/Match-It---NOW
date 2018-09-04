package com.game.millerstar.matchitnow;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    // class members
    private ArrayList<Card> cardDeck;
    private int deckSize;

    // constructor
    public CardDeck(Level level) {
        cardDeck = new ArrayList<>();
        this.deckSize = level.getNumberOfColumns() * level.getNumberOfRows();
    }

    // methods


    public ArrayList<Card> generateCardDeck() {
        int[] myArray = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6}; // temp line
        for (int i = 0; i < this.deckSize; i++) {
            Card card = new Card("imageURL" + myArray[i]);
            cardDeck.add(card);
        }
        Collections.shuffle(cardDeck);
        return cardDeck;
    }

    public boolean compareTwoCards(Card firstCard, Card secondCard) {
        return firstCard.getImageURL().equalsIgnoreCase(secondCard.getImageURL());
    }
}
