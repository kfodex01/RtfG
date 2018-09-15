package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;

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
    public void addDice_TestAddingOneDice_DicePoolShouldContainOneRandomDiceOfCorrectColor(){
        DiceColor thisDiceColor = getRandomDiceColor();
        firstDice = new Dice(thisDiceColor);

        thisDicePool.addDice(firstDice);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(1);
        assertThat(dicePoolContents[0]).as("Color 1st Dice in DicePool").isEqualTo(thisDiceColor);
    }

    @Test
    public void addDice_TestAddingTwoDice_DicePoolShouldContainTwoRandomDiceOfCorrectColors(){
        DiceColor firstDiceColor = getRandomDiceColor();
        DiceColor secondDiceColor = getRandomDiceColor();
        firstDice = new Dice(firstDiceColor);
        secondDice = new Dice(secondDiceColor);
        int firstDiceIndex = 0;
        int secondDiceIndex = 1;

        thisDicePool.addDice(firstDice);
        thisDicePool.addDice(secondDice);
        DiceColor[] dicePoolContents = thisDicePool.getContentsByDiceColor();
        if (dicePoolContents[0] != firstDiceColor){
            firstDiceIndex = 1;
            secondDiceIndex = 0;
        }

        assertThat(dicePoolContents.length).as("Number of Dice in DicePool").isEqualTo(2);
        assertThat(dicePoolContents[firstDiceIndex]).as("Color 1st Dice in DicePool").isEqualTo(firstDiceColor);
        assertThat(dicePoolContents[secondDiceIndex]).as("Color 2nd Dice in DicePool").isEqualTo(secondDiceColor);
    }

    @Test
    public void getContentsByDiceColor_TestAddingThreeDice_DicePoolShouldReturnThreeDiceInSortedOrder(){
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
    public void removeDice_AddingADiceAndRemovingIt_TheDiceThatWasAddedShouldBeTheSameColorAsTheRemovedOneAndTheDicePoolShouldBeEmpty(){
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
