
/**
 * @author Dong han
 */
package com.group3.cantstopgame;

public class NPC extends Player
{
    private boolean isHard;
    public NPC(String name) {
        super(name);
        isHard = false;
    }

    public void setHardMode() {isHard = true;}


    public void move() {// TBD
    }
}
