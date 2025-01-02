package Lab9.Q4;

import java.util.Random;

public class DiceGame2 {
    private int player1Score;
    private int player2Score;
    Random random = new Random();
    private final int WINNING_SCORE = 100;

    public int getPlayerScore(int player) {
        if (player == 1) {
            return player1Score;
        } else {
            return player2Score;
        }
    }


    public boolean winner(int player) {
        int current_score = 0;
        int roll = rollDice();
        System.out.println("Player " + player + " rolled " + roll);

        if (roll == 6) {
            System.out.println("You can roll again!");
            int secondRoll = rollDice();
            System.out.println("Player " + player + " rolled again " + secondRoll);
            if (secondRoll == 6) {
                System.out.println("No points this turn!");
                return false;
            } else {
                current_score += (roll + secondRoll);
            }
        } else {
            current_score += roll;
        }

        if (getPlayerScore(player) + current_score == WINNING_SCORE) {
            if (player == 1) {
                player1Score += current_score;
            } else {
                player2Score += current_score;
            }
            System.out.println("Player " + player + " current score " + getPlayerScore(player));
            return true;
        } else if (getPlayerScore(player) + current_score > WINNING_SCORE) {
            System.out.println("Player " + player + " score exceed 100!Last score not counted.");
        } else {
            if (player == 1) {
                player1Score += current_score;
            } else {
                player2Score += current_score;
            }
        }
        System.out.println("Player " + player + " current score " + getPlayerScore(player));
        return false;
    }


    private int rollDice() {
        return random.nextInt(6) + 1;
    }
}
