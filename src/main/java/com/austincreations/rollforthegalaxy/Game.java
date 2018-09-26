package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.player.Player;
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
    private int pointsInPool;
    private int numberOfHumanPlayers;

    public Game(int numberOfPlayers, int numberOfHumanPlayers) {
        players = new Player[numberOfPlayers];
        factionTilePool = new ArrayList<>(Arrays.asList(FactionTile.values()));
        homeWorldTilePool = new ArrayList<>(Arrays.asList(HomeWorldTile.values()));
        gameTilePool = new ArrayList<>(Arrays.asList(GameTile.values()));
        pointsInPool = numberOfPlayers * 12;
        this.numberOfHumanPlayers = numberOfHumanPlayers;
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

    public int getNumberOfPointsInPool() {
        return pointsInPool;
    }

    public void setupPlayers() {
        int numberOfPlayers = players.length;
        int humanPlayersLeft = numberOfHumanPlayers;
        boolean isHumanPlayer = true;
        for (int i = 0; i < numberOfPlayers; i++) {
            if (humanPlayersLeft > 0) {
                humanPlayersLeft--;
            } else {
                isHumanPlayer = false;
            }
            players[i] = new Player(isHumanPlayer);
            players[i].runPreSetup();
            Tile[] factionTile = getFactionTile();
            Tile homeWorldTile = getHomeWorldTile();
            Tile[] firstGameTile = getGameTile();
            Tile[] secondGameTile = getGameTile();
            Tile[] selectedTiles = players[i].askPlayerToChooseInitialGameTiles(firstGameTile, secondGameTile);
            players[i].setupPlayer(factionTile, homeWorldTile, (DevelopTile) selectedTiles[0], (SettleTile) selectedTiles[1]);
        }
    }

    public Player[] getPlayers() {
        return players;
    }
}
