package com.austincreations.rollforthegalaxy;

import java.util.Random;

public class Dice {

    private static final Random randomNumberGenerator = new Random();

    private DiceColor color;
    private DiceFace[] faces;
    private DiceFace currentFace;

    public static DiceFace[] getDiceFaces(DiceColor thisColor){
        DiceFace[] diceFaces = new DiceFace[]{};
        switch (thisColor){
            case White:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Explore, DiceFace.Develop, DiceFace.Settle, DiceFace.Produce, DiceFace.Ship};
                break;
            case Red:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Develop, DiceFace.Develop, DiceFace.Settle, DiceFace.Settle, DiceFace.Wild};
                break;
            case Purple:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Develop, DiceFace.Ship, DiceFace.Ship, DiceFace.Ship, DiceFace.Wild};
                break;
            case Blue:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Produce, DiceFace.Produce, DiceFace.Ship, DiceFace.Ship, DiceFace.Wild};
                break;
            case Brown:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Develop, DiceFace.Develop, DiceFace.Produce, DiceFace.Ship, DiceFace.Wild};
                break;
            case Green:
                diceFaces = new DiceFace[]{DiceFace.Explore, DiceFace.Settle, DiceFace.Settle, DiceFace.Produce, DiceFace.Wild, DiceFace.Wild};
                break;
            case Yellow:
                diceFaces = new DiceFace[]{DiceFace.Develop, DiceFace.Settle, DiceFace.Produce, DiceFace.Wild, DiceFace.Wild, DiceFace.Wild};
                break;
        }
        return diceFaces;
    }

    public Dice(DiceColor thisColor){
        color = thisColor;
        faces = Dice.getDiceFaces(thisColor);
        currentFace = faces[0];
    }

    public DiceColor getColor(){
        return color;
    }

    public void rollDice() {
        int randomFace = randomNumberGenerator.nextInt(6);
        currentFace = faces[randomFace];
    }

    public DiceFace getCurrentFace(){
        return currentFace;
    }
}
