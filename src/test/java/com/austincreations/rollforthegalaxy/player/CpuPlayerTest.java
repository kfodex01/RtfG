package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CpuPlayerTest {

    private CpuPlayer underTest;
    private Player player;
    private Tile[] firstTile = new Tile[2];
    private Tile[] secondTile = new Tile[2];

    @BeforeEach
    public void setup(){
        underTest = new CpuPlayer();
        player = mock(Player.class);
        firstTile[0] = mock(Tile.class);
        firstTile[1] = mock(Tile.class);
        secondTile[0]= mock(Tile.class);
        secondTile[1]= mock(Tile.class);
    }

    @Test
    public void askPlayerToChooseInitialGameTiles_TilesWithRandomPoints_ChoosesAValidCombo(){
        when(firstTile[0].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(firstTile[1].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(secondTile[0].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(secondTile[1].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));

        Tile[] result = underTest.askPlayerToChooseInitialGameTiles(player, firstTile, secondTile);

        assertThat((result[0] == firstTile[0] && result[1] == secondTile[1]) || (result[0] == secondTile[0] && result[1] == firstTile[1])).isTrue();
    }

    @Test
    public void askPlayerToChooseInitialGameTiles_TilesWithRandomPoints_ChoosesLowerSumCombo(){
        when(firstTile[0].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(firstTile[1].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(secondTile[0].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        when(secondTile[1].getPoints()).thenReturn(ThreadLocalRandom.current().nextInt(1, 7));
        int firstSum = firstTile[0].getPoints() + secondTile[1].getPoints();
        int secondSum = secondTile[0].getPoints() + firstTile[1].getPoints();

        Tile[] result = underTest.askPlayerToChooseInitialGameTiles(player, firstTile, secondTile);

        if (firstSum <= secondSum){
            assertThat(result[0] == firstTile[0] && result[1] == secondTile[1]).isTrue();
        } else {
            assertThat(result[0] == secondTile[0] && result[1] == firstTile[1]).isTrue();
        }
    }
}