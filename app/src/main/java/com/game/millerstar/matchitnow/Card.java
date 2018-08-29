package com.game.millerstar.matchitnow;

public class Card {

    // class members
    private int crardId;
    private String imageURL;
    private boolean isExposed;
    private int[] possition;

    // constructor
    public Card(String imageURL) {
        this.imageURL = imageURL;
        this.possition = new int[2];
        this.isExposed = false;
    }

    // getters & setters
    public int[] getPossition() {
        return possition;
    }

    public boolean isExposed() {
        return isExposed;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setPossition(int[] possition) {
        this.possition[0] = possition[0];
        this.possition[1] = possition[1];
    }

    public void setExposed(boolean exposed) {
        isExposed = exposed;
    }

    // METHODS
    public void flip() {

    }
}
