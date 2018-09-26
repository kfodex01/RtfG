package com.austincreations.rollforthegalaxy;

import javax.swing.*;
import java.awt.*;

public class GameLauncher extends JFrame {
    private Game game;
    private Container container;

    public GameLauncher() {
        container = getContentPane();
        container.setLayout(new FlowLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Roll for the Galaxy");
        setSize(800, 600);
        setVisible(true);

        container.add(new JLabel("Please select number of players:"));
        JButton twoPlayer = new JButton("2");
        JButton threePlayer = new JButton("3");
        JButton fourPlayer = new JButton("4");
        JButton fivePlayer = new JButton("5");
        container.add(twoPlayer);
        container.add(threePlayer);
        container.add(fourPlayer);
        container.add(fivePlayer);

        twoPlayer.addActionListener(evt -> startGame(2));

        threePlayer.addActionListener(evt -> startGame(3));

        fourPlayer.addActionListener(evt -> startGame(4));

        fivePlayer.addActionListener(evt -> startGame(5));
    }

    public void startGame(int numberOfPlayers) {
        this.dispose();
        game = new Game(numberOfPlayers, 1);
        game.setupPlayers();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameLauncher());
    }
}
