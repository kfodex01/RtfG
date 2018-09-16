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
            case Explore:
                explorePool.addDie(thisDie);
                break;
            case Develop:
                developPool.addDie(thisDie);
                break;
            case Settle:
                settlePool.addDie(thisDie);
                break;
            case Produce:
                producePool.addDie(thisDie);
                break;
            case Ship:
                shipPool.addDie(thisDie);
                break;
            case Wild:
                unassignedPool.addDie(thisDie);
                break;
        }
    }

    public DieColor[] getDiceFromPool(DieFace thisDieFace) {
        DieColor[] diceByColorInPool = {};
        switch (thisDieFace) {
            case Explore:
                diceByColorInPool = explorePool.getContentsByDieColor();
                break;
            case Develop:
                diceByColorInPool = developPool.getContentsByDieColor();
                break;
            case Settle:
                diceByColorInPool = settlePool.getContentsByDieColor();
                break;
            case Produce:
                diceByColorInPool = producePool.getContentsByDieColor();
                break;
            case Ship:
                diceByColorInPool = shipPool.getContentsByDieColor();
                break;
            case Wild:
                diceByColorInPool = unassignedPool.getContentsByDieColor();
                break;
        }
        return diceByColorInPool;
    }
}
