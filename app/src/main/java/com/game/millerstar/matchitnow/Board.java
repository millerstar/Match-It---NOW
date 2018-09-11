package com.game.millerstar.matchitnow;

import java.util.ArrayList;

public class Board {

    // class members
    private boolean isSolved;
    private int numOfMatches;
    private double timeScore;
    private ArrayList<Card> cardDeck;

    // constructor
    public Board(ArrayList<Card> cardDeck) {
        this.timeScore = 0.0;
        this.numOfMatches = 0;
        this.isSolved = false;
        this.cardDeck = cardDeck;

//        boolean equals = this.cardDeck.get(0).equals(this.cardDeck.get(10));
    }

    // getters & Setters
    public boolean isSolved() {
        return isSolved;
    }

    public int getNumOfMatches() {
        return numOfMatches;
    }

    public double getTimeScore() {
        return timeScore;
    }

    public ArrayList<Card> getCards() {
        return cardDeck;
    }

    // methods
    // TODO: activate board start timer
    public void startGame() {

    }

    // TODO: clear board data
    public void clearBoard() {

    }
}
