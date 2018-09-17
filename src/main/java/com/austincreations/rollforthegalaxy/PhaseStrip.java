package com.austincreations.rollforthegalaxy;

public class PhaseStrip {

    private DicePool explorePool = new DicePool();
    private DicePool developPool = new DicePool();
    private DicePool settlePool = new DicePool();
    private DicePool producePool = new DicePool();
    private DicePool shipPool = new DicePool();
    private DicePool unassignedPool = new DicePool();

    public boolean addDice(Die[] dice) {
        if (dice.length == 0) {
            return false;
        }
        for (Die thisDie : dice) {
            addToPool(thisDie);
        }
        return true;
    }

    private void addToPool(Die thisDie) {
        DieFace thisDieFace = thisDie.getCurrentFace();
        if (thisDieFace == null) {
            return;
        }
        switch (thisDieFace) {
            case EXPLORE:
                explorePool.addDie(thisDie);
                break;
            case DEVELOP:
                developPool.addDie(thisDie);
                break;
            case SETTLE:
                settlePool.addDie(thisDie);
                break;
            case PRODUCE:
                producePool.addDie(thisDie);
                break;
            case SHIP:
                shipPool.addDie(thisDie);
                break;
            case WILD:
                unassignedPool.addDie(thisDie);
                break;
        }
    }

    public DieColor[] getDiceFromPool(DieFace thisDieFace) {
        DieColor[] diceByColorInPool = {};
        switch (thisDieFace) {
            case EXPLORE:
                diceByColorInPool = explorePool.getContentsByDieColor();
                break;
            case DEVELOP:
                diceByColorInPool = developPool.getContentsByDieColor();
                break;
            case SETTLE:
                diceByColorInPool = settlePool.getContentsByDieColor();
                break;
            case PRODUCE:
                diceByColorInPool = producePool.getContentsByDieColor();
                break;
            case SHIP:
                diceByColorInPool = shipPool.getContentsByDieColor();
                break;
            case WILD:
                diceByColorInPool = unassignedPool.getContentsByDieColor();
                break;
        }
        return diceByColorInPool;
    }
}
