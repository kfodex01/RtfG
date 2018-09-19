package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DevelopTileTest {
    DevelopTile firstTile;

    @Test
    public void getName_CreateAdvancedLogisticsTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getName()).isEqualTo("Advanced Logistics");
    }

    @Test
    public void getPoints_CreateAdvancedLogisticsTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void getName_CreateAlienResearchShipTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Alien Research Ship");
    }

    @Test
    public void getPoints_CreateAlienResearchShipTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getName_CreateColonialAffinityTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getName()).isEqualTo("Colonial Affinity");
    }

    @Test
    public void getPoints_CreateColonialAffinityTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getName_CreateDiversificationTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Diversification");
    }

    @Test
    public void getPoints_CreateDiversificationTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void getName_CreateExecutivePowerTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Executive Power");
    }

    @Test
    public void getPoints_CreateExecutivePowerTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getName_CreateExportDutiesTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Export Duties");
    }

    @Test
    public void getPoints_CreateExportDutiesTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getName_CreateFreeTradeAssociationTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getName()).isEqualTo("Free Trade Association");
    }

    @Test
    public void getPoints_CreateFreeTradeAssociationTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void getName_CreateGalacticBankersTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getName()).isEqualTo("Galactic Bankers");
    }

    @Test
    public void getPoints_CreateGalacticBankersTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void getName_CreateGalacticDemandTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getName()).isEqualTo("Galactic Demand");
    }

    @Test
    public void getPoints_CreateGalacticDemandTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getName_CreateGalacticInvestorsTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getName()).isEqualTo("Galactic Investors");
    }

    @Test
    public void getPoints_CreateGalacticInvestorsTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getName_CreateGalacticRecyclingTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getName()).isEqualTo("Galactic Recycling");
    }

    @Test
    public void getPoints_CreateGalacticRecyclingTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getName_CreateGalacticReservesTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getName()).isEqualTo("Galactic Reserves");
    }

    @Test
    public void getPoints_CreateGalacticReservesTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void getName_CreateHomeworldPatriotismTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Homeworld Patriotism");
    }

    @Test
    public void getPoints_CreateHomeworldPatriotismTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getName_CreateIsolationPolicyTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getName()).isEqualTo("Isolation Policy");
    }

    @Test
    public void getPoints_CreateIsolationPolicyTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getName_CreateReplicantRobotsTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.REPLICANT_ROBOTS_SPACE_PORT);

        assertThat(firstTile.getName()).isEqualTo("Replicant Robots");
    }

    @Test
    public void getPoints_CreateReplicantRobotsTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.REPLICANT_ROBOTS_SPACE_PORT);

        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getName_CreateSpaceDocksTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Space Docks");
    }

    @Test
    public void getPoints_CreateSpaceDocksTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getName_CreateTradeLeviesTile_ShouldEqualCorrectName() {
        firstTile = new DevelopTile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getName()).isEqualTo("Trade Levies");
    }

    @Test
    public void getPoints_CreateTradeLeviesTile_ShouldEqualCorrectPoints() {
        firstTile = new DevelopTile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }
}
