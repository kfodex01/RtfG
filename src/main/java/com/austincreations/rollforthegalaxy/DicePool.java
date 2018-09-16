package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class DicePool {

    private HashMap<DieColor, ArrayList<Die>> diceByColor;

    public DicePool() {
        diceByColor = new HashMap<DieColor, ArrayList<Die>>();
    }

    public boolean addDie(Die thisDie) {
        if (thisDie.getColor() == null) {
            return false;
        }

        if (diceByColor.containsKey(thisDie.getColor())) {
            diceByColor.get(thisDie.getColor()).add(thisDie);
        } else {
            ArrayList<Die> listOfDiceForThisColor = new ArrayList<Die>();
            listOfDiceForThisColor.add(thisDie);
            diceByColor.put(thisDie.getColor(), listOfDiceForThisColor);
        }
        return true;
    }

    public DieColor[] getContentsByDieColor() {
        ArrayList<DieColor> diceInPoolByDieColor = new ArrayList<DieColor>();

        Set<DieColor> allColorsInPool = diceByColor.keySet();
        for (DieColor currentColor : allColorsInPool) {
            int numberOfDiceInPoolWithCurrentColor = diceByColor.get(currentColor).size();

            for(int i = 0; i < numberOfDiceInPoolWithCurrentColor; i++){
                diceInPoolByDieColor.add(currentColor);
            }
        }
        Collections.sort(diceInPoolByDieColor);

        return diceInPoolByDieColor.toArray(new DieColor[diceInPoolByDieColor.size()]);
    }

    public Die removeDie(DieColor thisDieColor) {
        if (diceByColor.containsKey(thisDieColor)) {
            return diceByColor.get(thisDieColor).remove(0);
        } else {
            return new Die();
        }
    }
}
