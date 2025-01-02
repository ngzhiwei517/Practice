package NTUT2;

import java.util.Random;

public class Dice {
    private int valueOfDice;

    public Dice() {
        valueOfDice = 0; //default value indicate that the dice has not been rolled yet
    }

    public void setDiceValue() {
        Random random = new Random();
        valueOfDice = random.nextInt(6) + 1;
    }

    public int getValueOfDice() {
        return valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current value is " + valueOfDice);
    }


}
