package com.austincreations.rollforthegalaxy;

public class Tile {
    private boolean developSideIsUp;
    private boolean canFlip;
    private String developName;
    private String settleName;
    private int developPoints;
    private int settlePoints;
    private PlanetColor thisPlanetColor;

    public Tile(GameTile thisGameTile) {
        developSideIsUp = true;
        canFlip = true;

        switch (thisGameTile) {
            case ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD:
                developName = "Advanced Logistics";
                developPoints = 1;
                settleName = "Designer Species, Ultd.";
                settlePoints = 5;
                thisPlanetColor = PlanetColor.GREEN;
                break;
            case ALIEN_RESEARCH_SHIP_SPICE_WORLD:
                developName = "Alien Research Ship";
                developPoints = 5;
                settleName = "Spice World";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.BLUE;
                break;
            case COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS:
                developName = "Colonial Affinity";
                developPoints = 2;
                settleName = "Malevolent Lifeforms";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.GREEN;
                break;
            case DIVERSIFICATION_LOST_SPECIES_ARK_WORLD:
                developName = "Diversification";
                developPoints = 1;
                settleName = "Lost Species Ark World";
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
            case EXPORT_DUTIES_SILICON_WORLD:
                developName = "Export Duties";
                developPoints = 2;
                settleName = "Silicon World";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.BROWN;
                break;
            case FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS:
                developName = "Free Trade Association";
                developPoints = 6;
                settleName = "Sentient Robots";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            case GALACTIC_BANKERS_FORMER_PENAL_COLONY:
                developName = "Galactic Bankers";
                developPoints = 6;
                settleName = "Former Penal Colony";
                settlePoints = 1;
                thisPlanetColor = PlanetColor.BLUE;
                break;
            case GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST:
                developName = "Galactic Demand";
                developPoints = 2;
                settleName = "Deserted Alien Outpost";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.YELLOW;
                break;
            case GALACTIC_INVESTORS_NEW_VINLAND:
                developName = "Galactic Investors";
                developPoints = 5;
                settleName = "New Vinland";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.BLUE;
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
            case REPLICANT_ROBOTS_SPACE_PORT:
                developName = "Replicant Robots";
                developPoints = 4;
                settleName = "Space Port";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.BLUE;
                break;
            case SPACE_DOCKS_ARMAMENTS_WORLD:
                developName = "Space Docks";
                developPoints = 2;
                settleName = "Armaments World";
                settlePoints = 4;
                thisPlanetColor = PlanetColor.BROWN;
                break;
            case TRADE_LEVIES_COMET_ZONE:
                developName = "Trade Levies";
                developPoints = 3;
                settleName = "Comet Zone";
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

    public Tile(HomeWorldTile thisHomeWorldTile) {
        canFlip = false;
        developSideIsUp = false;

        switch (thisHomeWorldTile) {
            case DOOMED_WORLD:
                settleName = "Doomed World";
                settlePoints = 0;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            case SEPARATIST_COLONY:
                settleName = "Separatist Colony";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            default:
                settleName = "";
                settlePoints = 0;
                thisPlanetColor = null;
                break;
        }
    }

    public Tile(FactionTile thisFactionTile, boolean isLeftSide) {
        canFlip = false;

        if (isLeftSide) {
            createLeftSide(thisFactionTile);
        } else {
            createRightSide(thisFactionTile);
        }
    }

    private void createLeftSide(FactionTile thisFactionTile) {
        switch (thisFactionTile) {
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                developSideIsUp = true;
                developName = "Alien Archaeology";
                developPoints = 1;
                thisPlanetColor = null;
                break;
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                developSideIsUp = true;
                developName = "Space Piracy";
                developPoints = 0;
                thisPlanetColor = null;
                break;
            default:
                developSideIsUp = true;
                developName = "";
                developPoints = 0;
                settleName = "";
                settlePoints = 0;
                thisPlanetColor = null;
                break;
        }
    }

    private void createRightSide(FactionTile thisFactionTile) {
        switch (thisFactionTile) {
            case ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD:
                developSideIsUp = false;
                settleName = "Alien Rosetta Stone World";
                settlePoints = 1;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            case SPACE_PIRACY_HIDDEN_FORTRESS:
                developSideIsUp = false;
                settleName = "Hidden Fortress";
                settlePoints = 2;
                thisPlanetColor = PlanetColor.GRAY;
                break;
            default:
                developSideIsUp = true;
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
        if (canFlip) {
            developSideIsUp = !developSideIsUp;
        }
    }

    public PlanetColor getSettleColor() {
        return thisPlanetColor;
    }
}
