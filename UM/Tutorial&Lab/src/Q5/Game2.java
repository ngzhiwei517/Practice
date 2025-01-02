package Q5;

import java.util.Random;

public class Game2 {
    private String name;
    private int score;

    public Game2(String name){
        this.name=name;
        this.score=0;
    }

    public void move(){
        Random r=new Random();
        int roll=r.nextInt(6)+1;
        this.score+=roll;
        System.out.println(this.name+" has rolled "+roll+".Total score:"+score);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
class Test{
    public static void main(String[] args) {
        Game2 p1=new Game2("Agnes");
        Game2 p2=new Game2("Jane");
        while (p1.getScore()<100 && p2.getScore()<100){
            p1.move();

            if(p1.getScore()>=100) {
                System.out.println(p1.getName() + " win the game.Total score:" + p1.getScore());
                break;
            }
            p2.move();
            if(p2.getScore()>=100){
                    System.out.println(p2.getName()+" win the game. Total score:"+p2.getScore());
                    break;
            }
            System.out.println();
            }

        }
}
