package com.austincreations.rollforthegalaxy.tile;

public class SettleTile implements Tile {
    private String name;
    private int points;
    private PlanetColor planetColor;

    SettleTile(String name, int points, PlanetColor planetColor) {
        this.name = name;
        this.points = points;
        this.planetColor = planetColor;
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
