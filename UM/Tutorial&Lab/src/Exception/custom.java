package Exception;


import java.util.Scanner;

public class custom {
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result:" + divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }

        try {
            System.out.println("Result:" + divide(10, 2));
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        }

        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter num:");
            String num= scanner.nextLine();
            int number=getNumber(num);
        }catch (NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }

        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the string:");
            String string=scanner.nextLine();
            printStringLength(null);
        }catch (NullPointerException e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static int getNumber(String input){
        try{
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Invalid input!");
        }
    }

    public static void printStringLength(String str){
        if(str==null){
            throw new NullPointerException("String cannot be null!");
        }
        System.out.println(str.length());
    }
}
