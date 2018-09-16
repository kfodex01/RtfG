package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class CupTest {
    Cup thisCup;
    Die firstDie;
    Die secondDie;

    @BeforeEach
    public void setup() {
        thisCup = new Cup();
        firstDie = mock(Die.class);
        secondDie = mock(Die.class);
    }

    @Test
    public void rollDice_RollEmptyCup_ShouldReturnAnEmptyArray() {
        Die[] returnedDie = thisCup.rollDice();

        assertThat(returnedDie.length).isEqualTo(0);
    }

    @Test
    public void rollDice_AddDiceAndRoll_CupShouldBeEmpty() {
        when(firstDie.getColor()).thenReturn(DieColor.Brown);
        when(secondDie.getColor()).thenReturn(DieColor.Red);

        thisCup.addDie(firstDie);
        thisCup.addDie(secondDie);
        thisCup.rollDice();

        assertThat(thisCup.getContentsByDieColor().length).isEqualTo(0);
    }

    @Test
    public void rollDice_AddDiceAndRoll_ShouldRollAllDiceInCupAndReturnThem() {
        when(firstDie.getColor()).thenReturn(DieColor.Brown);
        when(secondDie.getColor()).thenReturn(DieColor.Red);

        thisCup.addDie(firstDie);
        thisCup.addDie(secondDie);
        Die[] returnedDie = thisCup.rollDice();

        verify(firstDie, times(1)).rollDie();
        verify(secondDie, times(1)).rollDie();
        assertThat(returnedDie).as("First dice is in returned list.").contains(firstDie);
        assertThat(returnedDie).as("Second dice is in returned list.").contains(secondDie);
    }
}
