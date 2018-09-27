package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

public class CpuPlayer implements PlayerInterface {

    @Override
    public Tile[] askPlayerToChooseInitialGameTiles(Player player, Tile[] firstTile, Tile[] secondTile) {
        return new Tile[]{firstTile[0], secondTile[1]};
    }
}
