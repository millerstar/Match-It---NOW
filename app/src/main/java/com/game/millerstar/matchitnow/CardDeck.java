package com.game.millerstar.matchitnow;

import java.util.ArrayList;

public class CardDeck {

    // class members
    private ArrayList<Card> cardDeck;
    private int deckSize;

    // constructor
    public CardDeck(Level level) {
        cardDeck = new ArrayList<>();
        this.deckSize = level.getColumnAsInt() * level.getRowAsInt();
    }

    // getters & Setters
    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    // methods
    public void generateCardDeck() {
        for (int i = 0; i < this.deckSize; i++) {
            Card card = new Card("imageURL");
            cardDeck.add(card);
        }
    }
}
