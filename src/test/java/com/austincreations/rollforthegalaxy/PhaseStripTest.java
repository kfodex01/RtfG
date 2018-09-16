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
            DieFace.Explore,
            DieFace.Develop,
            DieFace.Settle,
            DieFace.Produce,
            DieFace.Ship,
            DieFace.Wild
    };
    private static final DieColor[] ALL_DIE_COLORS = {
            DieColor.White,
            DieColor.Blue,
            DieColor.Brown,
            DieColor.Green,
            DieColor.Purple,
            DieColor.Red,
            DieColor.Yellow
    };

    private PhaseStrip thisPhaseStrip;
    private Die firstDie;
    private Die secondDie;

    @BeforeEach
    public void setup() {
        thisPhaseStrip = new PhaseStrip();
        firstDie = mock(Die.class);
    }

    @Test
    public void addDice_AddEmptyDiceArray_ShouldReturnFalse() {
        boolean diceWereAdded = thisPhaseStrip.addDice(new Die[]{});

        assertThat(diceWereAdded).isEqualTo(false);
    }

    @Test
    public void addDice_AddDie_ShouldReturnTrue() {
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Explore);

        boolean diceWereAdded = thisPhaseStrip.addDice(new Die[]{firstDie});

        assertThat(diceWereAdded).isEqualTo(true);
    }

    @Test
    public void addDice_AddExploreDie_ShouldContainDieOfCorrectColorInExplorePool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Explore);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Explore);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddDevelopDie_ShouldContainDieOfCorrectColorInDevelopPool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Develop);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Develop);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddSettleDie_ShouldContainDieOfCorrectColorInSettlePool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Settle);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Settle);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddProduceDie_ShouldContainDieOfCorrectColorInProducePool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Produce);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Produce);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddShipDie_ShouldContainDieOfCorrectColorInShipPool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Ship);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Ship);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddWildDie_ShouldContainDieOfCorrectColorInUnassignedPool() {
        DieColor thisDieColor = getRandomDiceColor();
        when(firstDie.getCurrentFace()).thenReturn(DieFace.Wild);
        when(firstDie.getColor()).thenReturn(thisDieColor);

        thisPhaseStrip.addDice(new Die[]{firstDie});
        DieColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DieFace.Wild);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDieColor);
    }

    @Test
    public void addDice_AddOneEmptyDie_ShouldNotContainADieInAnyPool() {
        when(firstDie.getCurrentFace()).thenReturn(null);

        thisPhaseStrip.addDice(new Die[]{firstDie});

        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Explore).length).as("Explore pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Develop).length).as("Develop pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Settle).length).as("Settle pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Produce).length).as("Produce pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Ship).length).as("Ship pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DieFace.Wild).length).as("Unassigned pool is empty").isEqualTo(0);
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
