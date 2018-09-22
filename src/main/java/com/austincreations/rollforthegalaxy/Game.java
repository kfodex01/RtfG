package com.austincreations.rollforthegalaxy;

public class Game {
    Player[] players;

    public Game(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
    }

    public int getNumberOfPlayers() {
        return players.length;
    }
}
