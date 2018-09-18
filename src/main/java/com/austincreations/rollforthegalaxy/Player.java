package com.austincreations.rollforthegalaxy;

public class Player {
    private int creditAmount = 0;
    private Cup cup = new Cup();
    private DicePool citizenry = new DicePool();

    public void runPreSetup() {
        creditAmount = 1;
        cup.addDie(new Die(DieColor.WHITE));
        cup.addDie(new Die(DieColor.WHITE));
        cup.addDie(new Die(DieColor.WHITE));
        citizenry.addDie(new Die(DieColor.WHITE));
        citizenry.addDie(new Die(DieColor.WHITE));
    }

    public DieColor[] getCupContentsByDieColor() {
        return cup.getContentsByDieColor();
    }

    public DieColor[] getCitizenryContentsByDieColor() {
        return citizenry.getContentsByDieColor();
    }

    public int getCreditAmount() {
        return creditAmount;
    }
}
