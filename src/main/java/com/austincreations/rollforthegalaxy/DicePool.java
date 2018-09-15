package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;
import java.util.Collections;

public class DicePool {

    private ArrayList<DiceColor> theseDiceColors;

    public DicePool() {
        theseDiceColors = new ArrayList<DiceColor>();
    }

    public void add(Dice thisDice) {
        theseDiceColors.add(thisDice.getColor());
    }

    public DiceColor[] contains() {
        Collections.sort(theseDiceColors);
        return theseDiceColors.toArray(new DiceColor[theseDiceColors.size()]);
    }

}
