package com.austincreations.rollforthegalaxy;

public class PhaseStrip {

    private DicePool explorePool;
    private DicePool developPool;
    private DicePool settlePool;
    private DicePool producePool;
    private DicePool shipPool;
    private DicePool unassignedPool;
    private Die phaseSelectionDie;
    private DieFace selectedPhase;
    private Die reassignDie;
    private Die reassignedDie;
    private DieFace reassignFace;

    public PhaseStrip() {
        explorePool = new DicePool();
        developPool = new DicePool();
        settlePool = new DicePool();
        producePool = new DicePool();
        shipPool = new DicePool();
        unassignedPool = new DicePool();
        phaseSelectionDie = null;
        selectedPhase = null;
        reassignDie = null;
        reassignedDie = null;
        reassignFace = null;
    }

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

    private Die removeDieFromPool(DieColor dieColor, DieFace fromPool) {
        Die thisDie;
        switch (fromPool) {
            case EXPLORE:
                thisDie = explorePool.removeDie(dieColor);
                break;
            case DEVELOP:
                thisDie = developPool.removeDie(dieColor);
                break;
            case SETTLE:
                thisDie = settlePool.removeDie(dieColor);
                break;
            case PRODUCE:
                thisDie = producePool.removeDie(dieColor);
                break;
            case SHIP:
                thisDie = shipPool.removeDie(dieColor);
                break;
            case WILD:
                thisDie = unassignedPool.removeDie(dieColor);
                break;
            default:
                thisDie = null;
                break;
        }
        return thisDie;
    }

    public DieColor[] getDiceByColorFromPool(DieFace thisDieFace) {
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

    public void assignDie(DieColor dieColor, DieFace fromPool, DieFace toPool) {
        if (fromPool == toPool) {
            return;
        }
        Die thisDie;
        thisDie = removeDieFromPool(dieColor, fromPool);
        if (thisDie.getCurrentFace() != DieFace.WILD) {
            this.addDice(new Die[]{thisDie});
            return;
        }
        switch (toPool) {
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
            default:
                break;
        }
    }

    public void assignDie(DieColor dieColor, DieFace dieface) {
        assignDie(dieColor, DieFace.WILD, dieface);
    }

    public boolean selectPhase(DieFace selectedPhase, DieFace dicePoolToTakeFrom, DieColor dieColor) {
        Die phaseSelectionDie = null;
        if (selectedPhase == DieFace.WILD) {
            return false;
        }
        switch (dicePoolToTakeFrom) {
            case EXPLORE:
                phaseSelectionDie = explorePool.removeDie(dieColor);
                break;
            case DEVELOP:
                phaseSelectionDie = developPool.removeDie(dieColor);
                break;
            case SETTLE:
                phaseSelectionDie = settlePool.removeDie(dieColor);
                break;
            case PRODUCE:
                phaseSelectionDie = producePool.removeDie(dieColor);
                break;
            case SHIP:
                phaseSelectionDie = shipPool.removeDie(dieColor);
                break;
            case WILD:
                phaseSelectionDie = unassignedPool.removeDie(dieColor);
                break;
            default:
                break;
        }
        if (phaseSelectionDie.getColor() != null) {
            this.selectedPhase = selectedPhase;
            if (this.phaseSelectionDie != null) {
                addDice(new Die[]{this.phaseSelectionDie});
            }
            this.phaseSelectionDie = phaseSelectionDie;
            return true;
        } else {
            return false;
        }
    }

    public DieFace getSelectedPhase() {
        return selectedPhase;
    }

    public Die getSelectionDie() {
        return phaseSelectionDie;
    }

    public boolean reassignDie(DieFace reassignDiePool, DieColor reassignDieColor, DieFace reassignedFromDiePool, DieColor reassignedDieColor, DieFace reassignToFace) {
        if (reassignToFace == DieFace.WILD) {
            return false;
        }
        reassignDie = removeDieFromPool(reassignDieColor, reassignDiePool);
        if (reassignDie.getColor() == null) {
            reassignDie = null;
            return false;
        }
        reassignedDie = removeDieFromPool(reassignedDieColor, reassignedFromDiePool);
        if (reassignedDie.getColor() == null) {
            addDice(new Die[]{reassignDie});
            reassignDie = null;
            reassignedDie = null;
            return false;
        }
        reassignFace = reassignToFace;
        return true;
    }

    public Die getReassignDie() {
        return reassignDie;
    }

    public Die getReassignedDie() {
        return reassignedDie;
    }

    public DieFace getReassignedDieAssignedFace() {
        return reassignFace;
    }
}
