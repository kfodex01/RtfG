package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.Tile;

public class CpuPlayer implements PlayerInterface {

    @Override
    public Tile[] askPlayerToChooseInitialGameTiles(Tile[] firstTile, Tile[] secondTile) {
        return new Tile[]{firstTile[0], secondTile[1]};
    }
}
