package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TileTest {
    Tile firstTile;

    @Test
    public void getName_CreateGalacticDemandTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GalacticDemand_DesertedAlienOutpost);

        assertThat("Galactic Demand".equals(firstTile.getName())).isEqualTo(true);
    }

    @Test
    public void getName_CreateGalacticReservesTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GalacticReserves_RebelHideout);

        assertThat("Galactic Reserves".equals(firstTile.getName())).isEqualTo(true);
    }

    @Test
    public void getPoints_CreateGalacticDemandTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GalacticDemand_DesertedAlienOutpost);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getPoints_CreateGalacticReservesTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GalacticReserves_RebelHideout);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void flipTile_CreateGalacticDemandTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GalacticDemand_DesertedAlienOutpost);

        firstTile.flipTile();

        assertThat("Deserted Alien Outpost".equals(firstTile.getName())).isEqualTo(true);
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void flipTile_CreateGalacticReservesTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GalacticReserves_RebelHideout);

        firstTile.flipTile();

        assertThat("Rebel Hideout".equals(firstTile.getName())).isEqualTo(true);
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }
}
