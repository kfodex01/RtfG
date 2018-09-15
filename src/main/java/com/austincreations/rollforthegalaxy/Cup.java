package com.austincreations.rollforthegalaxy;

import java.util.ArrayList;

public class Cup extends DicePool {
    public Dice[] rollDice() {
        DiceColor[] diceListByColor = this.getContentsByDiceColor();
        ArrayList<Dice> rolledDice = new ArrayList<Dice>();
        for (DiceColor thisDiceColor : diceListByColor) {
            Dice thisDice = this.removeDice(thisDiceColor);
            thisDice.rollDice();
            rolledDice.add(thisDice);
        }
        return rolledDice.toArray(new Dice[rolledDice.size()]);
    }
}
