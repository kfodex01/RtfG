package com.austincreations.rollforthegalaxy.tile;

public class SettleTile implements Tile {
    private String name;
    private int points;
    private PlanetColor planetColor;
    private SettleTileEffect[] settleTileEffects;

    SettleTile(String name, int points, PlanetColor planetColor, SettleTileEffect[] settleTileEffects) {
        this.name = name;
        this.points = points;
        this.planetColor = planetColor;
        this.settleTileEffects = settleTileEffects;
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
}
