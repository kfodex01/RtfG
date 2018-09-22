package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

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
}