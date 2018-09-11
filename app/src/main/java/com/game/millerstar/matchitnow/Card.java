package com.game.millerstar.matchitnow;

public class Card {

    // class members
    private int imageId;
    private boolean isExposed;

    // constructor
    public Card(int imageId) {
        this.imageId = imageId;
        this.isExposed = false;
    }

    // getters & setters
    public boolean isExposed() {
        return isExposed;
    }

    public int getImageId() {
        return imageId;
    }

    public void setExposed(boolean exposed) {
        isExposed = exposed;
    }

    // methods
    public void flip() {

    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Card)) return false;

        Card card = (Card) obj;

        return card.imageId == this.imageId;
    }
}
