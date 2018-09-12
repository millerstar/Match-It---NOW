package com.game.millerstar.matchitnow;

import android.support.annotation.VisibleForTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDeck {

    // For testing only!!!!!
    private static long SEED = -1;

    // class members
    private List<Card> cardDeck;
    private int deckSize;

    // constructor
    public CardDeck(Level level) {
        this.deckSize = level.getNumOfCards();
        this.cardDeck = new ArrayList<>();
        this.cardDeck = this.generateCardDeck();
    }

    // getters
    public List<Card> getCardDeck() {
        return cardDeck;
    }

    @VisibleForTesting
    static void setRandomSeed(long seed){
        SEED = seed;
    }

    // methods
    private List<Card> generateCardDeck() {
        for (int i = 0; i < this.deckSize; i++) {
            Card card = new Card(i);
            cardDeck.add(card);
        }

        shuffleCards(cardDeck);
        return cardDeck;
    }

    private void shuffleCards(List<Card> cardDeck){
        Random rand = SEED > 0 ? new Random(SEED) : new Random();

        Collections.shuffle(cardDeck, rand);
    }
}
