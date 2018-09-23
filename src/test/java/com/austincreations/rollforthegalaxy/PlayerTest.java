package com.austincreations.rollforthegalaxy;

import com.austincreations.rollforthegalaxy.tile.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private Player thisPlayer;

    @BeforeEach
    public void setup() {
        thisPlayer = new Player();
    }

    @Test
    public void runPreSetup_InitializePlayer_CreditsShouldEqualOne() {
        thisPlayer.runPreSetup();

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(1);
    }

    @Test
    public void runPreSetup_InitializePlayer_CupShouldHaveTwoWhiteDice() {
        thisPlayer.runPreSetup();
        DieColor[] cupContentsByDieColor = thisPlayer.getCupContentsByDieColor();

        assertThat(cupContentsByDieColor.length).isEqualTo(3);
        assertThat(cupContentsByDieColor[0]).isEqualTo(DieColor.WHITE);
        assertThat(cupContentsByDieColor[1]).isEqualTo(DieColor.WHITE);
        assertThat(cupContentsByDieColor[2]).isEqualTo(DieColor.WHITE);
    }

    @Test
    public void runPreSetup_InitializePlayer_CitizenryShouldHaveTwoWhiteDice() {
        thisPlayer.runPreSetup();
        DieColor[] citizenryContentsByDieColor = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryContentsByDieColor.length).isEqualTo(2);
        assertThat(citizenryContentsByDieColor[0]).isEqualTo(DieColor.WHITE);
        assertThat(citizenryContentsByDieColor[1]).isEqualTo(DieColor.WHITE);
    }

    @Test
    public void setupPlayer_GivenSpacePiracyAndAlphaCentauriAndAdvancedLogisticsAndSpiceWorldTiles_TilesInTableauAndStacksAreCorrect() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);

        Tile[] tableauTiles = thisPlayer.getTilesInTableau();
        Tile[] developTiles = thisPlayer.getTilesInDevelopQueue();
        Tile[] settleTiles = thisPlayer.getTilesInSettleQueue();

        assertThat(tableauTiles.length).isEqualTo(3);
        assertThat(tableauTiles[0].getName()).isEqualTo("Space Piracy");
        assertThat(tableauTiles[1].getName()).isEqualTo("Hidden Fortress");
        assertThat(tableauTiles[2].getName()).isEqualTo("Alpha Centauri");
        assertThat(developTiles.length).isEqualTo(1);
        assertThat(developTiles[0].getName()).isEqualTo("Advanced Logistics");
        assertThat(settleTiles.length).isEqualTo(1);
        assertThat(settleTiles[0].getName()).isEqualTo("Spice World");
    }

    @Test
    public void setupPlayer_SpacePiracy_PlayerStartsWithRedDieInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryColors.length).isEqualTo(3);
        assertThat(citizenryColors[0]).isEqualTo(DieColor.RED);
    }

    @Test
    public void setupPlayer_AlienArchaeology_PlayerStartsWithYellowDieInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryColors.length).isEqualTo(3);
        assertThat(citizenryColors[2]).isEqualTo(DieColor.YELLOW);
    }

    @Test
    public void setupPlayer_ConsumerMarkets_PlayerStartsWithBlueDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.CONSUMER_MARKETS_SPACE_MALL);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();

        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.BLUE);
    }

    @Test
    public void setupPlayer_ImprovedReconnaissance_PlayerStartsWithBrownDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.IMPROVED_RECONNAISSANCE_WORMHOLE_STATION);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();

        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.BROWN);
    }

    @Test
    public void setupPlayer_AlphaCentauri_PlayerStartsWithBrownDieOnTile() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        SettleTile thirdTableauTile = (SettleTile) thisPlayer.getTilesInTableau()[2];
        DieColor[] diceOnThirdTableauTile = thirdTableauTile.getDiceByDieColor();

        assertThat(diceOnThirdTableauTile.length).isEqualTo(1);
        assertThat(diceOnThirdTableauTile[0]).isEqualTo(DieColor.BROWN);
    }

    @Test
    public void setupPlayer_AncientRace_PlayerStartsWithGreenDieOnTile() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ANCIENT_RACE);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        SettleTile thirdTableauTile = (SettleTile) thisPlayer.getTilesInTableau()[2];
        DieColor[] diceOnThirdTableauTile = thirdTableauTile.getDiceByDieColor();

        assertThat(diceOnThirdTableauTile.length).isEqualTo(1);
        assertThat(diceOnThirdTableauTile[0]).isEqualTo(DieColor.GREEN);
    }

    @Test
    public void setupPlayer_DoomedWorld_PlayerStartsWithEightCredits() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(8);
    }

    @Test
    public void setupPlayer_NewSparta_PlayerHasTwoRedDiceInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.CONSUMER_MARKETS_SPACE_MALL);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.NEW_SPARTA);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryColors.length).isEqualTo(4);
        assertThat(citizenryColors[0]).isEqualTo(DieColor.RED);
        assertThat(citizenryColors[1]).isEqualTo(DieColor.RED);
    }

    @Test
    public void setupPlayer_SeparatistColony_PlayerHasARedDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);
        Tile[] developGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] settleGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setupPlayer(factionTile, homeWorldTile, (DevelopTile) developGameTile[0], (SettleTile) settleGameTile[1]);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();

        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.RED);
    }

    @Test
    public void addCredits_OneCredit_CreditTotalShouldBeTwo() {
        thisPlayer.addCredits(1);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(2);
    }

    @Test
    public void addCredits_TwoCredits_CreditTotalShouldBeThree() {
        thisPlayer.addCredits(2);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(3);
    }

    @Test
    public void addCredits_TenCredits_CreditTotalShouldBeTen() {
        thisPlayer.addCredits(10);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(10);
    }

    @Test
    public void addCredits_NegativeCredits_CreditTotalShouldBeOne() {
        thisPlayer.addCredits(-5);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(1);
    }

    @Test
    public void subtractCredits_OneCredit_CreditTotalShouldBeZero() {
        thisPlayer.subtractCredits(1);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(0);
    }

    @Test
    public void subtractCredits_AddTwoAndSubtractOneCredit_CreditTotalShouldBeTwo() {
        thisPlayer.addCredits(2);
        thisPlayer.subtractCredits(1);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(2);
    }

    @Test
    public void subtractCredits_TwoCredits_CreditTotalShouldBeZero() {
        thisPlayer.subtractCredits(2);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(0);
    }

    @Test
    public void subtractCredits_NegativeCredits_CreditTotalShouldBeOne() {
        thisPlayer.subtractCredits(-5);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(1);
    }
}
