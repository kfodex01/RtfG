package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

public class DicePoolTest {

    private static final Random randomNumberGenerator = new Random();
    private static final DiceColor[] allDiceColors = {DiceColor.White, DiceColor.Blue, DiceColor.Brown, DiceColor.Green, DiceColor.Purple, DiceColor.Red, DiceColor.Yellow};

    @Test
    public void addDice_TestAddingOneDice_DicePoolShouldContainOneRandomDiceOfCorrectColor(){
        DiceColor thisDiceColor = allDiceColors[randomNumberGenerator.nextInt(allDiceColors.length - 1)];
        Dice thisDice = new Dice(thisDiceColor);
        DicePool thisDicePool = new DicePool();

        thisDicePool.add(thisDice);
        DiceColor[] dicePoolContents = thisDicePool.contains();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(1);
        assertThat(dicePoolContents[0]).as("Color 1st Dice in DicePool").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_TestAddingTwoDice_DicePoolShouldContainTwoRandomDiceOfCorrectColors(){
        DiceColor firstDiceColor = allDiceColors[randomNumberGenerator.nextInt(allDiceColors.length - 1)];
        DiceColor secondDiceColor = allDiceColors[randomNumberGenerator.nextInt(allDiceColors.length - 1)];
        Dice firstDice = new Dice(firstDiceColor);
        Dice secondDice = new Dice(secondDiceColor);
        DicePool thisDicePool = new DicePool();

        thisDicePool.add(firstDice);
        thisDicePool.add(secondDice);
        DiceColor[] dicePoolContents = thisDicePool.contains();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(2);
        assertThat(dicePoolContents[0]).as("Color 1st Dice in DicePool").isEqualTo(firstDiceColor);
        assertThat(dicePoolContents[1]).as("Color 2nd Dice in DicePool").isEqualTo(secondDiceColor);
    }

}
