package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CupTest {
    Cup thisCup;
    Dice firstDice;
    Dice secondDice;

    @BeforeEach
    public void setup() {
        thisCup = new Cup();
        firstDice = mock(Dice.class);
        secondDice = mock(Dice.class);
    }

    @Test
    public void rollCupDice_RollEmptyCup_ShouldReturnAnEmptyArray() {
        Dice[] returnedDice = thisCup.rollDice();

        assertThat(returnedDice.length).isEqualTo(0);
    }

    @Test
    public void rollCupDice_AddDiceAndRoll_CupShouldBeEmpty() {
        when(firstDice.getColor()).thenReturn(DiceColor.Brown);
        when(secondDice.getColor()).thenReturn(DiceColor.Red);

        thisCup.addDice(firstDice);
        thisCup.addDice(secondDice);
        thisCup.rollDice();

        assertThat(thisCup.getContentsByDiceColor().length).isEqualTo(0);
    }

    @Test
    public void rollCupDice_AddDiceAndRoll_ShouldRollAllDiceInCupAndReturnThem() {
        when(firstDice.getColor()).thenReturn(DiceColor.Brown);
        when(secondDice.getColor()).thenReturn(DiceColor.Red);

        thisCup.addDice(firstDice);
        thisCup.addDice(secondDice);
        Dice[] returnedDice = thisCup.rollDice();

        verify(firstDice, times(1)).rollDice();
        verify(secondDice, times(1)).rollDice();
        assertThat(returnedDice).as("First dice is in returned list.").contains(firstDice);
        assertThat(returnedDice).as("Second dice is in returned list.").contains(secondDice);
    }
}
