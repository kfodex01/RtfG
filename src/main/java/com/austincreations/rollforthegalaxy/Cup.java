package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;

public class Cup extends DicePool {
    public Die[] rollDice() {
        DieColor[] diceListByColor = this.getContentsByDieColor();
        ArrayList<Die> rolledDie = new ArrayList<Die>();
        for (DieColor thisDieColor : diceListByColor) {
            Die thisDie = this.removeDie(thisDieColor);
            thisDie.rollDie();
            rolledDie.add(thisDie);
        }
        return rolledDie.toArray(new Die[rolledDie.size()]);
    }
}
