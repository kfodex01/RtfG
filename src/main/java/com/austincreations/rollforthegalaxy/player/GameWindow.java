package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.tile.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private Container container;

    public GameWindow() {
        container = getContentPane();
        container.setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Roll for the Galaxy");
        setSize(800, 600);
        setVisible(true);
    }

    public void askPlayerToChooseInitialGameTiles(Tile[] tableau, Tile[] firstTile, Tile[] secondTile, ActionListener firstButton, ActionListener secondButton) {
        for (Tile thisTile : tableau) {
            container.add(new JLabel(thisTile.getName()));
        }
        container.add(new JLabel(firstTile[0].getName() + "/" + secondTile[1].getName()));
        container.add(new JLabel(firstTile[1].getName() + "/" + secondTile[0].getName()));
        JButton firstOption = new JButton("First Option");
        JButton secondOption = new JButton("Second Option");
        container.add(firstOption);
        container.add(secondOption);
        firstOption.addActionListener(firstButton);
        secondOption.addActionListener(secondButton);
    }
}
