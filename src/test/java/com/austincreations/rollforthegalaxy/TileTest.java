package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TileTest {
    Tile firstTile;

    @Test
    public void getName_CreateAdvancedLogisticsTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getName()).isEqualTo("Advanced Logistics");
    }

    @Test
    public void getPoints_CreateAdvancedLogisticsTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void flipTile_CreateAdvancedLogisticsTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Designer Species, Ultd.");
        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getSettleColor_CreateAdvancedLogisticsTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateAlienResearchShipTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Alien Research Ship");
    }

    @Test
    public void getPoints_CreateAlienResearchShipTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void flipTile_CreateAlienResearchShipTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Spice World");
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateAlienResearchShipTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateColonialAffinityTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getName()).isEqualTo("Colonial Affinity");
    }

    @Test
    public void getPoints_CreateColonialAffinityTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void flipTile_CreateColonialAffinityTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Malevolent Lifeforms");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateColonialAffinityTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.COLONIAL_AFFINITY_MALEVOLENT_LIFEFORMS);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateDiversificationTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Diversification");
    }

    @Test
    public void getPoints_CreateDiversificationTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void flipTile_CreateDiversificationTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Lost Species Ark World");
        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void getSettleColor_CreateDiversificationTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.DIVERSIFICATION_LOST_SPECIES_ARK_WORLD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateExecutivePowerTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Executive Power");
    }

    @Test
    public void getPoints_CreateExecutivePowerTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateExecutivePowerTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Trading World");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateExecutivePowerTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.EXECUTIVE_POWER_TRADING_WORLD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateFreeTradeAssociationTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getName()).isEqualTo("Free Trade Association");
    }

    @Test
    public void getPoints_CreateFreeTradeAssociationTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void flipTile_CreateFreeTradeAssociationTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Sentient Robots");
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateFreeTradeAssociationTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.FREE_TRADE_ASSOCIATION_SENTIENT_ROBOTS);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateGalacticBankersTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getName()).isEqualTo("Galactic Bankers");
    }

    @Test
    public void getPoints_CreateGalacticBankersTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void flipTile_CreateGalacticBankersTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Former Penal Colony");
        assertThat(firstTile.getPoints()).isEqualTo(1);
    }

    @Test
    public void getSettleColor_CreateGalacticBankersTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.GALACTIC_BANKERS_FORMER_PENAL_COLONY);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateGalacticDemandTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getName()).isEqualTo("Galactic Demand");
    }

    @Test
    public void getPoints_CreateGalacticDemandTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void flipTile_CreateGalacticDemandTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Deserted Alien Outpost");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateGalacticDemandTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.GALACTIC_DEMAND_DESERTED_ALIEN_OUTPOST);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getName_CreateGalacticInvestorsTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getName()).isEqualTo("Galactic Investors");
    }

    @Test
    public void getPoints_CreateGalacticInvestorsTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getPoints()).isEqualTo(5);
    }

    @Test
    public void flipTile_CreateGalacticInvestorsTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("New Vinland");
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateGalacticInvestorsTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.GALACTIC_INVESTORS_NEW_VINLAND);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BLUE);
    }

    @Test
    public void getName_CreateGalacticRecyclingTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getName()).isEqualTo("Galactic Recycling");
    }

    @Test
    public void getPoints_CreateGalacticRecyclingTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void flipTile_CreateGalacticRecyclingTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Alien Robot Scout SHIP");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateGalacticRecyclingTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.GALACTIC_RECYCLING_ALIEN_ROBOT_SCOUT_SHIP);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.YELLOW);
    }

    @Test
    public void getName_CreateGalacticReservesTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getName()).isEqualTo("Galactic Reserves");
    }

    @Test
    public void getPoints_CreateGalacticReservesTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getPoints()).isEqualTo(6);
    }

    @Test
    public void flipTile_CreateGalacticReservesTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Rebel Hideout");
        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void getSettleColor_CreateGalacticReservesTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.GALACTIC_RESERVES_REBEL_HIDEOUT);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GRAY);
    }

    @Test
    public void getName_CreateHomeworldPatriotismTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Homeworld Patriotism");
    }

    @Test
    public void getPoints_CreateHomeworldPatriotismTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateHomeworldPatriotismTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Plague World");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateHomeworldPatriotismTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.HOMEWORLD_PATRIOTISM_PLAGUE_WORLD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.GREEN);
    }

    @Test
    public void getName_CreateIsolationPolicyTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getName()).isEqualTo("Isolation Policy");
    }

    @Test
    public void getPoints_CreateIsolationPolicyTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateIsolationPolicyTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Planetary Nebula");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateIsolationPolicyTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.ISOLATION_POLICY_PLANETARY_NEBULA);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getName_CreateSpaceDocksTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getName()).isEqualTo("Space Docks");
    }

    @Test
    public void getPoints_CreateSpaceDocksTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getPoints()).isEqualTo(2);
    }

    @Test
    public void flipTile_CreateSpaceDocksTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Armaments World");
        assertThat(firstTile.getPoints()).isEqualTo(4);
    }

    @Test
    public void getSettleColor_CreateSpaceDocksTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.SPACE_DOCKS_ARMAMENTS_WORLD);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BROWN);
    }

    @Test
    public void getName_CreateTradeLeviesTile_ShouldEqualCorrectName() {
        firstTile = new Tile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getName()).isEqualTo("Trade Levies");
    }

    @Test
    public void getPoints_CreateTradeLeviesTile_ShouldEqualCorrectPoints() {
        firstTile = new Tile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void flipTile_CreateTradeLeviesTileAndFlip_ShouldEqualCorrectNameAndPoints() {
        firstTile = new Tile(GameTile.TRADE_LEVIES_COMET_ZONE);

        firstTile.flipTile();

        assertThat(firstTile.getName()).isEqualTo("Comet Zone");
        assertThat(firstTile.getPoints()).isEqualTo(3);
    }

    @Test
    public void getSettleColor_CreateTradeLeviesTile_ShouldEqualCorrectPlanetColor() {
        firstTile = new Tile(GameTile.TRADE_LEVIES_COMET_ZONE);

        assertThat(firstTile.getSettleColor()).isEqualTo(PlanetColor.BROWN);
    }
}
