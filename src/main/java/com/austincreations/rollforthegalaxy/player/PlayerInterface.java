package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

public interface PlayerInterface {
    Tile[] askPlayerToChooseInitialGameTiles(Tile[] firstTile, Tile[] secondTile);
}
