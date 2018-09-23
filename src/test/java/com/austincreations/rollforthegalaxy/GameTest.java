package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    private Game game;

    private PlayerInterface playerInterface = new PlayerInterface();

    @Test
    public void constructor_TwoPlayerGame_GameHasTwoPlayers() {
        game = new Game(2, playerInterface);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(2);
    }

    @Test
    public void constructor_ThreePlayerGame_GameHasThreePlayers() {
        game = new Game(3, playerInterface);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(3);
    }

    @Test
    public void constructor_FourPlayerGame_GameHasFourPlayers() {
        game = new Game(4, playerInterface);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(4);
    }

    @Test
    public void constructor_FivePlayerGame_GameHasFivePlayers() {
        game = new Game(5, playerInterface);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(5);
    }

    @Test
    public void constructor_TwoPlayerGame_CorrectNumberOfPointsAddedToPool() {
        game = new Game(2, playerInterface);

        int numberOfPointsInPool = game.getNumberOfPointsInPool();

        assertThat(numberOfPointsInPool).isEqualTo(24);
    }

    @Test
    public void constructor_ThreePlayerGame_CorrectNumberOfPointsAddedToPool() {
        game = new Game(3, playerInterface);

        int numberOfPointsInPool = game.getNumberOfPointsInPool();

        assertThat(numberOfPointsInPool).isEqualTo(36);
    }

    @Test
    public void constructor_FourPlayerGame_CorrectNumberOfPointsAddedToPool() {
        game = new Game(4, playerInterface);

        int numberOfPointsInPool = game.getNumberOfPointsInPool();

        assertThat(numberOfPointsInPool).isEqualTo(48);
    }

    @Test
    public void constructor_FivePlayerGame_CorrectNumberOfPointsAddedToPool() {
        game = new Game(5, playerInterface);

        int numberOfPointsInPool = game.getNumberOfPointsInPool();

        assertThat(numberOfPointsInPool).isEqualTo(60);
    }

    @Test
    public void getFactionTile_GetTile_GetsAFactionTile() {
        game = new Game(2, playerInterface);

        Tile[] factionTile = game.getFactionTile();

        assertThat(factionTile.length).isEqualTo(2);
    }

    @Test
    public void getFactionTile_GetAllTiles_NoFactionTilesMatchAndPoolContainsTheCorrectNumber() {
        game = new Game(2, playerInterface);
        ArrayList<String> allFactionTiles = new ArrayList<String>();
        int numberOfFactionTiles = FactionTile.values().length * 2;
        boolean foundDuplicate = false;

        Tile[] factionTile = game.getFactionTile();
        while (factionTile.length > 0 && !foundDuplicate) {
            for (Tile tile : factionTile) {
                if (allFactionTiles.contains(tile.getName())) {
                    foundDuplicate = true;
                }
                allFactionTiles.add(tile.getName());
            }
            factionTile = game.getFactionTile();
        }

        assertThat(foundDuplicate).isEqualTo(false);
        assertThat(allFactionTiles.size()).isEqualTo(numberOfFactionTiles);
    }

    @Test
    public void getHomeWorldTile_GetTile_GetsAHomeWorldTile() {
        game = new Game(2, playerInterface);

        Tile homeWorldTile = game.getHomeWorldTile();

        assertThat(homeWorldTile).isInstanceOf(SettleTile.class);
    }

    @Test
    public void getHomeWorldTile_GetAllTiles_NoHomeWorldTilesMatchAndPoolContainsTheCorrectNumber() {
        game = new Game(2, playerInterface);
        ArrayList<String> allHomeWorldTiles = new ArrayList<String>();
        int numberOfHomeWorldTiles = HomeWorldTile.values().length;
        boolean foundDuplicate = false;

        Tile homeWorldTile = game.getHomeWorldTile();
        while (!homeWorldTile.getName().equals("") && !foundDuplicate) {
            if (allHomeWorldTiles.contains(homeWorldTile.getName())) {
                foundDuplicate = true;
            }
            allHomeWorldTiles.add(homeWorldTile.getName());
            homeWorldTile = game.getHomeWorldTile();
        }

        assertThat(foundDuplicate).isEqualTo(false);
        assertThat(allHomeWorldTiles.size()).isEqualTo(numberOfHomeWorldTiles);
    }

    @Test
    public void getGameTile_GetTile_GetsAGameTile() {
        game = new Game(2, playerInterface);

        Tile[] gameTile = game.getGameTile();

        assertThat(gameTile.length).isEqualTo(2);
        assertThat(gameTile[0]).isInstanceOf(DevelopTile.class);
        assertThat(gameTile[1]).isInstanceOf(SettleTile.class);
    }

    @Test
    public void getGameTile_GetAllTiles_NoGameTilesMatchAndPoolContainsTheCorrectNumber() {
        game = new Game(2, playerInterface);
        ArrayList<String> allGameTiles = new ArrayList<String>();
        int numberOfGameTiles = GameTile.values().length * 2;
        boolean foundDuplicate = false;

        Tile[] gameTile = game.getGameTile();
        while (gameTile.length > 0 && !foundDuplicate) {
            for (Tile tile : gameTile) {
                if (allGameTiles.contains(tile.getName())) {
                    foundDuplicate = true;
                }
                allGameTiles.add(tile.getName());
            }
            gameTile = game.getGameTile();
        }

        assertThat(foundDuplicate).isEqualTo(false);
        assertThat(allGameTiles.size()).isEqualTo(numberOfGameTiles);
    }

    @Test
    public void setupPlayers_GetRandomTiles_EachPlayerHasThreeTableauTilesOneTileInDevelopQueueAndOneTileInSettleQueue() {
        game = new Game(5, playerInterface);

        game.setupPlayers();
        Player[] players = game.getPlayers();

        assertThat(players.length).isEqualTo(5);
        assertThat(players[0].getTilesInTableau().length).isEqualTo(3);
        assertThat(players[0].getTilesInDevelopQueue().length).isEqualTo(1);
        assertThat(players[0].getTilesInSettleQueue().length).isEqualTo(1);
        assertThat(players[1].getTilesInTableau().length).isEqualTo(3);
        assertThat(players[1].getTilesInDevelopQueue().length).isEqualTo(1);
        assertThat(players[1].getTilesInSettleQueue().length).isEqualTo(1);
        assertThat(players[2].getTilesInTableau().length).isEqualTo(3);
        assertThat(players[2].getTilesInDevelopQueue().length).isEqualTo(1);
        assertThat(players[2].getTilesInSettleQueue().length).isEqualTo(1);
        assertThat(players[3].getTilesInTableau().length).isEqualTo(3);
        assertThat(players[3].getTilesInDevelopQueue().length).isEqualTo(1);
        assertThat(players[3].getTilesInSettleQueue().length).isEqualTo(1);
        assertThat(players[4].getTilesInTableau().length).isEqualTo(3);
        assertThat(players[4].getTilesInDevelopQueue().length).isEqualTo(1);
        assertThat(players[4].getTilesInSettleQueue().length).isEqualTo(1);
    }
}