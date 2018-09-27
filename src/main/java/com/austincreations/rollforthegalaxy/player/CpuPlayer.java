package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

public class CpuPlayer implements PlayerInterface {

    @Override
    public Tile[] askPlayerToChooseInitialGameTiles(Player player, Tile[] firstTile, Tile[] secondTile) {
        int firstSum = firstTile[0].getPoints() + secondTile[1].getPoints();
        int secondSum = secondTile[0].getPoints() + firstTile[1].getPoints();
        if (firstSum <= secondSum) {
            return new Tile[]{firstTile[0], secondTile[1]};
        }
        return new Tile[]{secondTile[0], firstTile[1]};
    }
}
