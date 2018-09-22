package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.FactionTile;
import com.austincreations.rollforthegalaxy.tile.Tile;
import com.austincreations.rollforthegalaxy.tile.TileFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {
    private static final Random randomNumberGenerator = new Random();

    private Player[] players;
    private ArrayList<FactionTile> factionTilePool;

    public Game(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
        factionTilePool = new ArrayList<FactionTile>(Arrays.asList(FactionTile.values()));
    }

    public int getNumberOfPlayers() {
        return players.length;
    }

    public Tile[] getFactionTile() {
        if (factionTilePool.isEmpty()) {
            return new Tile[]{};
        }
        int tileIndex = randomNumberGenerator.nextInt(factionTilePool.size());
        return TileFactory.getFactionTiles(factionTilePool.remove(tileIndex));
    }
}
