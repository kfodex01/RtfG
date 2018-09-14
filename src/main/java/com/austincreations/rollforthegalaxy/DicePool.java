package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;

public class DicePool {

    private ArrayList<DiceColor> theseDiceColors;

    public DicePool() {
        theseDiceColors = new ArrayList<DiceColor>();
    }

    public void add(Dice thisDice) {
        theseDiceColors.add(thisDice.getColor());
    }

    public DiceColor[] contains() {
        return theseDiceColors.toArray(new DiceColor[theseDiceColors.size()]);
    }

}
