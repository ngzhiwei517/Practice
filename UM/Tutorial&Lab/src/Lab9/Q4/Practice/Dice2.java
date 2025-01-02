package Lab9.Q4.Practice;

import java.util.Random;

public class Dice2 {
    private int player1Score;
    private int player2Score;
    private final int WINNING_SCORE = 100;
    Random random = new Random();

    private int rollDice() {
        return random.nextInt(6) + 1;
    }

    public int getPlayerScore(int player) {
        if (player == 1) {
            return player1Score;
        } else {
            return player2Score;
        }
    }

    public boolean winnerOfTheGame(int player) {
        int currentScore = 0;
        int firstRoll = rollDice();
        System.out.println("Player " + player + " roll " + firstRoll);
        if (firstRoll == 6) {
            System.out.println("Player "+player+" can roll again");
            int secondRoll = rollDice();
            System.out.println("Second roll:" + secondRoll);
            if (secondRoll == 6) {
                System.out.println("Roll doubled,no points at this roll");
                return false;
            } else {
                currentScore += firstRoll + secondRoll;
            }
        } else {
            currentScore += firstRoll;
        }

        if (getPlayerScore(player) + currentScore == WINNING_SCORE) {
            if (player == 1) {
                player1Score += currentScore;
            } else {
                player2Score += currentScore;
            }
            System.out.println("Player " + player + " current score " + getPlayerScore(player));
            return true;

        } else if (getPlayerScore(player) + currentScore > WINNING_SCORE) {
            System.out.println("Player " + player + " scored more than 100! Last score do not count!");
        } else {
            if (player == 1) {
                player1Score += currentScore;
            } else {
                player2Score += currentScore;
            }
        }
        System.out.println("Player " + player + " current score: " + getPlayerScore(player));
        return false;
    }
}
