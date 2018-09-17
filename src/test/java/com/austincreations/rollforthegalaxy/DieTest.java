package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class DieTest {

    @Test
    public void getColor_TestBlueDiceColor(){
        Die thisDie = new Die(DieColor.BLUE);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.BLUE);
    }

    @Test
    public void getColor_TestWhiteDiceColor(){
        Die thisDie = new Die(DieColor.WHITE);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.WHITE);
    }

    @Test
    public void getColor_TestRedDiceColor(){
        Die thisDie = new Die(DieColor.RED);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.RED);
    }

    @Test
    public void getColor_TestPurpleDiceColor(){
        Die thisDie = new Die(DieColor.PURPLE);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.PURPLE);
    }

    @Test
    public void getColor_TestBrownDiceColor(){
        Die thisDie = new Die(DieColor.BROWN);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.BROWN);
    }

    @Test
    public void getColor_TestGreenDiceColor(){
        Die thisDie = new Die(DieColor.GREEN);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.GREEN);
    }

    @Test
    public void getColor_TestYellowDiceColor(){
        Die thisDie = new Die(DieColor.YELLOW);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.YELLOW);
    }

    @Test
    public void getDieFaces_CheckWhiteFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.WHITE)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.EXPLORE, DieFace.DEVELOP, DieFace.SETTLE, DieFace.PRODUCE, DieFace.SHIP));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat((numberOfFaces)).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckRedFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.RED)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.DEVELOP, DieFace.DEVELOP, DieFace.SETTLE, DieFace.SETTLE, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckPurpleFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.PURPLE)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.DEVELOP, DieFace.SHIP, DieFace.SHIP, DieFace.SHIP, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckBlueFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.BLUE)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.PRODUCE, DieFace.PRODUCE, DieFace.SHIP, DieFace.SHIP, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckBrownFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.BROWN)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.DEVELOP, DieFace.DEVELOP, DieFace.PRODUCE, DieFace.SHIP, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckGreenFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.GREEN)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.EXPLORE, DieFace.SETTLE, DieFace.SETTLE, DieFace.PRODUCE, DieFace.WILD, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckYellowFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.YELLOW)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.DEVELOP, DieFace.SETTLE, DieFace.PRODUCE, DieFace.WILD, DieFace.WILD, DieFace.WILD));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void rollDie_TestWhiteRoll() {
        DieColor thisColor = DieColor.WHITE;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestRedRoll() {
        DieColor thisColor = DieColor.RED;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestPurpleRoll() {
        DieColor thisColor = DieColor.PURPLE;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestBlueRoll() {
        DieColor thisColor = DieColor.BLUE;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestBrownRoll() {
        DieColor thisColor = DieColor.BROWN;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestGreenRoll() {
        DieColor thisColor = DieColor.GREEN;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestYellowRoll() {
        DieColor thisColor = DieColor.YELLOW;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    private ArrayList<DieFace> rollAndRemoveDieResultsFromDieFaceList(DieColor thisColor) {
        Die thisDie = new Die(thisColor);
        ArrayList<DieFace> dieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(thisColor)));
        int maxRolls = 1000;
        while (maxRolls > 0 && dieFaceList.size() > 0) {
            thisDie.rollDie();
            if (dieFaceList.contains(thisDie.getCurrentFace())) {
                dieFaceList.remove(thisDie.getCurrentFace());
            }
            maxRolls--;
        }
        return dieFaceList;
    }

    private void RemoveCorrectDieFacesFromCurrentDieFaceList(ArrayList<DieFace> currentDieFaceList, ArrayList<DieFace> correctList) {
        for (DieFace thisFace : correctList) {
            if (currentDieFaceList.contains(thisFace)) {
                currentDieFaceList.remove(thisFace);
            }
        }
    }
}
