package com.austincreations.rollforthegalaxy.tile;

import com.austincreations.rollforthegalaxy.Die;
import com.austincreations.rollforthegalaxy.DieColor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SettleTileTest {

    @Test
    public void addDie_WhiteDieToEmptyBrownPlanet_WhiteDieWillBeOnTile() {
        SettleTile settleTile = new SettleTile("Test", 0, PlanetColor.BROWN, null);

        settleTile.addDice(new Die(DieColor.WHITE));

        assertThat(settleTile.getDiceByDieColor().length).isEqualTo(1);
        assertThat(settleTile.getDiceByDieColor()[0]).isEqualTo(DieColor.WHITE);
    }

    @Test
    public void addDie_WhiteDieToOccupiedBrownPlanet_OnlyOneDieOnPlanet() {
        SettleTile settleTile = new SettleTile("Test", 0, PlanetColor.BROWN, null);

        settleTile.addDice(new Die(DieColor.WHITE));
        settleTile.addDice(new Die(DieColor.WHITE));

        assertThat(settleTile.getDiceByDieColor().length).isEqualTo(1);
    }

    @Test
    public void addDie_WhiteDieToEmptyGrayPlanet_NoDieOnPlanet() {
        SettleTile settleTile = new SettleTile("Test", 0, PlanetColor.GRAY, null);

        settleTile.addDice(new Die(DieColor.WHITE));

        assertThat(settleTile.getDiceByDieColor().length).isEqualTo(0);
    }
}