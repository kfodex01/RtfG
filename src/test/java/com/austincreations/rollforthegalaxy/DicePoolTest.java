package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class DicePoolTest {
    private static final Random randomNumberGenerator = new Random();
    private static final DiceColor[] allDiceColors = {DiceColor.White, DiceColor.Blue, DiceColor.Brown, DiceColor.Green, DiceColor.Purple, DiceColor.Red, DiceColor.Yellow};
    private DicePool thisDicePool;
    private Dice firstDice;
    private Dice secondDice;
    private Dice thirdDice;

    @BeforeEach
    public void setup(){
        thisDicePool = new DicePool();
    }

    @Test
    public void addDice_AddEmptyDice_ShouldReturnFalse() {
        Dice emptyDice = new Dice();

        boolean diceWasAdded = thisDicePool.addDice(emptyDice);

        assertThat(diceWasAdded).isEqualTo(false);
    }

    @Test
    public void addDice_AddOneDice_ShouldContainOneRandomDiceOfCorrectColor() {
        DiceColor thisDiceColor = getRandomDiceColor();
        firstDice = new Dice(thisDiceColor);

        thisDicePool.addDice(firstDice);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(1);
        assertThat(dicePoolContents[0]).as("Color 1st Dice in DicePool").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_AddTwoDice_ShouldContainTwoRandomDiceOfCorrectColors() {
        DiceColor firstDiceColor = getRandomDiceColor();
        DiceColor secondDiceColor = getRandomDiceColor();
        firstDice = new Dice(firstDiceColor);
        secondDice = new Dice(secondDiceColor);

        thisDicePool.addDice(firstDice);
        thisDicePool.addDice(secondDice);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(2);
        assertThat(dicePoolContents).as("Color 1st Dice in DicePool").contains(firstDiceColor);
        assertThat(dicePoolContents).as("Color 2nd Dice in DicePool").contains(secondDiceColor);
    }

    @Test
    public void getContentsByDiceColor_AddThreeDice_ShouldReturnThreeDiceInSortedOrder() {
        firstDice = new Dice(DiceColor.Brown);
        secondDice = new Dice(DiceColor.Red);
        thirdDice = new Dice(DiceColor.Brown);

        thisDicePool.addDice(firstDice);
        thisDicePool.addDice(secondDice);
        thisDicePool.addDice(thirdDice);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(3);
        assertThat(dicePoolContents[0]).as("First color should be red").isEqualTo(DiceColor.Red);
        assertThat(dicePoolContents[1]).as("Second color should be brown").isEqualTo(DiceColor.Brown);
        assertThat(dicePoolContents[2]).as("Third color should be brown").isEqualTo(DiceColor.Brown);
    }

    @Test
    public void removeDice_AddADiceAndRemoveIt_DiceAddedShouldBeTheSameColorAsTheRemovedOneAndTheDicePoolShouldBeEmpty() {
        DiceColor thisDiceColor = getRandomDiceColor();
        firstDice = new Dice(thisDiceColor);

        thisDicePool.addDice(firstDice);
        Dice removedDice = thisDicePool.removeDice(thisDiceColor);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(0);
        assertThat(removedDice.getColor()).as("Removed dice color should equal added color").isEqualTo(thisDiceColor);
    }

    @Test
    public void removeDice_RemoveDiceThatIsNotInPool_ShouldReturnADiceWithNullValues(){
        DiceColor thisDiceColor = getRandomDiceColor();

        Dice removedDice = thisDicePool.removeDice(thisDiceColor);

        assertThat(removedDice.getColor()).isEqualTo(null);
    }

    private DiceColor getRandomDiceColor() {
        return allDiceColors[randomNumberGenerator.nextInt(allDiceColors.length - 1)];
    }
}
