package com.austincreations.rollforthegalaxy.tile;

public class DevelopTile implements Tile {
    private String name;
    private int points;
    private DevelopTileEffect[] developTileEffects;

    DevelopTile(String name, int points, DevelopTileEffect[] developTileEffects) {
        this.name = name;
        this.points = points;
        this.developTileEffects = developTileEffects;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public DevelopTileEffect[] getTileEffects() {
        return developTileEffects;
    }
}
