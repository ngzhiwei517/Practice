package Lab9.Q4;

import java.util.Random;

public class DiceGame1 {
    private int player1Score;
    private int player2Score;
    private final int WINNING_SCORE = 100;
    Random random = new Random();

    public DiceGame1() {
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

    public boolean rollDice(int player) {
        int currentScore = 0;
        boolean canRollAgain;

        do {
            int score_1 = rollDice();
            int score_2 = rollDice();
            System.out.println("Player " + player + "rolled" + score_1 + " and " + score_2);
            canRollAgain = score_1 == score_2;
            currentScore += score_1 + score_2;
            if (canRollAgain) {
                System.out.println("Player " + player + " rolled" + score_1 + " and " + score_2 + ". Rolled again");
            } else {
                if (player == 1) {
                    player1Score += currentScore;
                } else {
                    player2Score += currentScore;
                }
            }
        } while (canRollAgain && getPlayerScore(player) < WINNING_SCORE);

        System.out.println("Player:" + player + ",Current score:" + currentScore);
        return getPlayerScore(player) >= WINNING_SCORE;
    }

    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}
