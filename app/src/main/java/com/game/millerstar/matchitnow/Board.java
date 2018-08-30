package com.game.millerstar.matchitnow;

import java.util.ArrayList;

public class Board {

    // class members
    private int colNumber;
    private int rowNumber;
    private int pairNum;
    Level boardLevel;
    private boolean isSolved;
    private int numOfMatches;
    private double timeScore;
    private ArrayList<Card> cardsBoard;

    // constructor
    public Board(Level level) {
        this.boardLevel = level;
        this.cardsBoard = new ArrayList<>();
        generateBoard(this.boardLevel);
        generatePairs(this.getPairNum());

    }

    // getters & Setters
    public int getColNumber() {
        return colNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public Level getBoardLevel() {
        return boardLevel;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public int getNumOfMatches() {
        return numOfMatches;
    }

    public double getTimeScore() {
        return timeScore;
    }

    public int getPairNum() {
        return pairNum;
    }

    public ArrayList<Card> getCardsBoard() {
        return cardsBoard;
    }

    // methods
    public void generatePairs(int pairNumber) {
        for (int i = 0; i <pairNumber * 2 ; i++) {
            Card card = new Card("imageURL");
            cardsBoard.add(card);
        }
    }

    private void generateBoard(Level level) {
        this.timeScore = 0.0;
        this.numOfMatches = 0;
        this.isSolved = false;
        this.pairNum = 0;

        switch (level) {
            case EXPERT:
                this.colNumber = 7;
                this.rowNumber = 5;
                break;
            case INTERMEDIATE:
                this.colNumber = 5;
                this.rowNumber = 4;
                break;
            case BEGINNER:
                this.colNumber = 4;
                this.rowNumber = 3;
                break;
            default:
                this.colNumber = 4;
                this.rowNumber = 3;
                break;
        }
        this.pairNum = (this.colNumber * this.rowNumber) / 2;
    }
}
