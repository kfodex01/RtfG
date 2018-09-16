package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PhaseStripTest {
    private static final Random randomNumberGenerator = new Random();
    private static final DiceFace[] allDiceFaces = new DiceFace[]{
            DiceFace.Explore,
            DiceFace.Develop,
            DiceFace.Settle,
            DiceFace.Produce,
            DiceFace.Ship,
            DiceFace.Wild
    };
    private static final DiceColor[] allDiceColors = {
            DiceColor.White,
            DiceColor.Blue,
            DiceColor.Brown,
            DiceColor.Green,
            DiceColor.Purple,
            DiceColor.Red,
            DiceColor.Yellow
    };

    private PhaseStrip thisPhaseStrip;
    private Dice firstDice;
    private Dice secondDice;

    @BeforeEach
    public void setup() {
        thisPhaseStrip = new PhaseStrip();
        firstDice = mock(Dice.class);
        secondDice = mock(Dice.class);
    }

    @Test
    public void addDice_AddEmptyDiceArray_ShouldReturnFalse() {
        boolean diceWereAdded = thisPhaseStrip.addDice(new Dice[]{});

        assertThat(diceWereAdded).isEqualTo(false);
    }

    @Test
    public void addDice_AddSingleDice_ShouldReturnTrue() {
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Explore);

        boolean diceWereAdded = thisPhaseStrip.addDice(new Dice[]{firstDice});

        assertThat(diceWereAdded).isEqualTo(true);
    }

    @Test
    public void addDice_AddOneExploreDice_ShouldContainDiceOfCorrectColorInExplorePool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Explore);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Explore);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneDevelopDice_ShouldContainDiceOfCorrectColorInDevelopPool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Develop);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Develop);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneSettleDice_ShouldContainDiceOfCorrectColorInSettlePool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Settle);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Settle);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneProduceDice_ShouldContainDiceOfCorrectColorInProducePool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Produce);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Produce);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneShipDice_ShouldContainDiceOfCorrectColorInShipPool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Ship);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Ship);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneWildDice_ShouldContainDiceOfCorrectColorInUnassignedPool() {
        DiceColor thisDiceColor = getRandomDiceColor();
        when(firstDice.getCurrentFace()).thenReturn(DiceFace.Wild);
        when(firstDice.getColor()).thenReturn(thisDiceColor);

        thisPhaseStrip.addDice(new Dice[]{firstDice});
        DiceColor[] returnedColorArray = thisPhaseStrip.getDiceFromPool(DiceFace.Wild);

        assertThat(returnedColorArray.length).as("Returned array has one value").isEqualTo(1);
        assertThat(returnedColorArray[0]).as("Returned array contains dice of correct color").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddOneEmptyDice_ShouldNotContainADiceInAnyPool() {
        when(firstDice.getCurrentFace()).thenReturn(null);

        thisPhaseStrip.addDice(new Dice[]{firstDice});

        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Explore).length).as("Explore pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Develop).length).as("Develop pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Settle).length).as("Settle pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Produce).length).as("Produce pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Ship).length).as("Ship pool is empty").isEqualTo(0);
        assertThat(thisPhaseStrip.getDiceFromPool(DiceFace.Wild).length).as("Unassigned pool is empty").isEqualTo(0);
    }

    @Test
    public void addDice_AddTwoRandomDiceWithRandomFaces_ShouldContainDiceOfCorrectColorsInCorrectPools() {
        DiceColor firstDiceColor = getRandomDiceColor();
        DiceColor secondDiceColor = getRandomDiceColor();
        DiceFace firstDiceFace = getRandomDiceFace();
        DiceFace secondDiceFace = getRandomDiceFace();
        when(firstDice.getColor()).thenReturn(firstDiceColor);
        when(firstDice.getCurrentFace()).thenReturn(firstDiceFace);
        when(secondDice.getColor()).thenReturn(secondDiceColor);
        when(secondDice.getCurrentFace()).thenReturn(secondDiceFace);

        thisPhaseStrip.addDice(new Dice[]{firstDice, secondDice});

        assertThat(thisPhaseStrip.getDiceFromPool(firstDiceFace).length).as("First dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceFromPool(firstDiceFace)).as("First dice array contains the first die color").contains(firstDiceColor);
        assertThat(thisPhaseStrip.getDiceFromPool(secondDiceFace).length).as("Second dice array contains at least one die").isGreaterThan(0);
        assertThat(thisPhaseStrip.getDiceFromPool(secondDiceFace)).as("Second dice array contains the first die color").contains(secondDiceColor);
    }

    private DiceFace getRandomDiceFace() {
        return allDiceFaces[randomNumberGenerator.nextInt(allDiceFaces.length - 1)];
    }

    private DiceColor getRandomDiceColor() {
        return allDiceColors[randomNumberGenerator.nextInt(allDiceColors.length - 1)];
    }
}
