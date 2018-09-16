package com.austincreations.rollforthegalaxy;

public class Tile {
    boolean developSideIsUp = true;
    private String developName = "";
    private String settleName = "";
    private int developPoints = 0;
    private int settlePoints = 0;

    public Tile(GameTile thisGameTile) {
        switch (thisGameTile) {
            case GalacticDemand_DesertedAlienOutpost:
                developName = "Galactic Demand";
                settleName = "Deserted Alien Outpost";
                developPoints = 2;
                settlePoints = 4;
                break;
            case GalacticReserves_RebelHideout:
                developName = "Galactic Reserves";
                settleName = "Rebel Hideout";
                developPoints = 6;
                settlePoints = 2;
                break;
        }
    }

    public String getName() {
        if (developSideIsUp) {
            return developName;
        } else {
            return settleName;
        }
    }

    public int getPoints() {
        if (developSideIsUp) {
            return developPoints;
        } else {
            return settlePoints;
        }
    }

    public void flipTile() {
        developSideIsUp = !developSideIsUp;
    }
}
