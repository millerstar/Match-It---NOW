package com.game.millerstar.matchitnow;

import java.util.ArrayList;

public class Board {

    // class members
//    private int colNumber;
//    private int rowNumber;
//    private int pairNum;
    private Level boardLevel;
    private boolean isSolved;
    private int numOfMatches;
    private double timeScore;
    private ArrayList<Card> gameCards;

    // constructor
    public Board(Level level) {
        this.boardLevel = level;
        this.timeScore = 0.0;
        this.numOfMatches = 0;
        this.isSolved = false;
        this.gameCards = new ArrayList<>();
//        this.colNumber = level.getNumberOfColumns();
//        this.rowNumber = level.getNumberOfRows();
//        generateBoard(this.boardLevel);
//        generatePairs(this.getPairNum());
    }

    // getters & Setters
    public int getColNumber() {
        return boardLevel.getNumberOfColumns();
    }

    public int getRowNumber() {
        return boardLevel.getNumberOfRows();
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

    public ArrayList<Card> getCards() {
        return gameCards;
    }

    // methods
    public void initializeGame() {
        CardDeck cardDeck = new CardDeck(boardLevel);
        gameCards = cardDeck.generateCardDeck();
    }

//    private void generateBoard(Level level) {
//        this.timeScore = 0.0;
//        this.numOfMatches = 0;
//        this.isSolved = false;
//
//        switch (level) {
//            case EXPERT:
//                this.colNumber = level.getNumberOfColumns();
//                this.rowNumber = level.getNumberOfRows();
//                break;
//            case INTERMEDIATE:
//                this.colNumber = level.getNumberOfColumns();
//                this.rowNumber = level.getNumberOfRows();
//                break;
//            case BEGINNER:
//                this.colNumber = level.getNumberOfColumns();
//                this.rowNumber = level.getNumberOfRows();
//                break;
//            default:
//                this.colNumber = level.getNumberOfColumns();
//                this.rowNumber = level.getNumberOfRows();
//                break;
//        }
//    }
}
