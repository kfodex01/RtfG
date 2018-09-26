package com.austincreations.rollforthegalaxy;

import javax.swing.*;
import java.awt.*;

public class GameLauncher extends JFrame {
    private Game game;
    private JButton twoPlayer;
    private JButton threePlayer;
    private JButton fourPlayer;
    private JButton fivePlayer;

    public GameLauncher() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Roll for the Galaxy");
        setSize(800, 600);
        setVisible(true);

        container.add(new JLabel("Please select number of players:"));
        twoPlayer = new JButton("2");
        threePlayer = new JButton("3");
        fourPlayer = new JButton("4");
        fivePlayer = new JButton("5");
        container.add(twoPlayer);
        container.add(threePlayer);
        container.add(fourPlayer);
        container.add(fivePlayer);

        twoPlayer.addActionListener(evt ->
                game = new Game(2, 1)
        );

        threePlayer.addActionListener(evt ->
                game = new Game(3, 1)
        );

        fourPlayer.addActionListener(evt ->
                game = new Game(4, 1)
        );

        fivePlayer.addActionListener(evt ->
                game = new Game(5, 1)
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameLauncher());
    }
}
