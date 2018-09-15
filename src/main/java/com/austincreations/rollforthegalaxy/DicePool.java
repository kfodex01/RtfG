package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class DicePool {

    private HashMap<DiceColor, ArrayList<Dice>> diceByColor;

    public DicePool() {
        diceByColor = new HashMap<DiceColor, ArrayList<Dice>>();
    }

    public boolean addDice(Dice thisDice) {
        if (thisDice.getColor() == null) {
            return false;
        }

        if (diceByColor.containsKey(thisDice.getColor())){
            diceByColor.get(thisDice.getColor()).add(thisDice);
        } else {
            ArrayList<Dice> listOfDiceForThisColor = new ArrayList<Dice>();
            listOfDiceForThisColor.add(thisDice);
            diceByColor.put(thisDice.getColor(), listOfDiceForThisColor);
        }
        return true;
    }

    public DiceColor[] getContentsByDiceColor() {
        ArrayList<DiceColor> diceInPoolByDiceColor = new ArrayList<DiceColor>();

        Set<DiceColor> allColorsInPool = diceByColor.keySet();
        for (DiceColor currentColor : allColorsInPool) {
            int numberOfDiceInPoolWithCurrentColor = diceByColor.get(currentColor).size();

            for(int i = 0; i < numberOfDiceInPoolWithCurrentColor; i++){
                diceInPoolByDiceColor.add(currentColor);
            }
        }
        Collections.sort(diceInPoolByDiceColor);

        return diceInPoolByDiceColor.toArray(new DiceColor[diceInPoolByDiceColor.size()]);
    }

    public Dice removeDice(DiceColor thisDiceColor) {
        if(diceByColor.containsKey(thisDiceColor)){
            return diceByColor.get(thisDiceColor).remove(0);
        } else {
            return new Dice();
        }
    }
}
