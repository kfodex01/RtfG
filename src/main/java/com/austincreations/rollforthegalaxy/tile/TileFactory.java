package com.austincreations.rollforthegalaxy.tile;

public class TileFactory {
    private TileFactory() {
    }

    public static Tile createEmptyTile() {
        return new DevelopTile("", -1, new DevelopTileEffect[]{});
    }

    public static Tile[] getGameTiles(GameTile gameTile) {
        Tile[] returnValue = new Tile[2];
        switch (gameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                returnValue[0] = new DevelopTile("Advanced Logistics", 1, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Designer Species, Ultd.", 5, PlanetColor.GREEN, new SettleTileEffect[]{});
                break;
            case ALIEN_RESEARCH_SHIP_SPICE_WORLD:
                returnValue[0] = new DevelopTile("Alien Research Ship", 5, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Spice World", 2, PlanetColor.BLUE, new SettleTileEffect[]{});
                break;
            case ALIEN_UPLIFT_BLUEPRINTS_INFORMATION_HUB:
                returnValue[0] = new DevelopTile("Alien Uplift Blueprints", 3, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Information Hub", 3, PlanetColor.BLUE, new SettleTileEffect[]{});
                break;
            case COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS:
                returnValue[0] = new DevelopTile("Colonial Affinity", 2, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Malevolent Lifeforms", 4, PlanetColor.GREEN, new SettleTileEffect[]{});
                break;
            case DIVERSIFICATION_LOST_SPECIES_ARK_WORLD:
                returnValue[0] = new DevelopTile("Diversification", 1, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Lost Species Ark World", 5, PlanetColor.GREEN, new SettleTileEffect[]{});
                break;
            case EXECUTIVE_POWER_TRADING_WORLD:
                returnValue[0] = new DevelopTile("Executive Power", 3, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Trading World", 3, PlanetColor.GRAY, new SettleTileEffect[]{});
                break;
            case EXPORT_DUTIES_SILICON_WORLD:
                returnValue[0] = new DevelopTile("Export Duties", 2, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Silicon World", 4, PlanetColor.BROWN, new SettleTileEffect[]{});
                break;
            case FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS:
                returnValue[0] = new DevelopTile("Free Trade Association", 6, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Sentient Robots", 2, PlanetColor.GRAY, new SettleTileEffect[]{});
                break;
            case GALACTIC_BANKERS_FORMER_PENAL_COLONY:
                returnValue[0] = new DevelopTile("Galactic Bankers", 6, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Former Penal Colony", 1, PlanetColor.BLUE, new SettleTileEffect[]{});
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                returnValue[0] = new DevelopTile("Galactic Demand", 2, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Deserted Alien Outpost", 4, PlanetColor.YELLOW, new SettleTileEffect[]{});
                break;
            case GALACTIC_INVESTORS_NEW_VINLAND:
                returnValue[0] = new DevelopTile("Galactic Investors", 5, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("New Vinland", 2, PlanetColor.BLUE, new SettleTileEffect[]{});
                break;
            case GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP:
                returnValue[0] = new DevelopTile("Galactic Recycling", 2, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Alien Robot Scout Ship", 4, PlanetColor.YELLOW, new SettleTileEffect[]{});
                break;
            case GALACTIC_RESERVES_REBEL_HIDEOUT:
                returnValue[0] = new DevelopTile("Galactic Reserves", 6, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Rebel Hideout", 2, PlanetColor.GRAY, new SettleTileEffect[]{});
                break;
            case HOMEWORLD_PATRIOTISM_PLAGUE_WORLD:
                returnValue[0] = new DevelopTile("Homeworld Patriotism", 3, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Plague World", 3, PlanetColor.GREEN, new SettleTileEffect[]{});
                break;
            case ISOLATION_POLICY_PLANETARY_NEBULA:
                returnValue[0] = new DevelopTile("Isolation Policy", 3, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Planetary Nebula", 3, PlanetColor.BROWN, new SettleTileEffect[]{});
                break;
            case REPLICANT_ROBOTS_SPACE_PORT:
                returnValue[0] = new DevelopTile("Replicant Robots", 4, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Space Port", 2, PlanetColor.BLUE, new SettleTileEffect[]{});
                break;
            case SPACE_DOCKS_ARMAMENTS_WORLD:
                returnValue[0] = new DevelopTile("Space Docks", 2, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Armaments World", 4, PlanetColor.BROWN, new SettleTileEffect[]{});
                break;
            case TRADE_LEVIES_COMET_ZONE:
                returnValue[0] = new DevelopTile("Trade Levies", 3, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("Comet Zone", 3, PlanetColor.BROWN, new SettleTileEffect[]{});
                break;
            default:
                returnValue[0] = new DevelopTile("", -1, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("", -1, null, new SettleTileEffect[]{});
                break;
        }
        return returnValue;
    }

    public static Tile[] getFactionTiles(FactionTile factionTile) {
        Tile[] returnValue = new Tile[2];
        switch (factionTile) {
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                returnValue[0] = new DevelopTile("Space Piracy", 0, new DevelopTileEffect[]{DevelopTileEffect.SHIP_ONE_CREDIT_FOR_EVERY_TWO_RED_DICE_IN_CITIZENRY_AT_END_OF_PHASE});
                returnValue[1] = new SettleTile("Hidden Fortress", 2, PlanetColor.GRAY, new SettleTileEffect[]{SettleTileEffect.ADD_RED_DIE_TO_CITIZENRY});
                break;
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                returnValue[0] = new DevelopTile("Alien Archaeology", 1, new DevelopTileEffect[]{DevelopTileEffect.EXPLORE_FOUR_CREDITS_WHEN_STOCKING_WITH_A_YELLOW_DIE});
                returnValue[1] = new SettleTile("Alien Rosetta Stone World", 1, PlanetColor.GRAY, new SettleTileEffect[]{SettleTileEffect.ADD_YELLOW_DIE_TO_CITIZENRY});
                break;
            case CONSUMER_MARKETS_SPACE_MALL:
                returnValue[0] = new DevelopTile("Consumer Markets", 3, new DevelopTileEffect[]{DevelopTileEffect.PRODUCE_ONE_CREDIT_FOR_EACH_BLUE_DIE_ON_A_WORLD_AT_END_OF_PHASE});
                returnValue[1] = new SettleTile("Space Mall", 0, PlanetColor.BLUE, new SettleTileEffect[]{SettleTileEffect.ADD_BLUE_DIE_TO_CUP});
                break;
            case IMPROVED_RECONNAISSANCE_WORMHOLE_STATION:
                returnValue[0] = new DevelopTile("Improved Reconnaissance", 2, new DevelopTileEffect[]{DevelopTileEffect.EXPLORE_MAY_PLACE_TILES_ON_TOP_OF_STACKS});
                returnValue[1] = new SettleTile("Wormhole Station", 3, PlanetColor.BROWN, new SettleTileEffect[]{SettleTileEffect.ADD_BROWN_DIE_TO_CUP});
                break;
            case GENETICS_LAB_THE_LAST_OF_THE_GNARSSH:
                returnValue[0] = new DevelopTile("Genetics Lab", 2, new DevelopTileEffect[]{DevelopTileEffect.PRODUCE_TWO_CREDITS_FOR_EACH_GREEN_DIE_USED_IN_PHASE_AT_END_OF_PHASE});
                returnValue[1] = new SettleTile("The Last of the Gnarssh", 0, PlanetColor.GREEN, new SettleTileEffect[]{SettleTileEffect.ADD_GREEN_DIE_TO_CITIZENRY});
                break;
            default:
                returnValue[0] = new DevelopTile("", -1, new DevelopTileEffect[]{});
                returnValue[1] = new SettleTile("", -1, null, new SettleTileEffect[]{});
                break;
        }
        return returnValue;
    }

    public static SettleTile getHomeWorldTiles(HomeWorldTile thisHomeWorldTile) {
        SettleTile returnTile;
        switch (thisHomeWorldTile) {
            case ALPHA_CENTAURI:
                returnTile = new SettleTile("Alpha Centauri", 1, PlanetColor.BROWN, new SettleTileEffect[]{SettleTileEffect.ADD_BROWN_DIE_TO_WORLD});
                break;
            case ANCIENT_RACE:
                returnTile = new SettleTile("Ancient Race", 0, PlanetColor.GREEN, new SettleTileEffect[]{SettleTileEffect.ADD_GREEN_DIE_TO_WORLD});
                break;
            case DOOMED_WORLD:
                returnTile = new SettleTile("Doomed World", 0, PlanetColor.GRAY, new SettleTileEffect[]{SettleTileEffect.START_WITH_EIGHT_CREDITS});
                break;
            case NEW_SPARTA:
                returnTile = new SettleTile("New Sparta", 2, PlanetColor.GRAY, new SettleTileEffect[]{SettleTileEffect.ADD_RED_DIE_TO_CITIZENRY, SettleTileEffect.ADD_RED_DIE_TO_CITIZENRY});
                break;
            case SEPARATIST_COLONY:
                returnTile = new SettleTile("Separatist Colony", 2, PlanetColor.GRAY, new SettleTileEffect[]{SettleTileEffect.ADD_RED_DIE_TO_CUP});
                break;
            default:
                returnTile = new SettleTile("", -1, null, new SettleTileEffect[]{});
                break;
        }
        return returnTile;
    }
}
