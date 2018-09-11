package com.game.millerstar.matchitnow;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    // class members
    private ArrayList<Card> cardDeck;
    private int deckSize;

    // constructor
    public CardDeck(Level level) {
        this.deckSize = level.getNumOfCards();
        this.cardDeck = new ArrayList<>();
        this.cardDeck = this.generateCardDeck();
    }

    // getters
    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

    // methods
    private ArrayList<Card> generateCardDeck() {
        for (int i = 0; i < this.deckSize; i++) {
            Card card = new Card(R.drawable.chess_card_image);
            cardDeck.add(card);
        }
        Collections.shuffle(cardDeck);
        return cardDeck;
    }


}
