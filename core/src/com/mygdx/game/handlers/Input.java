package com.mygdx.game.handlers;

public class Input {
    public static boolean[] keys;
    public static boolean[] pkeys;

    public static final int NUM_KEYS = 7;
    public static final int BUTTON1 = 0;
    public static final int BUTTON2 = 1;

    public static final int LEFT = 3;
    public static final int UP = 4;
    public static final int RIGHT = 5;
    public static final int DOWN = 6;

    static {
        keys = new boolean[NUM_KEYS];
        pkeys = new boolean[NUM_KEYS];
    }

    public static void update() {
        for(int i = 0; i < NUM_KEYS; i++){
            pkeys[i] = keys[i];
        }
    }
    public static void setKeys(int i, boolean b) {keys[i] = b;}
    public static boolean isDown(int i ) { return keys[i];}
    public static boolean isPressed(int i ) {return keys[i];}
}


