package com.game.millerstar.matchitnow;

public class Board {

    // class members
    private int colNumber;
    private int rowNumber;
    Level boardLevel;
    private boolean isSolved;
    private int numOfMatches;
    private double timeScore;

    // constructors
    public Board() {
        this.boardLevel = Level.BEGINNER;
        generateBoard(this.boardLevel);
    }

    public Board(Level level) {
        this.boardLevel = level;
        generateBoard(this.boardLevel);
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

    // methods
    private void generateBoard(Level level) {
        this.timeScore = 0.0;
        this.numOfMatches = 0;
        this.isSolved = false;

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
    }

}
