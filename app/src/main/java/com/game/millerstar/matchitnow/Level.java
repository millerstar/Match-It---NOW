package com.game.millerstar.matchitnow;

public enum Level {
    BEGINNER(new int[]{4, 3}),
    INTERMEDIATE(new int[]{5, 4}),
    EXPERT(new int[]{7, 5});

    private final int[] level = new int[2];

    Level(int[] level) {
        this.level[0] = level[0];
        this.level[1] = level[1];
    }

    public int getColumnAsInt() {
        return level[0];
    }

    public int getRowAsInt() {
        return level[1];
    }
}
