package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PhaseStripTest {
    private static final Random randomNumberGenerator = new Random();
    private static final DieFace[] ALL_DIE_FACES = new DieFace[]{
            DieFace.EXPLORE,
            DieFace.DEVELOP,
            DieFace.SETTLE,
            DieFace.PRODUCE,
            DieFace.SHIP,
            DieFace.WILD
    };
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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.EXPLORE);

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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.DEVELOP);

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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.SETTLE);

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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.PRODUCE);

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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.SHIP);

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
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.WILD);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddOneEmptyDie_ShouldNotContainADieInAnyPool() {
        firstDie = mock(Die.class);
        when(firstDie.getCurrentFace()).thenReturn(null);

        thisPhaseStrip.addDice(new Die[]{firstDie});

        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.EXPLORE).length).as("EXPLORE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.DEVELOP).length).as("DEVELOP pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.SETTLE).length).as("SETTLE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.PRODUCE).length).as("PRODUCE pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.SHIP).length).as("SHIP pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.WILD).length).as("Unassigned pool is empty").isEqualTo(0);
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

        assertThat(thisPhaseStrip.getDiceFromPool(firstDie.getCurrentFace()).length).as("First dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceFromPool(firstDie.getCurrentFace())).as("First dice array contains the first die color").contains(firstDieColor);
        assertThat(thisPhaseStrip.getDiceFromPool(secondDie.getCurrentFace()).length).as("Second dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceFromPool(secondDie.getCurrentFace())).as("Second dice array contains the first die color").contains(secondDieColor);
    }

    private DieColor getRandomDiceColor() {
        return ALL_DIE_COLORS[randomNumberGenerator.nextInt(ALL_DIE_COLORS.length - 1)];
    }
}
