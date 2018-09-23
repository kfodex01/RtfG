package com.austincreations.rollforthegalaxy.tile;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TileFactoryTest {
    @Test
    public void getGameTiles_AdvancedLogisticsTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Advanced Logistics");
        assertThat(firstTile.getPoints()).isEqualTo(1);
        assertThat(secondTile.getName()).isEqualTo("Designer Species, Ultd.");
        assertThat(secondTile.getPoints()).isEqualTo(5);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getGameTiles_AlienResearchShipTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Alien Research Ship");
        assertThat(firstTile.getPoints()).isEqualTo(5);
        assertThat(secondTile.getName()).isEqualTo("Spice World");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getGameTiles_AlienUpliftBlueprintsTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.ALIEN_UPLIFT_BLUEPRINTS_INFORMATION_HUB);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Alien Uplift Blueprints");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Information Hub");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getGameTiles_ColonialAffinityTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Colonial Affinity");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Malevolent Lifeforms");
        assertThat(secondTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getGameTiles_DiversificationTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Diversification");
        assertThat(firstTile.getPoints()).isEqualTo(1);
        assertThat(secondTile.getName()).isEqualTo("Lost Species Ark World");
        assertThat(secondTile.getPoints()).isEqualTo(5);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getGameTiles_ExecutivePowerTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.EXECUTIVE_POWER_TRADING_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Executive Power");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Trading World");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getGameTiles_ExportDutiesTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.EXPORT_DUTIES_SILICON_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Export Duties");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Silicon World");
        assertThat(secondTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getGameTiles_FreeTradeAssociationTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Free Trade Association");
        assertThat(firstTile.getPoints()).isEqualTo(6);
        assertThat(secondTile.getName()).isEqualTo("Sentient Robots");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getGameTiles_GalacticBankersTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Galactic Bankers");
        assertThat(firstTile.getPoints()).isEqualTo(6);
        assertThat(secondTile.getName()).isEqualTo("Former Penal Colony");
        assertThat(secondTile.getPoints()).isEqualTo(1);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getGameTiles_GalacticDemandTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Galactic Demand");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Deserted Alien Outpost");
        assertThat(secondTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getGameTiles_GalacticInvestorsTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Galactic Investors");
        assertThat(firstTile.getPoints()).isEqualTo(5);
        assertThat(secondTile.getName()).isEqualTo("New Vinland");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getGameTiles_GalacticRecyclingTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Galactic Recycling");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Alien Robot Scout Ship");
        assertThat(secondTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getGameTiles_GalacticReservesTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Galactic Reserves");
        assertThat(firstTile.getPoints()).isEqualTo(6);
        assertThat(secondTile.getName()).isEqualTo("Rebel Hideout");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getGameTiles_HomeworldPatriotismile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Homeworld Patriotism");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Plague World");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getGameTiles_IsolationPolicyTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Isolation Policy");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Planetary Nebula");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getGameTiles_ReplicantRobotsTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.REPLICANT_ROBOTS_SPACE_PORT);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Replicant Robots");
        assertThat(firstTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getName()).isEqualTo("Space Port");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getGameTiles_SpaceDocksTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Space Docks");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Armaments World");
        assertThat(secondTile.getPoints()).isEqualTo(4);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getGameTiles_TradeLeviesTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getGameTiles(GameTile.TRADE_LEVIES_COMET_ZONE);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Trade Levies");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Comet Zone");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getFactionTiles_SpacePiracyTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Space Piracy");
        assertThat(firstTile.getPoints()).isEqualTo(0);
        assertThat(secondTile.getName()).isEqualTo("Hidden Fortress");
        assertThat(secondTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getFactionTiles_AlienArchaeologyTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getFactionTiles(FactionTile.ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Alien Archaeology");
        assertThat(firstTile.getPoints()).isEqualTo(1);
        assertThat(secondTile.getName()).isEqualTo("Alien Rosetta Stone World");
        assertThat(secondTile.getPoints()).isEqualTo(1);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getFactionTiles_ConsumerMarketsTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getFactionTiles(FactionTile.CONSUMER_MARKETS_SPACE_MALL);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Consumer Markets");
        assertThat(firstTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getName()).isEqualTo("Space Mall");
        assertThat(secondTile.getPoints()).isEqualTo(0);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getFactionTiles_ImprovedReconnaissanceTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getFactionTiles(FactionTile.IMPROVED_RECONNAISSANCE_WORMHOLE_STATION);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Improved Reconnaissance");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("Wormhole Station");
        assertThat(secondTile.getPoints()).isEqualTo(3);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getFactionTiles_GeneticsLabTile_HasCorrectValues() {
        Tile[] tileArray = TileFactory.getFactionTiles(FactionTile.GENETICS_LAB_THE_LAST_OF_THE_GNARSSH);
        DevelopTile firstTile = (DevelopTile) tileArray[0];
        SettleTile secondTile = (SettleTile) tileArray[1];

        assertThat(tileArray.length).isEqualTo(2);
        assertThat(firstTile.getName()).isEqualTo("Genetics Lab");
        assertThat(firstTile.getPoints()).isEqualTo(2);
        assertThat(secondTile.getName()).isEqualTo("The Last of the Gnarssh");
        assertThat(secondTile.getPoints()).isEqualTo(0);
        assertThat(secondTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getHomeWorldTiles_AlphaCentauri_HasCorrectValues() {
        SettleTile settleTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        assertThat(settleTile.getName()).isEqualTo("Alpha Centauri");
        assertThat(settleTile.getPoints()).isEqualTo(1);
        assertThat(settleTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getHomeWorldTiles_AncientRace_HasCorrectValues() {
        SettleTile settleTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ANCIENT_RACE);

        assertThat(settleTile.getName()).isEqualTo("Ancient Race");
        assertThat(settleTile.getPoints()).isEqualTo(0);
        assertThat(settleTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getHomeWorldTiles_DoomedWorld_HasCorrectValues() {
        SettleTile settleTile = TileFactory.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);

        assertThat(settleTile.getName()).isEqualTo("Doomed World");
        assertThat(settleTile.getPoints()).isEqualTo(0);
        assertThat(settleTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getHomeWorldTiles_SeparatistColony_HasCorrectValues() {
        SettleTile settleTile = TileFactory.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);

        assertThat(settleTile.getName()).isEqualTo("Separatist Colony");
        assertThat(settleTile.getPoints()).isEqualTo(2);
        assertThat(settleTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }
}
