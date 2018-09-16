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
            case White:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Explore, DieFace.Develop, DieFace.Settle, DieFace.Produce, DieFace.Ship};
                break;
            case Red:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Develop, DieFace.Develop, DieFace.Settle, DieFace.Settle, DieFace.Wild};
                break;
            case Purple:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Develop, DieFace.Ship, DieFace.Ship, DieFace.Ship, DieFace.Wild};
                break;
            case Blue:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Produce, DieFace.Produce, DieFace.Ship, DieFace.Ship, DieFace.Wild};
                break;
            case Brown:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Develop, DieFace.Develop, DieFace.Produce, DieFace.Ship, DieFace.Wild};
                break;
            case Green:
                dieFaces = new DieFace[]{DieFace.Explore, DieFace.Settle, DieFace.Settle, DieFace.Produce, DieFace.Wild, DieFace.Wild};
                break;
            case Yellow:
                dieFaces = new DieFace[]{DieFace.Develop, DieFace.Settle, DieFace.Produce, DieFace.Wild, DieFace.Wild, DieFace.Wild};
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
