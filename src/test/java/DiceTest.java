import com.austincreations.rollforthegalaxy.DiceColor;
import com.austincreations.rollforthegalaxy.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.*;

public class DiceTest {

    @Test
    public void getColor_TestBlueDiceColor(){
        Dice thisDice = new Dice(DiceColor.Blue);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Blue);
    }

    @Test
    public void getColor_TestWhiteDiceColor(){
        Dice thisDice = new Dice(DiceColor.White);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.White);
    }

    @Test
    public void getColor_TestRedDiceColor(){
        Dice thisDice = new Dice(DiceColor.Red);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Red);
    }

    @Test
    public void getColor_TestPurpleDiceColor(){
        Dice thisDice = new Dice(DiceColor.Purple);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Purple);
    }

    @Test
    public void getColor_TestBrownDiceColor(){
        Dice thisDice = new Dice(DiceColor.Brown);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Brown);
    }

    @Test
    public void getColor_TestGreenDiceColor(){
        Dice thisDice = new Dice(DiceColor.Green);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Green);
    }

    @Test
    public void getColor_TestYellowDiceColor(){
        Dice thisDice = new Dice(DiceColor.Yellow);

        assertThat(thisDice.getColor()).isEqualTo(DiceColor.Yellow);
    }

    @Test
    public void getDiceFaces_CheckWhiteFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.White)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Explore, DiceFace.Develop, DiceFace.Settle, DiceFace.Produce, DiceFace.Ship));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat((numberOfFaces)).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckRedFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Red)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Develop, DiceFace.Develop, DiceFace.Settle, DiceFace.Settle, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckPurpleFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Purple)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Develop, DiceFace.Ship, DiceFace.Ship, DiceFace.Ship, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckBlueFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Blue)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Produce, DiceFace.Produce, DiceFace.Ship, DiceFace.Ship, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckBrownFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Brown)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Develop, DiceFace.Develop, DiceFace.Produce, DiceFace.Ship, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckGreenFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Green)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Explore, DiceFace.Settle, DiceFace.Settle, DiceFace.Produce, DiceFace.Wild, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void getDiceFaces_CheckYellowFaces(){
        ArrayList<DiceFace> currentDiceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(DiceColor.Yellow)));
        ArrayList<DiceFace> correctList = new ArrayList<DiceFace>(asList(DiceFace.Develop, DiceFace.Settle, DiceFace.Produce, DiceFace.Wild, DiceFace.Wild, DiceFace.Wild));

        int numberOfFaces = currentDiceFaceList.size();
        RemoveCorrectDiceFacesFromCurrentDiceFaceList(currentDiceFaceList, correctList);

        assertThat(numberOfFaces).as("Number of dice faces").isEqualTo(6);
        assertThat(currentDiceFaceList.size()).as("Number of faces that didn't match correct list").isEqualTo(0);
    }

    @Test
    public void rollDice_TestWhiteRoll(){
        DiceColor thisColor = DiceColor.White;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestRedRoll(){
        DiceColor thisColor = DiceColor.Red;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestPurpleRoll(){
        DiceColor thisColor = DiceColor.Purple;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestBlueRoll(){
        DiceColor thisColor = DiceColor.Blue;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestBrownRoll(){
        DiceColor thisColor = DiceColor.Brown;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestGreenRoll(){
        DiceColor thisColor = DiceColor.Green;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    @Test
    public void rollDice_TestYellowRoll(){
        DiceColor thisColor = DiceColor.Yellow;

        ArrayList<DiceFace> diceFaceList = rollAndRemoveDiceResultsFromDiceFaceList(thisColor);

        assertThat(diceFaceList.size()).isEqualTo(0);
    }

    private ArrayList<DiceFace> rollAndRemoveDiceResultsFromDiceFaceList(DiceColor thisColor) {
        Dice thisDice = new Dice(thisColor);
        ArrayList<DiceFace> diceFaceList = new ArrayList(Arrays.asList(Dice.getDiceFaces(thisColor)));
        int maxRolls = 1000;
        while(maxRolls > 0 && diceFaceList.size() > 0){
            thisDice.rollDice();
            if(diceFaceList.contains(thisDice.getCurrentFace())){
                diceFaceList.remove(thisDice.getCurrentFace());
            }
            maxRolls--;
        }
        return diceFaceList;
    }

    private void RemoveCorrectDiceFacesFromCurrentDiceFaceList(ArrayList<DiceFace> currentDiceFaceList, ArrayList<DiceFace> correctList) {
        for (DiceFace thisFace : correctList) {
            if (currentDiceFaceList.contains(thisFace)) {
                currentDiceFaceList.remove(thisFace);
            }
        }
    }
}
