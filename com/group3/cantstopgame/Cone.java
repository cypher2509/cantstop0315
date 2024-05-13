package com.group3.cantstopgame;

public class Cone
{
    protected int value;

    public Cone(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void activate(Player player) {
        // This method is implemented in the subclasses
    }
}
