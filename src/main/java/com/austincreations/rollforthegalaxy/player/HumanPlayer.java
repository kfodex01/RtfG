package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

public class HumanPlayer implements PlayerInterface {
    @Override
    public Tile[] askPlayerToChooseInitialGameTiles(Tile[] firstTile, Tile[] secondTile) {
        return new Tile[0];
    }
}
