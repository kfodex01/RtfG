package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

import java.awt.event.ActionListener;

public class HumanPlayer implements PlayerInterface {
    private GameWindow gameWindow;

    public HumanPlayer() {
        gameWindow = new GameWindow();
    }

    @Override
    public Tile[] askPlayerToChooseInitialGameTiles(Player player, Tile[] firstTile, Tile[] secondTile) {
        Tile[] tableau = player.getTilesInTableau();
        final Tile[] result = new Tile[2];
        ActionListener firstTileDevelopSecondTileSettle = e -> {
            result[0] = firstTile[0];
            result[1] = secondTile[1];
        };
        ActionListener firstTileSettleSecondTileDevelop = e -> {
            result[0] = secondTile[0];
            result[1] = firstTile[1];
        };
        gameWindow.askPlayerToChooseInitialGameTiles(tableau, firstTile, secondTile, firstTileDevelopSecondTileSettle, firstTileSettleSecondTileDevelop);
        return result;
    }
}
