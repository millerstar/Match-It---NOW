package com.game.millerstar.matchitnow;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {

    private int secondsPassed = 0;
    private Timer gameTimer = new Timer();

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            secondsPassed++;
            System.out.println(generateTimeFormat(secondsPassed));
        }
    };

    public void start() {
        gameTimer.scheduleAtFixedRate(task,1000,1000);
    }

    public void stop() {
        gameTimer.cancel();
    }

    private String generateTimeFormat(int numOfSeconds) {
        int secondsLeft = secondsPassed % 3600 % 60;
        int minutes = (int) Math.floor(secondsPassed % 3600 / 60);
        String MM = minutes < 10 ? "0" + minutes : Integer.toString(minutes);
        String SS = secondsLeft < 10 ? "0" + secondsLeft : Integer.toString(secondsLeft);
        return MM + ":" + SS;
    }

    public static void main(String[] args) throws InterruptedException {
        GameTimer gt = new GameTimer();
        gt.start();

    }

}
