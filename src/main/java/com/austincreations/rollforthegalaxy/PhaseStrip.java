package com.austincreations.rollforthegalaxy;

public class PhaseStrip {

    private DicePool explorePool = new DicePool();
    private DicePool developPool = new DicePool();
    private DicePool settlePool = new DicePool();
    private DicePool producePool = new DicePool();
    private DicePool shipPool = new DicePool();
    private DicePool unassignedPool = new DicePool();

    public boolean addDice(Dice[] dice) {
        if (dice.length == 0) {
            return false;
        }
        for (Dice thisDice : dice) {
            addToCorrectPool(thisDice);
        }
        return true;
    }

    private void addToCorrectPool(Dice thisDice) {
        DiceFace thisDiceFace = thisDice.getCurrentFace();
        if (thisDiceFace == null) {
            return;
        }
        switch (thisDiceFace) {
            case Explore:
                explorePool.addDice(thisDice);
                break;
            case Develop:
                developPool.addDice(thisDice);
                break;
            case Settle:
                settlePool.addDice(thisDice);
                break;
            case Produce:
                producePool.addDice(thisDice);
                break;
            case Ship:
                shipPool.addDice(thisDice);
                break;
            case Wild:
                unassignedPool.addDice(thisDice);
                break;
        }
    }

    public DiceColor[] getDiceFromPool(DiceFace thisDiceFace) {
        DiceColor[] diceByColorInPool = {};
        switch (thisDiceFace) {
            case Explore:
                diceByColorInPool = explorePool.getContentsByDiceColor();
                break;
            case Develop:
                diceByColorInPool = developPool.getContentsByDiceColor();
                break;
            case Settle:
                diceByColorInPool = settlePool.getContentsByDiceColor();
                break;
            case Produce:
                diceByColorInPool = producePool.getContentsByDiceColor();
                break;
            case Ship:
                diceByColorInPool = shipPool.getContentsByDiceColor();
                break;
            case Wild:
                diceByColorInPool = unassignedPool.getContentsByDiceColor();
                break;
        }
        return diceByColorInPool;
    }
}
