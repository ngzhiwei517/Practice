package Lab9.Q4;

import java.util.Random;
import java.util.Scanner;

public class PracticeDiceGameOne {
    private int player1Score;
    private int player2Score;
    private final int WINNING_SCORE = 100;
    Random random = new Random();

    public PracticeDiceGameOne() {
        player1Score = 0;
        player2Score = 0;
    }

    public int getPlayerScore(int player) {
        if (player == 1) {
            return player1Score;
        } else {
            return player2Score;
        }
    }

    public boolean winner(int player) {
        boolean canRollAgain;
        int currentScore = 0;
        do {
            int score1 = rollDice();
            int score2 = rollDice();
            currentScore += score1 + score2;
            canRollAgain = score1 == score2;
            System.out.println("Player " + player + " rolled " + score1 + " and " + score2);
            if (canRollAgain) {
                System.out.println("Player rolled doubled can rolled again!");
            } else {
                if (player == 1) {
                    player1Score += currentScore;
                } else {
                    player2Score += currentScore;
                }
            }
        } while (canRollAgain && getPlayerScore(player) < WINNING_SCORE);
        System.out.println("Player " + player + " current score:" + getPlayerScore(player));
        return getPlayerScore(player)>=WINNING_SCORE;
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}

