package com.group3.cantstopgame;

public class PlayerCone extends Cone{
    public PlayerCone(int value) {
        super(value);
    }

    public void activate(Player player) {
        int[] runners = player.getRunnerPlaces();
        for (int i = 0; i < runners.length; i++) {
            if (runners[i] == value) {
                runners[i] = 0;
            }
        }
        player.setRunnerPlaces(runners);
    }
}
