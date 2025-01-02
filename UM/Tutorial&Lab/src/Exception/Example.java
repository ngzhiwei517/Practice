package Exception;

import java.util.Scanner;

class BankingAccount{
    private double balance;

    public BankingAccount(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("Sucessfully withdraw "+amount+"\nNew balance:"+balance);
        }else{
            throw new ArithmeticException("Withdraw failed,insufficient money to withdraw!");
        }
    }
}
public class Example {
    public static void main(String[] args) {
        BankingAccount bankingAccount=new BankingAccount(200);
        try{
            bankingAccount.withdraw(50);
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }


        //manually specific the error type[program will terminated and specific error message will print out]

        /*int age=-1;
        if(age<0){
            throw new IllegalArgumentException("Age cannot less then zero");
        }else{
            System.out.println("Age:"+age);
        }*/

/*        try{
            int age=-1;
            if(age<0){
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Invalid age provided!"+e.getMessage());
        }*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        try{
            int age= scanner.nextInt();
            validateAge(age);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid age:"+e.getMessage());
        }*/


    }
/*    public static void validateAge(int age){
        if(age<18){
            throw new IllegalArgumentException("Age must be at least 18!");
        }else{
            System.out.println("Age:"+age);
        }
    }*/



}

