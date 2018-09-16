package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class DicePoolTest {
    private static final Random randomNumberGenerator = new Random();
    private static final DieColor[] ALL_DIE_COLORS = {
            DieColor.White,
            DieColor.Blue,
            DieColor.Brown,
            DieColor.Green,
            DieColor.Purple,
            DieColor.Red,
            DieColor.Yellow
    };

    private DicePool thisDicePool;
    private Die firstDie;
    private Die secondDie;
    private Die thirdDie;

    @BeforeEach
    public void setup(){
        thisDicePool = new DicePool();
    }

    @Test
    public void addDie_AddEmptyDice_ShouldReturnFalse() {
        Die emptyDie = new Die();

        boolean diceWasAdded = thisDicePool.addDie(emptyDie);

        assertThat(diceWasAdded).isEqualTo(false);
    }

    @Test
    public void addDie_AddOneDie_ShouldContainOneRandomDieOfCorrectColor() {
        DieColor thisDieColor = getRandomDieColor();
        firstDie = new Die(thisDieColor);

        thisDicePool.addDie(firstDie);
        DieColor[] dicePoolContents = thisDicePool.getContentsByDieColor();

        assertThat(dicePoolContents.length).as("Number of Die in DicePool").isEqualTo(1);
        assertThat(dicePoolContents[0]).as("Color 1st Die in DicePool").isEqualTo(thisDieColor);
    }

    @Test
    public void addDie_AddTwoDice_ShouldContainTwoRandomDiceOfCorrectColors() {
        DieColor firstDieColor = getRandomDieColor();
        DieColor secondDieColor = getRandomDieColor();
        firstDie = new Die(firstDieColor);
        secondDie = new Die(secondDieColor);

        thisDicePool.addDie(firstDie);
        thisDicePool.addDie(secondDie);
        DieColor[] dicePoolContents = thisDicePool.getContentsByDieColor();

        assertThat(dicePoolContents.length).as("Number of Die in DicePool").isEqualTo(2);
        assertThat(dicePoolContents).as("Color 1st Die in DicePool").contains(firstDieColor);
        assertThat(dicePoolContents).as("Color 2nd Die in DicePool").contains(secondDieColor);
    }

    @Test
    public void getContentsByDieColor_AddThreeDice_ShouldReturnThreeDiceInSortedOrder() {
        firstDie = new Die(DieColor.Brown);
        secondDie = new Die(DieColor.Red);
        thirdDie = new Die(DieColor.Brown);

        thisDicePool.addDie(firstDie);
        thisDicePool.addDie(secondDie);
        thisDicePool.addDie(thirdDie);
        DieColor[] dicePoolContents = thisDicePool.getContentsByDieColor();

        assertThat(dicePoolContents.length).as("Number of Die in DicePool").isEqualTo(3);
        assertThat(dicePoolContents[0]).as("First color should be red").isEqualTo(DieColor.Red);
        assertThat(dicePoolContents[1]).as("Second color should be brown").isEqualTo(DieColor.Brown);
        assertThat(dicePoolContents[2]).as("Third color should be brown").isEqualTo(DieColor.Brown);
    }

    @Test
    public void removeDie_AddADieAndRemoveIt_DieAddedShouldBeTheSameColorAsTheRemovedOneAndTheDicePoolShouldBeEmpty() {
        DieColor thisDieColor = getRandomDieColor();
        firstDie = new Die(thisDieColor);

        thisDicePool.addDie(firstDie);
        Die removedDie = thisDicePool.removeDie(thisDieColor);
        DieColor[] dicePoolContents = thisDicePool.getContentsByDieColor();

        assertThat(dicePoolContents.length).as("Number of Die in DicePool").isEqualTo(0);
        assertThat(removedDie.getColor()).as("Removed dice color should equal added color").isEqualTo(thisDieColor);
    }

    @Test
    public void removeDie_RemoveDieThatIsNotInPool_ShouldReturnADieWithNullValues() {
        DieColor thisDieColor = getRandomDieColor();

        Die removedDie = thisDicePool.removeDie(thisDieColor);

        assertThat(removedDie.getColor()).isEqualTo(null);
    }

    private DieColor getRandomDieColor() {
        return ALL_DIE_COLORS[randomNumberGenerator.nextInt(ALL_DIE_COLORS.length - 1)];
    }
}
