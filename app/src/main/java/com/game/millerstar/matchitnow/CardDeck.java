package com.game.millerstar.matchitnow;

import android.support.annotation.VisibleForTesting;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardDeck {

    // For testing only!!!!!
    private static long SEED = -1;

    // class members
    public final static String PACKAGE = "com.game.millerstar.matchitnow";
    private List<Card> cardDeck;
    private int deckSize;
    private final String[] drawableArray;
    private String draPrefix = "R.drawable.";
    private Resources resources;


    // constructor
    public CardDeck(Level level, Resources resources) {
        this.drawableArray = new String[]{draPrefix + "chess_card_image", draPrefix + "classic_game_boy_card_image"};
        this.deckSize = level.getNumOfCards();
        this.cardDeck = new ArrayList<>();
        this.cardDeck = this.generateCardDeck();
        this.resources = resources;
    }

    // getters
    public List<Card> getCardDeck() {
        return cardDeck;
    }

    @VisibleForTesting
    static void setRandomSeed(long seed) {
        SEED = seed;
    }

    // methods
    private List<Card> generateCardDeck() {
        for (int i = 0; i < this.deckSize; i++) {
            Card card = new Card(getDrawable(drawableArray[i]));
            cardDeck.add(card);
        }

        shuffleCards(cardDeck);
        return cardDeck;
    }

    private void shuffleCards(List<Card> cardDeck) {
        Random rand = SEED > 0 ? new Random(SEED) : new Random();

        Collections.shuffle(cardDeck, rand);
    }

    private int getDrawable(String name) {
        return getId(name, "drawable");
    }

    private int getId(String name, String type) {
        return resources.getIdentifier(name, type, PACKAGE);
    }

}
