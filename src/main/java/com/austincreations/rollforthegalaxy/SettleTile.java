package com.austincreations.rollforthegalaxy;

public class SettleTile implements Tile {
    private String name;
    private int points;
    private PlanetColor planetColor;

    public static SettleTile getHomeWorldTiles(HomeWorldTile thisHomeWorldTile) {
        SettleTile thisTile;
        switch (thisHomeWorldTile) {
            case DOOMED_WORLD:
                thisTile = new SettleTile("Doomed World", 0, PlanetColor.GRAY);
                break;
            case SEPARATIST_COLONY:
                thisTile = new SettleTile("Separatist Colony", 2, PlanetColor.GRAY);
                break;
            default:
                thisTile = null;
                break;
        }
        return thisTile;
    }

    private SettleTile(String name, int points, PlanetColor planetColor) {
        this.name = name;
        this.points = points;
        this.planetColor = planetColor;
    }

    public static SettleTile[] getFactionTiles(FactionTile thisFactionTile) {
        SettleTile thisTile;
        SettleTile[] returnValue;
        switch (thisFactionTile) {
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                thisTile = new SettleTile("Hidden Fortress", 2, PlanetColor.GRAY);
                break;
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                thisTile = new SettleTile("Alien Rosetta Stone World", 1, PlanetColor.GRAY);
                break;
            default:
                thisTile = null;
                break;
        }
        if (thisTile == null) {
            returnValue = new SettleTile[]{};
        } else {
            returnValue = new SettleTile[]{thisTile};
        }
        return returnValue;
    }

    public SettleTile(GameTile thisGameTile) {
        switch (thisGameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                name = "Designer Species, Ultd.";
                points = 5;
                planetColor = PlanetColor.GREEN;
                break;
            case ALIEN_RESEARCH_SHIP_SPICE_WORLD:
                name = "Spice World";
                points = 2;
                planetColor = PlanetColor.BLUE;
                break;
            case COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS:
                name = "Malevolent Lifeforms";
                points = 4;
                planetColor = PlanetColor.GREEN;
                break;
            case DIVERSIFICATION_LOST_SPECIES_ARK_WORLD:
                name = "Lost Species Ark World";
                points = 5;
                planetColor = PlanetColor.GREEN;
                break;
            case EXECUTIVE_POWER_TRADING_WORLD:
                name = "Trading World";
                points = 3;
                planetColor = PlanetColor.GRAY;
                break;
            case EXPORT_DUTIES_SILICON_WORLD:
                name = "Silicon World";
                points = 4;
                planetColor = PlanetColor.BROWN;
                break;
            case FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS:
                name = "Sentient Robots";
                points = 2;
                planetColor = PlanetColor.GRAY;
                break;
            case GALACTIC_BANKERS_FORMER_PENAL_COLONY:
                name = "Former Penal Colony";
                points = 1;
                planetColor = PlanetColor.BLUE;
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                name = "Deserted Alien Outpost";
                points = 4;
                planetColor = PlanetColor.YELLOW;
                break;
            case GALACTIC_INVESTORS_NEW_VINLAND:
                name = "New Vinland";
                points = 2;
                planetColor = PlanetColor.BLUE;
                break;
            case GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP:
                name = "Alien Robot Scout SHIP";
                points = 4;
                planetColor = PlanetColor.YELLOW;
                break;
            case GALACTIC_RESERVES_REBEL_HIDEOUT:
                name = "Rebel Hideout";
                points = 2;
                planetColor = PlanetColor.GRAY;
                break;
            case HOMEWORLD_PATRIOTISM_PLAGUE_WORLD:
                name = "Plague World";
                points = 3;
                planetColor = PlanetColor.GREEN;
                break;
            case ISOLATION_POLICY_PLANETARY_NEBULA:
                name = "Planetary Nebula";
                points = 3;
                planetColor = PlanetColor.BROWN;
                break;
            case REPLICANT_ROBOTS_SPACE_PORT:
                name = "Space Port";
                points = 2;
                planetColor = PlanetColor.BLUE;
                break;
            case SPACE_DOCKS_ARMAMENTS_WORLD:
                name = "Armaments World";
                points = 4;
                planetColor = PlanetColor.BROWN;
                break;
            case TRADE_LEVIES_COMET_ZONE:
                name = "Comet Zone";
                points = 3;
                planetColor = PlanetColor.BROWN;
                break;
            default:
                name = "";
                points = 0;
                planetColor = null;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public PlanetColor getPlanetColor() {
        return planetColor;
    }
}
