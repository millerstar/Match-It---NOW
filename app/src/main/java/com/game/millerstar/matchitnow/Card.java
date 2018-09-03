package com.game.millerstar.matchitnow;

public class Card {

    // class members
//    private int crardId;
    private String imageURL;
    private boolean isExposed;
    private int[] position;

    // constructor
    public Card(String imageURL) {
        this.imageURL = imageURL;
//        this.position = new int[2];
        this.isExposed = false;
    }

    // getters & setters
    public int[] getPosition() {
        return position;
    }

    public boolean isExposed() {
        return isExposed;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setPosition(int[] position) {
        this.position[0] = position[0];
        this.position[1] = position[1];
    }

    public void setExposed(boolean exposed) {
        isExposed = exposed;
    }

    // METHODS
    public void flip() {

    }
}
