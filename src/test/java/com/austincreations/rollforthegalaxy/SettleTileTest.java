package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SettleTileTest {
    SettleTile firstTile;

    @Test
    public void getName_CreateAdvancedLogisticsTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getName()).isEqualTo("Designer Species, Ultd.");
    }

    @Test
    public void getPoints_CreateAdvancedLogisticsTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getSettleColor_CreateAdvancedLogisticsTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateAlienResearchShipTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Spice World");
    }

    @Test
    public void getPoints_CreateAlienResearchShipTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateAlienResearchShipTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateColonialAffinityTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getName()).isEqualTo("Malevolent Lifeforms");
    }

    @Test
    public void getPoints_CreateColonialAffinityTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateColonialAffinityTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateDiversificationTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Lost Species Ark World");
    }

    @Test
    public void getPoints_CreateDiversificationTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getSettleColor_CreateDiversificationTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateExecutivePowerTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Trading World");
    }

    @Test
    public void getPoints_CreateExecutivePowerTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateExecutivePowerTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateExportDutiesTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Silicon World");
    }

    @Test
    public void getPoints_CreateExportDutiesTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateExportDutiesTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getName_CreateFreeTradeAssociationTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getName()).isEqualTo("Sentient Robots");
    }

    @Test
    public void getPoints_CreateFreeTradeAssociationTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateFreeTradeAssociationTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateGalacticBankersTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getName()).isEqualTo("Former Penal Colony");
    }

    @Test
    public void getPoints_CreateGalacticBankersTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void getSettleColor_CreateGalacticBankersTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateGalacticDemandTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getName()).isEqualTo("Deserted Alien Outpost");
    }

    @Test
    public void getPoints_CreateGalacticDemandTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateGalacticDemandTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getName_CreateGalacticInvestorsTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getName()).isEqualTo("New Vinland");
    }

    @Test
    public void getPoints_CreateGalacticInvestorsTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateGalacticInvestorsTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateGalacticRecyclingTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getName()).isEqualTo("Alien Robot Scout SHIP");
    }

    @Test
    public void getPoints_CreateGalacticRecyclingTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateGalacticRecyclingTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getName_CreateGalacticReservesTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getName()).isEqualTo("Rebel Hideout");
    }

    @Test
    public void getPoints_CreateGalacticReservesTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateGalacticReservesTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateHomeworldPatriotismTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Plague World");
    }

    @Test
    public void getPoints_CreateHomeworldPatriotismTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateHomeworldPatriotismTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateIsolationPolicyTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getName()).isEqualTo("Planetary Nebula");
    }

    @Test
    public void getPoints_CreateIsolationPolicyTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateIsolationPolicyTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getName_CreateReplicantRobotsTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.REPLICANT_ROBOTS_SPACE_PORT);

        assertThat(firstTile.getName()).isEqualTo("Space Port");
    }

    @Test
    public void getPoints_CreateReplicantRobotsTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.REPLICANT_ROBOTS_SPACE_PORT);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateReplicantRobotsTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.REPLICANT_ROBOTS_SPACE_PORT);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateSpaceDocksTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Armaments World");
    }

    @Test
    public void getPoints_CreateSpaceDocksTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateSpaceDocksTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getName_CreateTradeLeviesTile_ShouldEqualCorrectName() {
        firstTile = new SettleTile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getName()).isEqualTo("Comet Zone");
    }

    @Test
    public void getPoints_CreateTradeLeviesTile_ShouldEqualCorrectPoints() {
        firstTile = new SettleTile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateTradeLeviesTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new SettleTile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getPlanetColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getFactionTiles_CreateHiddenFortressTile_ShouldEqualCorrectNamePointsAndColor() {
        SettleTile[] factionArray = SettleTile.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);

        assertThat(factionArray.length).isEqualTo(1);
        assertThat(factionArray[0].getName()).isEqualTo("Hidden Fortress");
        assertThat(factionArray[0].getPoints()).isEqualTo(2);
        assertThat(factionArray[0].getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getFactionTiles_CreateAlienRosettaStoneWorldTile_ShouldEqualCorrectNamePointsAndColor() {
        SettleTile[] factionArray = SettleTile.getFactionTiles(FactionTile.ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD);

        assertThat(factionArray.length).isEqualTo(1);
        assertThat(factionArray[0].getName()).isEqualTo("Alien Rosetta Stone World");
        assertThat(factionArray[0].getPoints()).isEqualTo(1);
        assertThat(factionArray[0].getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getHomeWorldTiles_CreateDoomedWorldTile_ShouldEqualCorrectName() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);

        assertThat(homeWorldTile.getName()).isEqualTo("Doomed World");
    }

    @Test
    public void getHomeWorldTiles_CreateDoomedWorldTile_ShouldEqualCorrectPoints() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);

        assertThat(homeWorldTile.getPoints()).isEqualTo(0);
    }

    @Test
    public void getHomeWorldTiles_CreateDoomedWorldTile_ShouldEqualCorrectPlanetColor() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);

        assertThat(homeWorldTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getHomeWorldTiles_CreateSeparatistColonyTile_ShouldEqualCorrectName() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);

        assertThat(homeWorldTile.getName()).isEqualTo("Separatist Colony");
    }

    @Test
    public void getHomeWorldTiles_CreateSeparatistColonyTile_ShouldEqualCorrectPoints() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);

        assertThat(homeWorldTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getHomeWorldTiles_CreateSeparatistColonyTile_ShouldEqualCorrectPlanetColor() {
        SettleTile homeWorldTile = SettleTile.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);

        assertThat(homeWorldTile.getPlanetColor()).isEqualTo(PlanetColor.GRAY);
    }
}
