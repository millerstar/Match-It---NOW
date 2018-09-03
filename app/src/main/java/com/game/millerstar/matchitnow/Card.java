package com.game.millerstar.matchitnow;

public class Card {

    // class members
    private String imageURL;
    private boolean isExposed;

    // constructor
    public Card(String imageURL) {
        this.imageURL = imageURL;
        this.isExposed = false;
    }

    // getters & setters
    public boolean isExposed() {
        return isExposed;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setExposed(boolean exposed) {
        isExposed = exposed;
    }

    // METHODS
    public void flip() {

    }
}
