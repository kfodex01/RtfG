package com.austincreations.rollforthegalaxy.tile;

public class TileFactory {
    private TileFactory() {
    }

    public static Tile createEmptyTile() {
        return new DevelopTile("", -1);
    }

    public static Tile[] getGameTiles(GameTile gameTile) {
        Tile[] returnValue = new Tile[2];
        switch (gameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                returnValue[0] = new DevelopTile("Advanced Logistics", 1);
                returnValue[1] = new SettleTile("Designer Species, Ultd.", 5, PlanetColor.GREEN);
                break;
            case ALIEN_RESEARCH_SHIP_SPICE_WORLD:
                returnValue[0] = new DevelopTile("Alien Research Ship", 5);
                returnValue[1] = new SettleTile("Spice World", 2, PlanetColor.BLUE);
                break;
            case ALIEN_UPLIFT_BLUEPRINTS_INFORMATION_HUB:
                returnValue[0] = new DevelopTile("Alien Uplift Blueprints", 3);
                returnValue[1] = new SettleTile("Information Hub", 3, PlanetColor.BLUE);
                break;
            case COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS:
                returnValue[0] = new DevelopTile("Colonial Affinity", 2);
                returnValue[1] = new SettleTile("Malevolent Lifeforms", 4, PlanetColor.GREEN);
                break;
            case DIVERSIFICATION_LOST_SPECIES_ARK_WORLD:
                returnValue[0] = new DevelopTile("Diversification", 1);
                returnValue[1] = new SettleTile("Lost Species Ark World", 5, PlanetColor.GREEN);
                break;
            case EXECUTIVE_POWER_TRADING_WORLD:
                returnValue[0] = new DevelopTile("Executive Power", 3);
                returnValue[1] = new SettleTile("Trading World", 3, PlanetColor.GRAY);
                break;
            case EXPORT_DUTIES_SILICON_WORLD:
                returnValue[0] = new DevelopTile("Export Duties", 2);
                returnValue[1] = new SettleTile("Silicon World", 4, PlanetColor.BROWN);
                break;
            case FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS:
                returnValue[0] = new DevelopTile("Free Trade Association", 6);
                returnValue[1] = new SettleTile("Sentient Robots", 2, PlanetColor.GRAY);
                break;
            case GALACTIC_BANKERS_FORMER_PENAL_COLONY:
                returnValue[0] = new DevelopTile("Galactic Bankers", 6);
                returnValue[1] = new SettleTile("Former Penal Colony", 1, PlanetColor.BLUE);
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                returnValue[0] = new DevelopTile("Galactic Demand", 2);
                returnValue[1] = new SettleTile("Deserted Alien Outpost", 4, PlanetColor.YELLOW);
                break;
            case GALACTIC_INVESTORS_NEW_VINLAND:
                returnValue[0] = new DevelopTile("Galactic Investors", 5);
                returnValue[1] = new SettleTile("New Vinland", 2, PlanetColor.BLUE);
                break;
            case GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP:
                returnValue[0] = new DevelopTile("Galactic Recycling", 2);
                returnValue[1] = new SettleTile("Alien Robot Scout Ship", 4, PlanetColor.YELLOW);
                break;
            case GALACTIC_RESERVES_REBEL_HIDEOUT:
                returnValue[0] = new DevelopTile("Galactic Reserves", 6);
                returnValue[1] = new SettleTile("Rebel Hideout", 2, PlanetColor.GRAY);
                break;
            case HOMEWORLD_PATRIOTISM_PLAGUE_WORLD:
                returnValue[0] = new DevelopTile("Homeworld Patriotism", 3);
                returnValue[1] = new SettleTile("Plague World", 3, PlanetColor.GREEN);
                break;
            case ISOLATION_POLICY_PLANETARY_NEBULA:
                returnValue[0] = new DevelopTile("Isolation Policy", 3);
                returnValue[1] = new SettleTile("Planetary Nebula", 3, PlanetColor.BROWN);
                break;
            case REPLICANT_ROBOTS_SPACE_PORT:
                returnValue[0] = new DevelopTile("Replicant Robots", 4);
                returnValue[1] = new SettleTile("Space Port", 2, PlanetColor.BLUE);
                break;
            case SPACE_DOCKS_ARMAMENTS_WORLD:
                returnValue[0] = new DevelopTile("Space Docks", 2);
                returnValue[1] = new SettleTile("Armaments World", 4, PlanetColor.BROWN);
                break;
            case TRADE_LEVIES_COMET_ZONE:
                returnValue[0] = new DevelopTile("Trade Levies", 3);
                returnValue[1] = new SettleTile("Comet Zone", 3, PlanetColor.BROWN);
                break;
            default:
                returnValue[0] = new DevelopTile("", -1);
                returnValue[1] = new SettleTile("", -1, null);
                break;
        }
        return returnValue;
    }

    public static Tile[] getFactionTiles(FactionTile factionTile) {
        Tile[] returnValue = new Tile[2];
        switch (factionTile) {
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                returnValue[0] = new DevelopTile("Space Piracy", 0);
                returnValue[1] = new SettleTile("Hidden Fortress", 2, PlanetColor.GRAY);
                break;
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                returnValue[0] = new DevelopTile("Alien Archaeology", 1);
                returnValue[1] = new SettleTile("Alien Rosetta Stone World", 1, PlanetColor.GRAY);
                break;
            case CONSUMER_MARKETS_SPACE_MALL:
                returnValue[0] = new DevelopTile("Consumer Markets", 3);
                returnValue[1] = new SettleTile("Space Mall", 0, PlanetColor.BLUE);
                break;
            case IMPROVED_RECONNAISSANCE_WORMHOLE_STATION:
                returnValue[0] = new DevelopTile("Improved Reconnaissance", 2);
                returnValue[1] = new SettleTile("Wormhole Station", 3, PlanetColor.BROWN);
                break;
            default:
                returnValue[0] = new DevelopTile("", -1);
                returnValue[1] = new SettleTile("", -1, null);
                break;
        }
        return returnValue;
    }

    public static SettleTile getHomeWorldTiles(HomeWorldTile thisHomeWorldTile) {
        SettleTile returnTile;
        switch (thisHomeWorldTile) {
            case ALPHA_CENTAURI:
                returnTile = new SettleTile("Alpha Centauri", 1, PlanetColor.BROWN);
                break;
            case DOOMED_WORLD:
                returnTile = new SettleTile("Doomed World", 0, PlanetColor.GRAY);
                break;
            case SEPARATIST_COLONY:
                returnTile = new SettleTile("Separatist Colony", 2, PlanetColor.GRAY);
                break;
            default:
                returnTile = new SettleTile("", -1, null);
                break;
        }
        return returnTile;
    }
}
