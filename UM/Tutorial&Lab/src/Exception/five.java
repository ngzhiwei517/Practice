package Exception;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
/*        try {
            readFile("Sit.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
        double ans=divide(4,3);
        System.out.println("Ans:"+ans);*/
/*        readContent("Sit.txt");
        int age = -4;
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }*/


/*        try {
            processFile(null);
        } catch (NullPointerException | FileNotFoundException | EOFException e) {
            System.out.println("Error:" + e.getMessage());
        }*/

/*        try{
            System.out.println("Enter number:");
            Scanner scanner=new Scanner(System.in);
            String number= scanner.nextLine();
            int num=getNumber(number);
            System.out.println("Number entered:"+num);
        }catch (NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }*/


/*        try{
            validateNum(43);
        }catch (CustomExceptions e){
            System.out.println("Error:"+e.getMessage());
        }*/

        BankAccount bankAccount=new BankAccount(1000);
        try{
            bankAccount.withdraw(5000);
        }catch (ArithmeticException e){
            System.out.println("Error:"+e.getMessage());
        }

        try{
            printStringLength(null);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static int getNumber(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid Input!");
        }
    }


    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("file not found");
        }
        System.out.println("File exists");
    }

    public static void readContent(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found!");
            } else {
                System.out.println("File exists");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division bt zero is not allowed!");
        } else {
            return (double) numerator / denominator;
        }
    }

    public static void processFile(String path) throws FileNotFoundException, EOFException, NullPointerException {
        if (path == null) {
            throw new NullPointerException("Path cannot be null!");
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found!!!");
        } else {
            System.out.println("File exists");
        }
        throw new EOFException("IO exception occur");
    }

    public static void validateNum(int num) throws CustomExceptions {
        if (num < 0) {
            throw new CustomExceptions("Number cannot be negative!");
        } else {
            System.out.println("Valid number:" + num);
        }
    }
    public static void printStringLength(String string){
        if(string==null){
            throw new NullPointerException("String cannot be null");
        }else{
            System.out.println("Length:"+string.length());
        }
    }

}

class CustomExceptions extends Exception {
    public CustomExceptions(String message) {
        super(message);
    }
}

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void withdraw(double amount) throws ArithmeticException{ //unchecked exception no need to throws but still can use it
        if(amount<balance){
            balance-=amount;
            System.out.println("Successfully withdraw "+amount);
        }else{
            throw new ArithmeticException("Withdraw failed,insufficient money to withdraw");
        }
    }

}
