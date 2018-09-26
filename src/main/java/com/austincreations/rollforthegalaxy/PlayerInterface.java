package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.Tile;

public interface PlayerInterface {
    Tile[] askPlayerToChooseInitialGameTiles(Tile[] firstTile, Tile[] secondTile);
}
