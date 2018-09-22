package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.FactionTile;
import com.austincreations.rollforthegalaxy.tile.SettleTile;
import com.austincreations.rollforthegalaxy.tile.Tile;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    private Game game;

    @Test
    public void constructor_TwoPlayerGame_GameHasTwoPlayers() {
        game = new Game(2);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(2);
    }

    @Test
    public void constructor_ThreePlayerGame_GameHasThreePlayers() {
        game = new Game(3);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(3);
    }

    @Test
    public void constructor_FourPlayerGame_GameHasFourPlayers() {
        game = new Game(4);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(4);
    }

    @Test
    public void constructor_FivePlayerGame_GameHasFivePlayers() {
        game = new Game(5);

        int numberOfPlayers = game.getNumberOfPlayers();

        assertThat(numberOfPlayers).isEqualTo(5);
    }

    @Test
    public void getFactionTile_GetTile_GetsAFactionTile() {
        game = new Game(2);

        Tile[] factionTile = game.getFactionTile();

        assertThat(factionTile.length).isEqualTo(2);
    }

    @Test
    public void getFactionTile_GetAllTiles_NoFactionTilesMatchAndPoolContainsTheCorrectNumber() {
        game = new Game(2);
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
    public void getHomeWorldTile_GetTile_GetsAFactionTile() {
        game = new Game(2);

        Tile homeWorldTile = game.getHomeWorldTile();

        assertThat(homeWorldTile).isInstanceOf(SettleTile.class);
    }

    @Test
    public void getHomeWorldTile_GetAllTiles_NoHomeWorldTilesMatchAndPoolContainsTheCorrectNumber() {
        game = new Game(2);
        ArrayList<String> allHomeWorldTiles = new ArrayList<String>();
        int numberOfHomeWorldTiles = FactionTile.values().length;
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
}