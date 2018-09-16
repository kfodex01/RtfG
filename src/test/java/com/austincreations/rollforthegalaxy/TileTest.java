package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TileTest {
    Tile firstTile;

    @Test
    public void getName_CreateGalacticDemandTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getName()).isEqualTo("Galactic Demand");
    }

    @Test
    public void getName_CreateGalacticRecyclingTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getName()).isEqualTo("Galactic Recycling");
    }

    @Test
    public void getName_CreateGalacticReservesTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getName()).isEqualTo("Galactic Reserves");
    }

    @Test
    public void getName_CreateHomeworldPatriotismTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Homeworld Patriotism");
    }

    @Test
    public void getName_CreateIsolationPolicyTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getName()).isEqualTo("Isolation Policy");
    }

    @Test
    public void getPoints_CreateGalacticDemandTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getPoints_CreateGalacticRecyclingTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getPoints_CreateGalacticReservesTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void getPoints_CreateHomeworldPatriotismTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getPoints_CreateIsolationPolicyTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateGalacticDemandTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Deserted Alien Outpost");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void flipTile_CreateGalacticRecyclingTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Alien Robot Scout Ship");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void flipTile_CreateGalacticReservesTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Rebel Hideout");
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void flipTile_CreateHomeworldPatriotismTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Plague World");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateIsolationPolicyTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Planetary Nebula");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }
}
