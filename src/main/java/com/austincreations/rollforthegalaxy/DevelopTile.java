package com.austincreations.rollforthegalaxy;

public class DevelopTile implements Tile {
    private String name;
    private int points;

    private DevelopTile(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public static DevelopTile[] getFactionTiles(FactionTile thisFactionTile) {
        DevelopTile thisTile;
        DevelopTile[] returnValue;
        switch (thisFactionTile) {
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                thisTile = new DevelopTile("Space Piracy", 0);
                break;
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                thisTile = new DevelopTile("Alien Archaeology", 1);
                break;
            default:
                thisTile = null;
                break;
        }
        if (thisTile == null) {
            returnValue = new DevelopTile[]{};
        } else {
            returnValue = new DevelopTile[]{thisTile};
        }
        return returnValue;
    }

    public DevelopTile(GameTile thisGameTile) {
        switch (thisGameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                name = "Advanced Logistics";
                points = 1;
                break;
            case ALIEN_RESEARCH_SHIP_SPICE_WORLD:
                name = "Alien Research Ship";
                points = 5;
                break;
            case COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS:
                name = "Colonial Affinity";
                points = 2;
                break;
            case DIVERSIFICATION_LOST_SPECIES_ARK_WORLD:
                name = "Diversification";
                points = 1;
                break;
            case EXECUTIVE_POWER_TRADING_WORLD:
                name = "Executive Power";
                points = 3;
                break;
            case EXPORT_DUTIES_SILICON_WORLD:
                name = "Export Duties";
                points = 2;
                break;
            case FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS:
                name = "Free Trade Association";
                points = 6;
                break;
            case GALACTIC_BANKERS_FORMER_PENAL_COLONY:
                name = "Galactic Bankers";
                points = 6;
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                name = "Galactic Demand";
                points = 2;
                break;
            case GALACTIC_INVESTORS_NEW_VINLAND:
                name = "Galactic Investors";
                points = 5;
                break;
            case GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP:
                name = "Galactic Recycling";
                points = 2;
                break;
            case GALACTIC_RESERVES_REBEL_HIDEOUT:
                name = "Galactic Reserves";
                points = 6;
                break;
            case HOMEWORLD_PATRIOTISM_PLAGUE_WORLD:
                name = "Homeworld Patriotism";
                points = 3;
                break;
            case ISOLATION_POLICY_PLANETARY_NEBULA:
                name = "Isolation Policy";
                points = 3;
                break;
            case REPLICANT_ROBOTS_SPACE_PORT:
                name = "Replicant Robots";
                points = 4;
                break;
            case SPACE_DOCKS_ARMAMENTS_WORLD:
                name = "Space Docks";
                points = 2;
                break;
            case TRADE_LEVIES_COMET_ZONE:
                name = "Trade Levies";
                points = 3;
                break;
            default:
                name = "";
                points = 0;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
