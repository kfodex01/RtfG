package com.austincreations.rollforthegalaxy.player;

import com.austincreations.rollforthegalaxy.DieColor;
import com.austincreations.rollforthegalaxy.DieFace;
import com.austincreations.rollforthegalaxy.PhaseStrip;
import com.austincreations.rollforthegalaxy.tile.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private Player thisPlayer;

    @BeforeEach
    public void setup() {
        thisPlayer = new Player(false);
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
    public void setStartingTableau_SpacePiracyAndAlphaCentauri_TilesInTableauAreCorrect() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        Tile[] tableauTiles = thisPlayer.getTilesInTableau();

        assertThat(tableauTiles.length).isEqualTo(3);
        assertThat(tableauTiles[0].getName()).isEqualTo("Space Piracy");
        assertThat(tableauTiles[1].getName()).isEqualTo("Hidden Fortress");
        assertThat(tableauTiles[2].getName()).isEqualTo("Alpha Centauri");
    }

    @Test
    public void setStartingTableau_SpacePiracy_PlayerStartsWithRedDieInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();
        ArrayList<DevelopTileEffect> developTileEffects = thisPlayer.getDevelopPowers();

        assertThat(citizenryColors.length).isEqualTo(3);
        assertThat(citizenryColors[0]).isEqualTo(DieColor.RED);
        assertThat(developTileEffects.contains(DevelopTileEffect.SHIP_ONE_CREDIT_FOR_EVERY_TWO_RED_DICE_IN_CITIZENRY_AT_END_OF_PHASE)).isEqualTo(true);
    }

    @Test
    public void setStartingTableau_AlienArchaeology_PlayerStartsWithYellowDieInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.ALIEN_ARCHAEOLOGY_ALIEN_ROSETTA_STONE_WORLD);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();
        ArrayList<DevelopTileEffect> developTileEffects = thisPlayer.getDevelopPowers();


        assertThat(citizenryColors.length).isEqualTo(3);
        assertThat(citizenryColors[2]).isEqualTo(DieColor.YELLOW);
        assertThat(developTileEffects.contains(DevelopTileEffect.EXPLORE_FOUR_CREDITS_WHEN_STOCKING_WITH_A_YELLOW_DIE)).isEqualTo(true);
    }

    @Test
    public void setStartingTableau_ConsumerMarkets_PlayerStartsWithBlueDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.CONSUMER_MARKETS_SPACE_MALL);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();
        ArrayList<DevelopTileEffect> developTileEffects = thisPlayer.getDevelopPowers();


        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.BLUE);
        assertThat(developTileEffects.contains(DevelopTileEffect.PRODUCE_ONE_CREDIT_FOR_EACH_BLUE_DIE_ON_A_WORLD_AT_END_OF_PHASE)).isEqualTo(true);
    }

    @Test
    public void setStartingTableau_ImprovedReconnaissance_PlayerStartsWithBrownDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.IMPROVED_RECONNAISSANCE_WORMHOLE_STATION);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();
        ArrayList<DevelopTileEffect> developTileEffects = thisPlayer.getDevelopPowers();


        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.BROWN);
        assertThat(developTileEffects.contains(DevelopTileEffect.EXPLORE_MAY_PLACE_TILES_ON_TOP_OF_STACKS)).isEqualTo(true);
    }

    @Test
    public void setStartingTableau_GeneticsLab_PlayerStartsWithGreenDieInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.GENETICS_LAB_THE_LAST_OF_THE_GNARSSH);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();
        ArrayList<DevelopTileEffect> developTileEffects = thisPlayer.getDevelopPowers();


        assertThat(citizenryColors.length).isEqualTo(3);
        assertThat(citizenryColors[0]).isEqualTo(DieColor.GREEN);
        assertThat(developTileEffects.contains(DevelopTileEffect.PRODUCE_TWO_CREDITS_FOR_EACH_GREEN_DIE_USED_IN_PHASE_AT_END_OF_PHASE)).isEqualTo(true);
    }

    @Test
    public void setStartingTableau_AlphaCentauri_PlayerStartsWithBrownDieOnTile() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ALPHA_CENTAURI);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        SettleTile thirdTableauTile = (SettleTile) thisPlayer.getTilesInTableau()[2];
        DieColor[] diceOnThirdTableauTile = thirdTableauTile.getDiceByDieColor();

        assertThat(diceOnThirdTableauTile.length).isEqualTo(1);
        assertThat(diceOnThirdTableauTile[0]).isEqualTo(DieColor.BROWN);
    }

    @Test
    public void setStartingTableau_AncientRace_PlayerStartsWithGreenDieOnTile() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.ANCIENT_RACE);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        SettleTile thirdTableauTile = (SettleTile) thisPlayer.getTilesInTableau()[2];
        DieColor[] diceOnThirdTableauTile = thirdTableauTile.getDiceByDieColor();

        assertThat(diceOnThirdTableauTile.length).isEqualTo(1);
        assertThat(diceOnThirdTableauTile[0]).isEqualTo(DieColor.GREEN);
    }

    @Test
    public void setStartingTableau_DoomedWorld_PlayerStartsWithEightCredits() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.DOOMED_WORLD);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);

        assertThat(thisPlayer.getCreditAmount()).isEqualTo(8);
    }

    @Test
    public void setStartingTableau_NewSparta_PlayerHasTwoRedDiceInCitizenry() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.CONSUMER_MARKETS_SPACE_MALL);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.NEW_SPARTA);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] citizenryColors = thisPlayer.getCitizenryContentsByDieColor();

        assertThat(citizenryColors.length).isEqualTo(4);
        assertThat(citizenryColors[0]).isEqualTo(DieColor.RED);
        assertThat(citizenryColors[1]).isEqualTo(DieColor.RED);
    }

    @Test
    public void setStartingTableau_SeparatistColony_PlayerHasARedDieInCup() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        DieColor[] cupColors = thisPlayer.getCupContentsByDieColor();

        assertThat(cupColors.length).isEqualTo(4);
        assertThat(cupColors[0]).isEqualTo(DieColor.RED);
    }

    @Test
    public void askPlayerToChooseInitialGameTiles_CpuPlayerAdvancedLogisticsAndSpiceWorldTiles_TilesReturnedContainPossibleCombinations() {
        Tile[] firstGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] secondGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        Tile[] result = thisPlayer.askPlayerToChooseInitialGameTiles(firstGameTile, secondGameTile);

        assertThat(result.length).isEqualTo(2);
        assertThat(result[0].getName()).isIn("Advanced Logistics", "Alien Research Ship");
        assertThat(result[1].getName()).isIn("Designer Species, Ultd.", "Spice World");
        if (result[0].getName() == "Advanced Logistics") {
            assertThat(result[1]).isNotEqualTo("Designer Species, Ultd.");
        } else {
            assertThat(result[1]).isNotEqualTo("Spice World");
        }
    }

    @Test
    public void askPlayerToChooseInitialGameTiles_CpuPlayerGivenAlienUpliftBlueprintsAndExportDuties_PicksTileCombinationWithLowerSum() {
        Tile[] firstGameTile = TileFactory.getGameTiles(GameTile.ALIEN_UPLIFT_BLUEPRINTS_INFORMATION_HUB);
        Tile[] secondGameTile = TileFactory.getGameTiles(GameTile.EXPORT_DUTIES_SILICON_WORLD);

        Tile[] result = thisPlayer.askPlayerToChooseInitialGameTiles(firstGameTile, secondGameTile);

        assertThat(result.length).isEqualTo(2);
        assertThat(result[0].getName()).isEqualTo("Export Duties");
        assertThat(result[1].getName()).isEqualTo("Information Hub");
    }

    @Test
    public void setStartingQueues_AdvancedLogisticsAndSpiceWorldTiles_TilesInQueuesAreCorrect() {
        Tile[] firstGameTile = TileFactory.getGameTiles(GameTile.ADVANCED_LOGISTICS_DESIGNER_SPECIES_ULTD);
        Tile[] secondGameTile = TileFactory.getGameTiles(GameTile.ALIEN_RESEARCH_SHIP_SPICE_WORLD);

        thisPlayer.setStartingQueues((DevelopTile) firstGameTile[0], (SettleTile) secondGameTile[1]);
        Tile[] developTiles = thisPlayer.getTilesInDevelopQueue();
        Tile[] settleTiles = thisPlayer.getTilesInSettleQueue();

        assertThat(developTiles.length).isEqualTo(1);
        assertThat(developTiles[0].getName()).isIn("Advanced Logistics", "Alien Research Ship");
        assertThat(settleTiles.length).isEqualTo(1);
        assertThat(settleTiles[0].getName()).isIn("Designer Species, Ultd.", "Spice World");
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

    @Test
    public void getPhaseStrip_SpacePiracy_PhaseStripHasCorrectNumberOfDiceWithCorrectColors() {
        Tile[] factionTile = TileFactory.getFactionTiles(FactionTile.SPACE_PIRACY_HIDDEN_FORTRESS);
        Tile homeWorldTile = TileFactory.getHomeWorldTiles(HomeWorldTile.SEPARATIST_COLONY);
        ArrayList<DieColor> allDice = new ArrayList<>();
        int numberOfWhiteDice = 0;
        int numberOfRedDice = 0;

        thisPlayer.runPreSetup();
        thisPlayer.setStartingTableau(factionTile, homeWorldTile);
        thisPlayer.rollCupDice();
        PhaseStrip thisPhaseStrip = thisPlayer.getPhaseStrip();
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)));
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)));
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)));
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)));
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)));
        allDice.addAll(Arrays.asList(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)));
        for (DieColor thisColor : allDice) {
            switch (thisColor) {
                case WHITE:
                    numberOfWhiteDice++;
                    break;
                case RED:
                    numberOfRedDice++;
                    break;
                default:
                    break;
            }
        }

        assertThat(allDice.size()).isEqualTo(4);
        assertThat(numberOfWhiteDice).isEqualTo(3);
        assertThat(numberOfRedDice).isEqualTo(1);
    }
}
