package com.austincreations.rollforthegalaxy;

import java.util.Random;

public class Die {

    private static final Random randomNumberGenerator = new Random();

    private DieColor color;
    private DieFace[] faces;
    private DieFace currentFace;

    public Die() {

    }

    public Die(DieColor thisColor) {
        color = thisColor;
        faces = Die.getDieFaces(thisColor);
        currentFace = faces[0];
    }

    public static DieFace[] getDieFaces(DieColor thisColor) {
        DieFace[] dieFaces = new DieFace[]{};
        switch (thisColor){
            case WHITE:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.EXPLORE, DieFace.DEVELOP, DieFace.SETTLE, DieFace.PRODUCE, DieFace.SHIP};
                break;
            case RED:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.DEVELOP, DieFace.DEVELOP, DieFace.SETTLE, DieFace.SETTLE, DieFace.WILD};
                break;
            case PURPLE:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.DEVELOP, DieFace.SHIP, DieFace.SHIP, DieFace.SHIP, DieFace.WILD};
                break;
            case BLUE:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.PRODUCE, DieFace.PRODUCE, DieFace.SHIP, DieFace.SHIP, DieFace.WILD};
                break;
            case BROWN:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.DEVELOP, DieFace.DEVELOP, DieFace.PRODUCE, DieFace.SHIP, DieFace.WILD};
                break;
            case GREEN:
                dieFaces = new DieFace[]{DieFace.EXPLORE, DieFace.SETTLE, DieFace.SETTLE, DieFace.PRODUCE, DieFace.WILD, DieFace.WILD};
                break;
            case YELLOW:
                dieFaces = new DieFace[]{DieFace.DEVELOP, DieFace.SETTLE, DieFace.PRODUCE, DieFace.WILD, DieFace.WILD, DieFace.WILD};
                break;
        }
        return dieFaces;
    }

    public DieColor getColor() {
        return color;
    }

    public void rollDie() {
        int randomFace = randomNumberGenerator.nextInt(6);
        currentFace = faces[randomFace];
    }

    public DieFace getCurrentFace() {
        return currentFace;
    }
}
