package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PhaseStripTest {
    private static final Random randomNumberGenerator = new Random();
    private static final DieColor[] ALL_DIE_COLORS = {
            DieColor.WHITE,
            DieColor.BLUE,
            DieColor.BROWN,
            DieColor.GREEN,
            DieColor.PURPLE,
            DieColor.RED,
            DieColor.YELLOW
    };

    private PhaseStrip thisPhaseStrip;
    private Die firstDie;
    private Die secondDie;

    @BeforeEach
    public void setup() {
        thisPhaseStrip = new PhaseStrip();
    }

    @Test
    public void addDice_AddEmptyDiceArray_ShouldReturnFalse() {
        boolean diceWereAdded = thisPhaseStrip.addDice(new Die[]{});

        assertThat(diceWereAdded).isEqualTo(false);
    }

    @Test
    public void addDice_AddDie_ShouldReturnTrue() {
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.EXPLORE);

        boolean diceWereAdded = thisPhaseStrip.addDice(new Die[]{firstDie});

        assertThat(diceWereAdded).isEqualTo(true);
    }

    @Test
    public void addDice_AddExploreDie_ShouldContainDieOfCorrectColorInExplorePool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.EXPLORE);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddDevelopDie_ShouldContainDieOfCorrectColorInDevelopPool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.DEVELOP);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddSettleDie_ShouldContainDieOfCorrectColorInSettlePool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.SETTLE);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddProduceDie_ShouldContainDieOfCorrectColorInProducePool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.PRODUCE);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddShipDie_ShouldContainDieOfCorrectColorInShipPool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.SHIP);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddWildDie_ShouldContainDieOfCorrectColorInUnassignedPool() {
        DieColor thisDieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(DieFace.WILD);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddOneEmptyDie_ShouldNotContainADieInAnyPool() {
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(null);

        thisPhaseStrip.addDice(new Die[]{firstDie});

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("EXPLORE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("DEVELOP pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("SETTLE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("PRODUCE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("SHIP pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned pool is empty").isEqualTo(0);
    }

    @Test
    public void addDice_AddTwoRandomDiceFromCupRoll_ShouldContainDieOfCorrectColorsInCorrectPools() {
        DieColor firstDieColor = getRandomDiceColor();
        DieColor secondDieColor = getRandomDiceColor();
        firstDie = new Die(firstDieColor);
        secondDie = new Die(secondDieColor);

        Cup thisCup = new Cup();
        thisCup.addDie(firstDie);
        thisCup.addDie(secondDie);
        thisPhaseStrip.addDice(thisCup.rollDice());

        assertThat(thisPhaseStrip.getDiceByColorFromPool(firstDie.getCurrentFace()).length).as("First dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(firstDie.getCurrentFace())).as("First dice array contains the first die color").contains(firstDieColor);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(secondDie.getCurrentFace()).length).as("Second dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(secondDie.getCurrentFace())).as("Second dice array contains the first die color").contains(secondDieColor);
    }

    @Test
    public void assignDie_WildDieToExplore_PoolShouldContainOneDieOfCorrectColor() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Wild dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieToDevelop_PoolShouldContainOneDieOfCorrectColor() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Wild dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieToSettle_PoolShouldContainOneDieOfCorrectColor() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Wild dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieToProduce_PoolShouldContainOneDieOfCorrectColor() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Wild dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieToShip_PoolShouldContainOneDieOfCorrectColor() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Wild dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieToWild_DieRemainsInPool() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToExplore_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToDevelop_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToSettle_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToProduce_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToShip_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromExploreToWild_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE);
        thisPhaseStrip.assignDie(dieColor, DieFace.EXPLORE, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToExplore_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToDevelop_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToSettle_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToProduce_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToShip_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromDevelopToWild_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP);
        thisPhaseStrip.assignDie(dieColor, DieFace.DEVELOP, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToExplore_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToDevelop_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToSettle_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToProduce_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToShip_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromSettleToWild_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE);
        thisPhaseStrip.assignDie(dieColor, DieFace.SETTLE, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Settle dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToExplore_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToDevelop_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToSettle_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToProduce_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToShip_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromProduceToWild_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE);
        thisPhaseStrip.assignDie(dieColor, DieFace.PRODUCE, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToExplore_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.EXPLORE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE).length).as("Explore dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.EXPLORE)[0]).as("Explore pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToDevelop_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.DEVELOP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP).length).as("Develop dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.DEVELOP)[0]).as("Develop pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToSettle_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.SETTLE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE).length).as("Settle dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SETTLE)[0]).as("Settle pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToProduce_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.PRODUCE);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE).length).as("Produce dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.PRODUCE)[0]).as("Produce pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToShip_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.SHIP);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP)[0]).as("Ship pool die has the right color").isEqualTo(dieColor);
    }

    @Test
    public void assignDie_WildDieFromShipToWild_PoolsShouldHaveCorrectNumberAndCorrectColorOfDie() {
        DieColor dieColor = getRandomDiceColor();
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn((DieFace.WILD));
        when(firstDie.getColor()).thenReturn(dieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP);
        thisPhaseStrip.assignDie(dieColor, DieFace.SHIP, DieFace.WILD);

        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.SHIP).length).as("Ship dice pool has no dice").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD).length).as("Unassigned dice pool has one die").isEqualTo(1);
        assertThat(thisPhaseStrip.getDiceByColorFromPool(DieFace.WILD)[0]).as("Unassigned pool die has the right color").isEqualTo(dieColor);
    }

    private DieColor getRandomDiceColor() {
        return ALL_DIE_COLORS[randomNumberGenerator.nextInt(ALL_DIE_COLORS.length - 1)];
    }
}
