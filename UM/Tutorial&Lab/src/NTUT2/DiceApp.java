package NTUT2;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = new Dice();
        int total = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("Press <key> to roll the dice:");
            scanner.nextLine();
            dice.setDiceValue();
            dice.printDiceValue();
            total += dice.getValueOfDice();
        }

        System.out.println("Your total number is:" + total);
    }
}
