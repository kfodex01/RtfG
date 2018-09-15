package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CupTest {
    @Test
    public void rollCupDice_AddDiceAndRoll_ShouldRollAllDiceInCupAndReturnThem() {
        Cup thisCup = new Cup();
        Dice firstDice = mock(Dice.class);
        Dice secondDice = mock(Dice.class);
        when(firstDice.getColor()).thenReturn(DiceColor.Brown);
        when(secondDice.getColor()).thenReturn(DiceColor.Red);

        thisCup.addDice(firstDice);
        thisCup.addDice(secondDice);
        Dice[] returnedDice = thisCup.rollDice();

        verify(firstDice, times(1)).rollDice();
        verify(secondDice, times(1)).rollDice();
        assertThat(returnedDice).contains(firstDice);
        assertThat(returnedDice).contains(secondDice);
    }
}
