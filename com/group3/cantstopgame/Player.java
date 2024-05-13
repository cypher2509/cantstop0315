
/**
 * @author Dong han
 */
package com.group3.cantstopgame;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int score;
    private ArrayList<Integer> colums;
    protected int[] runnerPlaces;
    protected int[] markerPlaces;

    public Player(String name) {
        this.playerName = name;
        this.colums = new ArrayList<>();
        this.score = 0;
        this.runnerPlaces = new int[]{1,2,71};
        this.markerPlaces = new int[]{6,72,0};
    }

    public void addScore(int newScore) {
        score += newScore;
    }

    public int getScore() {
        return score;
    }

    public void addNewColumn(int newColumn) {
        colums.add(newColumn);
    }

    public ArrayList<Integer> getColumns() {
        return this.colums;
    }

    public String getName() {return playerName;}

    public int[] getRunnerPlaces() {return runnerPlaces;}

    public void setRunnerPlaces(int[] newRunnerPlaces) {
        this.runnerPlaces = newRunnerPlaces;
    }

    public int[] getMarkerPlaces() {return markerPlaces;}

    public void setMarkerPlaces(int[] newMarkerPlaces) {
        this.markerPlaces = newMarkerPlaces;
    }


}
