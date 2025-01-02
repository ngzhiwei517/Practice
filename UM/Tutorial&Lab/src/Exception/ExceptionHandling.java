package Exception;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        divide(4, 3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        //Can be handled by using try catch for the throw [in this case it will throw the specific message]
        try {
            int input = scanner.nextInt();
            System.out.println("You entered:" + input);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input, please enter integer!");
        }
    }

    //throw will throw an error when something goes wrong
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't divide by zero!");
        }
        System.out.println("Result:" + (double) (a / b));
    }


    //throws is like a waning label saying that this method might throw an exception
    public static void divides(int a, int b) throws ArithmeticException {

    }
}

