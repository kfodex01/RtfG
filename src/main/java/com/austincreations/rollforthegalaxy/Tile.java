package com.austincreations.rollforthegalaxy;

public class Tile {
    boolean developSideIsUp = true;
    private String developName;
    private String settleName;
    private int developPoints;
    private int settlePoints;
    private PlanetColor thisPlanetColor;

    public Tile(GameTile thisGameTile) {
        switch (thisGameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                developName = "Advanced Logistics";
                developPoints = 1;
                settleName = "Designer Species, Ultd.";
                settlePoints = 5;
                thisPlanetColor = PlanetColor.GREEN;
                break;
            case EXECUTIVE_POWER_TRADING_WORLD:
                developName = "Executive Power";
                developPoints = 3;
                settleName = "Trading World";
                settlePoints = 3;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                developName = "Galactic Demand";
                developPoints = 2;
                settleName = "Deserted Alien Outpost";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.YELLOW;
                break;
            case GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP:
                developName = "Galactic Recycling";
                developPoints = 2;
                settleName = "Alien Robot Scout SHIP";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.YELLOW;
                break;
            case GALACTIC_RESERVES_REBEL_HIDEOUT:
                developName = "Galactic Reserves";
                developPoints = 6;
                settleName = "Rebel Hideout";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            case HOMEWORLD_PATRIOTISM_PLAGUE_WORLD:
                developName = "Homeworld Patriotism";
                developPoints = 3;
                settleName = "Plague World";
                settlePoints = 3;
                thisPlanetColor = PlanetColor.GREEN;
                break;
            case ISOLATION_POLICY_PLANETARY_NEBULA:
                developName = "Isolation Policy";
                developPoints = 3;
                settleName = "Planetary Nebula";
                settlePoints = 3;
                thisPlanetColor = PlanetColor.BROWN;
                break;
            default:
                developName = "";
                developPoints = 0;
                settleName = "";
                settlePoints = 0;
                thisPlanetColor = null;
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

    public PlanetColor getSettleColor() {
        return thisPlanetColor;
    }
}
