package Lab9.Q4.Practice;

import Lab9.Q4.DiceGame1;
import Lab9.Q4.DiceGame2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the which game you want to play:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            playGameOne();
        } else {
            playGameTwo();
        }
    }

    public static void playGameOne() {
        Dice1 diceGame1 = new Dice1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting dice game one......");
        while (true) {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Player " + i + " press enter to roll the dice.");
                scanner.nextLine();
                if (diceGame1.winnerOfTheGame(i)) {
                    System.out.println("Player " + i + " is the winner");
                    return; //will terminate the whole program not only the loop
                }
            }
        }
    }

    public static void playGameTwo() {
        Scanner scanner = new Scanner(System.in);
        Dice2 dice2 = new Dice2();
        System.out.println("Starting game two......");
        while (true) {
            for (int i = 1; i <= 2; i++) {
                System.out.println("\nPlayer " + i + " press enter to roll the dice.");
                scanner.nextLine();
                if (dice2.winnerOfTheGame(i)) {
                    System.out.println("Player " + i + " win the game!");
                    return;
                }
            }

        }
    }
}
