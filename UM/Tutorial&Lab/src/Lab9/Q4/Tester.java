package Lab9.Q4;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DiceGame2 diceGame2=new DiceGame2();
        System.out.println("Enter the game you want to play:");
        int choice= scanner.nextInt();
        if(choice==1){
            playGameOne();
        } else if (choice==2) {
            playGameTwo();
        }else{
            System.out.println("Invalid choice");
        }
    }

    public static void playGameOne(){
        PracticeDiceGameOne practiceDiceGameOne=new PracticeDiceGameOne();
        System.out.println("Starting game one......");
        Scanner scanner1=new Scanner(System.in);
        while (true){
            for(int i=1;i<=2;i++){
                System.out.println("\nPlayer"+i+", press enter to roll the dice.");
                scanner1.nextLine();
                if(practiceDiceGameOne.winner(i)){
                    System.out.println("Congratulation "+"player "+i+" you win the game!");
                    return;
                }
            }
        }
    }

    private static void playGameTwo(){
        DiceGame2 diceGame2=new DiceGame2();
        System.out.println("Starting game two.....");
        Scanner scanner=new Scanner(System.in);
        while (true){
            for(int i=1;i<=2;i++){
                System.out.println("\nPlayer"+i+", press enter to roll the dice.");
                scanner.nextLine();
                if(diceGame2.winner(i)){
                    System.out.println("Player "+i+",you win the game!");
                    return;
                }
            }
        }
    }
}


