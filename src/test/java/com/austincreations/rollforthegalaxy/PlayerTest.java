package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private Player thisPlayer;

    @BeforeEach
    public void setup() {
        thisPlayer = new Player();
    }

    @Test
    public void runPreSetup_InitializePlayer_CreditsShouldEqualOne() {
        thisPlayer.runPreSetup();

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(1);
    }

    @Test
    public void runPreSetup_InitializePlayer_CupShouldHaveTwoWhiteDice() {
        thisPlayer.runPreSetup();
        DieColor[] cupContentsByDieColor = thisPlayer.getCupContentsByDieColor();

        assertThat(cupContentsByDieColor.length).isEqualTo(3);
        assertThat(cupContentsByDieColor[0]).isEqualTo(DieColor.WHITE);
        assertThat(cupContentsByDieColor[1]).isEqualTo(DieColor.WHITE);
        assertThat(cupContentsByDieColor[2]).isEqualTo(DieColor.WHITE);
    }

    @Test
    public void runPreSetup_InitializePlayer_CitizenryShouldHaveTwoWhiteDice() {
        thisPlayer.runPreSetup();
        DieColor[] citizenryContentsByDieColor = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryContentsByDieColor.length).isEqualTo(2);
        assertThat(citizenryContentsByDieColor[0]).isEqualTo(DieColor.WHITE);
        assertThat(citizenryContentsByDieColor[1]).isEqualTo(DieColor.WHITE);
    }
}
