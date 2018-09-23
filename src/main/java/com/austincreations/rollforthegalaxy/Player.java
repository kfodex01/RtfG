package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.DevelopTile;
import com.austincreations.rollforthegalaxy.tile.SettleTile;
import com.austincreations.rollforthegalaxy.tile.SettleTileEffect;
import com.austincreations.rollforthegalaxy.tile.Tile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Player {
    private int creditAmount;
    private Cup cup;
    private DicePool citizenry;
    private ArrayList<Tile> tableau;
    private LinkedList<DevelopTile> developQueue;
    private LinkedList<SettleTile> settleQueue;

    Player() {
        creditAmount = 1;
        cup = new Cup();
        citizenry = new DicePool();
        tableau = new ArrayList<>();
        developQueue = new LinkedList<>();
        settleQueue = new LinkedList<>();
    }

    public void runPreSetup() {
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

    public void setupPlayer(Tile[] factionTile, Tile homeWorldTile, DevelopTile developTile, SettleTile settleTile) {
        tableau.addAll(Arrays.asList(factionTile));
        if (factionTile[1].getClass() == SettleTile.class) {
            applySettleTileEffects((SettleTile) factionTile[1]);
        }
        tableau.add(homeWorldTile);
        applySettleTileEffects((SettleTile) homeWorldTile);
        developQueue.add(developTile);
        settleQueue.add(settleTile);
    }

    private void applySettleTileEffects(SettleTile settleTile) {
        for (SettleTileEffect settleTileEffect : settleTile.getTileEffects()) {
            switch (settleTileEffect) {
                case ADD_BLUE_DIE_TO_CUP:
                    cup.addDie(new Die(DieColor.BLUE));
                    break;
                case ADD_BROWN_DIE_TO_CUP:
                    cup.addDie(new Die(DieColor.BROWN));
                    break;
                case ADD_BROWN_DIE_TO_WORLD:
                    settleTile.addDice(new Die(DieColor.BROWN));
                    break;
                case ADD_GREEN_DIE_TO_WORLD:
                    settleTile.addDice(new Die(DieColor.GREEN));
                    break;
                case ADD_RED_DIE_TO_CITIZENRY:
                    citizenry.addDie(new Die(DieColor.RED));
                    break;
                case ADD_RED_DIE_TO_CUP:
                    cup.addDie(new Die(DieColor.RED));
                    break;
                case ADD_YELLOW_DIE_TO_CITIZENRY:
                    citizenry.addDie(new Die(DieColor.YELLOW));
                    break;
                case START_WITH_EIGHT_CREDITS:
                    creditAmount = 8;
                    break;
            }
        }
    }

    public Tile[] getTilesInTableau() {
        return tableau.toArray(new Tile[tableau.size()]);
    }

    public Tile[] getTilesInDevelopQueue() {
        return developQueue.toArray(new Tile[developQueue.size()]);
    }

    public Tile[] getTilesInSettleQueue() {
        return settleQueue.toArray(new Tile[settleQueue.size()]);
    }

    public void addCredits(int amount) {
        if (amount < 0) {
            return;
        }
        creditAmount += amount;
        if (creditAmount > 10) {
            creditAmount = 10;
        }
    }

    public void subtractCredits(int amount) {
        if (amount < 0) {
            return;
        }
        creditAmount -= amount;
        if (creditAmount < 0) {
            creditAmount = 0;
        }
    }
}
