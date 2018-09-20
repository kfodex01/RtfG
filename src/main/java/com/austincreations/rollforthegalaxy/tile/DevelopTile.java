package com.austincreations.rollforthegalaxy.tile;

public class DevelopTile implements Tile {
    private String name;
    private int points;

    DevelopTile(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
