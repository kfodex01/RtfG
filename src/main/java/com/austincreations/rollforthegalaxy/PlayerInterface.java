package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerInterface extends JFrame {
    Game game;
    JButton twoPlayer;
    JButton threePlayer;
    JButton fourPlayer;
    JButton fivePlayer;

    public PlayerInterface() {
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

        twoPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PlayerInterface();
            }
        });
    }

    public Tile[] askPlayerToChooseInitialGameTiles(Tile[] firstTile, Tile[] secondTile) {
        return null;
    }
}
