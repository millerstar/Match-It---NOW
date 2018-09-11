package com.game.millerstar.matchitnow;

public enum Level {

    BEGINNER (12),
    INTERMEDIATE (20),
    EXPERT (35);

    private final int numOfCards;

    Level(int numOfCards) {
        this.numOfCards = numOfCards;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

   /* BEGINNER(new int[]{4, 3}),
    INTERMEDIATE(new int[]{5, 4}),
    EXPERT(new int[]{7, 5});

    private final int[] level = new int[2];

    Level(int[] level) {
        this.level[0] = level[0];
        this.level[1] = level[1];
    }

    public int getNumberOfColumns() {
        return level[0];
    }

    public int getNumberOfRows() {
        return level[1];
    }*/
}
