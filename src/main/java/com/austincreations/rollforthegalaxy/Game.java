package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Game {
    private static final Random randomNumberGenerator = new Random();

    private Player[] players;
    private ArrayList<FactionTile> factionTilePool;
    private ArrayList<HomeWorldTile> homeWorldTilePool;
    private ArrayList<GameTile> gameTilePool;

    public Game(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
        factionTilePool = new ArrayList<FactionTile>(Arrays.asList(FactionTile.values()));
        homeWorldTilePool = new ArrayList<HomeWorldTile>(Arrays.asList(HomeWorldTile.values()));
        gameTilePool = new ArrayList<GameTile>(Arrays.asList(GameTile.values()));
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

    public Tile getHomeWorldTile() {
        if (homeWorldTilePool.isEmpty()) {
            return TileFactory.createEmptyTile();
        }
        int tileIndex = randomNumberGenerator.nextInt(homeWorldTilePool.size());
        return TileFactory.getHomeWorldTiles(homeWorldTilePool.remove(tileIndex));
    }

    public Tile[] getGameTile() {
        if (gameTilePool.isEmpty()) {
            return new Tile[]{};
        }
        int tileIndex = randomNumberGenerator.nextInt(gameTilePool.size());
        return TileFactory.getGameTiles(gameTilePool.remove(tileIndex));
    }
}
