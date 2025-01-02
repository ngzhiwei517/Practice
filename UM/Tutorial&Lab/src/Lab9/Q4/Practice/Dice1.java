package Lab9.Q4.Practice;

import java.util.Random;

public class Dice1 {
    private int player1Score;
    private int player2Score;
    private final int WINNING_SCORE=100;
    Random random=new Random();

    public int getPlayerScore(int player){
        if(player==1){
            return player1Score;
        }else{
            return player2Score;
        }
    }

    public boolean winnerOfTheGame(int player){
        int currentScore=0;
        boolean canRollAgain=false;
        do{
            int firstRoll=rollDice();
            int secondRoll=rollDice();
            currentScore+=firstRoll+secondRoll;
            System.out.println("Player "+player+" rolled "+firstRoll+" and "+secondRoll);
            canRollAgain=firstRoll==secondRoll;
            if(canRollAgain){
                System.out.println("Roll again");
            }else{
              if(player==1){
                  player1Score+=currentScore;

              }else{
                  player2Score+=currentScore;
              }
            }
        }while (canRollAgain && getPlayerScore(player)<WINNING_SCORE);
        System.out.println("Player:"+player+" current score: "+getPlayerScore(player)+"\n");
        return getPlayerScore(player)>=WINNING_SCORE;
    }

    private int rollDice(){
        return random.nextInt(6)+1;
    }
}
