package com.austincreations.rollforthegalaxy.tile;

import com.austincreations.rollforthegalaxy.DicePool;
import com.austincreations.rollforthegalaxy.Die;
import com.austincreations.rollforthegalaxy.DieColor;

public class SettleTile implements Tile {
    private String name;
    private int points;
    private PlanetColor planetColor;
    private SettleTileEffect[] settleTileEffects;
    private DicePool dicePool;

    SettleTile(String name, int points, PlanetColor planetColor, SettleTileEffect[] settleTileEffects) {
        this.name = name;
        this.points = points;
        this.planetColor = planetColor;
        this.settleTileEffects = settleTileEffects;
        dicePool = new DicePool();
    }

    public SettleTileEffect[] getTileEffects() {
        return settleTileEffects;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public PlanetColor getPlanetColor() {
        return planetColor;
    }

    public DieColor[] getDiceByDieColor() {
        return dicePool.getContentsByDieColor();
    }

    public boolean addDice(Die die) {
        if (dicePool.getContentsByDieColor().length > 0 || planetColor == PlanetColor.GRAY) {
            return false;
        }
        dicePool.addDie(die);
        return true;
    }
}
