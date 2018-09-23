package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.DevelopTile;
import com.austincreations.rollforthegalaxy.tile.SettleTile;
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
        tableau = new ArrayList<Tile>();
        developQueue = new LinkedList<DevelopTile>();
        settleQueue = new LinkedList<SettleTile>();
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
        tableau.add(homeWorldTile);
        developQueue.add(developTile);
        settleQueue.add(settleTile);
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
}
