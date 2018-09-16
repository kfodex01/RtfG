package com.austincreations.rollforthegalaxy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class DieTest {

    @Test
    public void getColor_TestBlueDiceColor(){
        Die thisDie = new Die(DieColor.Blue);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Blue);
    }

    @Test
    public void getColor_TestWhiteDiceColor(){
        Die thisDie = new Die(DieColor.White);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.White);
    }

    @Test
    public void getColor_TestRedDiceColor(){
        Die thisDie = new Die(DieColor.Red);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Red);
    }

    @Test
    public void getColor_TestPurpleDiceColor(){
        Die thisDie = new Die(DieColor.Purple);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Purple);
    }

    @Test
    public void getColor_TestBrownDiceColor(){
        Die thisDie = new Die(DieColor.Brown);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Brown);
    }

    @Test
    public void getColor_TestGreenDiceColor(){
        Die thisDie = new Die(DieColor.Green);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Green);
    }

    @Test
    public void getColor_TestYellowDiceColor(){
        Die thisDie = new Die(DieColor.Yellow);

        assertThat(thisDie.getColor()).isEqualTo(DieColor.Yellow);
    }

    @Test
    public void getDieFaces_CheckWhiteFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.White)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Explore, DieFace.Develop, DieFace.Settle, DieFace.Produce, DieFace.Ship));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat((numberOfFaces)).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckRedFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Red)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Develop, DieFace.Develop, DieFace.Settle, DieFace.Settle, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckPurpleFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Purple)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Develop, DieFace.Ship, DieFace.Ship, DieFace.Ship, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckBlueFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Blue)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Produce, DieFace.Produce, DieFace.Ship, DieFace.Ship, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckBrownFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Brown)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Develop, DieFace.Develop, DieFace.Produce, DieFace.Ship, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckGreenFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Green)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Explore, DieFace.Settle, DieFace.Settle, DieFace.Produce, DieFace.Wild, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDieFaces_CheckYellowFaces() {
        ArrayList<DieFace> currentDieFaceList = new ArrayList(Arrays.asList(Die.getDieFaces(DieColor.Yellow)));
        ArrayList<DieFace> correctList = new ArrayList<DieFace>(asList(DieFace.Develop, DieFace.Settle, DieFace.Produce, DieFace.Wild, DieFace.Wild, DieFace.Wild));

        int numberOfFaces = currentDieFaceList.size();
        RemoveCorrectDieFacesFromCurrentDieFaceList(currentDieFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDieFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void rollDie_TestWhiteRoll() {
        DieColor thisColor = DieColor.White;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestRedRoll() {
        DieColor thisColor = DieColor.Red;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestPurpleRoll() {
        DieColor thisColor = DieColor.Purple;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestBlueRoll() {
        DieColor thisColor = DieColor.Blue;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestBrownRoll() {
        DieColor thisColor = DieColor.Brown;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestGreenRoll() {
        DieColor thisColor = DieColor.Green;

        ArrayList<DieFace> dieFaceList = rollAndRemoveDieResultsFromDieFaceList(thisColor);

        assertThat(dieFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDie_TestYellowRoll() {
        DieColor thisColor = DieColor.Yellow;

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
