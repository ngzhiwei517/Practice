package NTULAB2;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    public static void multiplicationTest() {
        System.out.println("Solve 5 random multiplication test:");
        Random r1 = new Random();
        Scanner sc = new Scanner(System.in);
        int num1, num2, ans, count = 0;
        for (int i = 0; i < 5; i++) {
            num1 = r1.nextInt(10);
            num2 = r1.nextInt(10);
            System.out.print(num1 + "*" + num2 + "=");
            ans = sc.nextInt();
            if (num1 * num2 == ans) {
                System.out.println("Correct");
                count += 1;
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println(count + " answers out of 5 are correct.");
    }

    public static void quotient(int num1, int num2) {
        int quotient = 0;
        int original=num1;
        if(num2==0){
            System.out.println("Error:Division cannot be zero!");
        }else{
            while (num1 >= num2) {
                num1 -= num2;
                quotient++;
            }
            System.out.printf("Quotient of %d and %d are %d\n", original, num2, quotient);
        }
    }

    public static int modulus(int m, int n) {
        int remainder = 0;
        while (m >= n) {
            m -= n;
        }
        remainder = m;
        return remainder;
    }

    public static int calDigit(int n) {
        if (n <= 0) {
            return -1;
        } else {
            int count = 0;
            while (n != 0) {
                n = n / 10;
                count += 1;
            }
            return count;
        }
    }

    public static int positionDigi(int number, int digits) {
        int pos = 0;
        while (number != 0) {
            pos++;
            int digit = number % 10;
            if (digit == digits) {
                return pos;
            }
            number=number/10;
        }
        return -1;
    }

    public static int extractOddDigit(int n) {

            int odd = 0;
            int temp;
            int multiply = 1;
            while (n != 0) {
                temp = n % 10;
                if (temp % 2 != 0) {
                    odd += temp * multiply;
                    multiply = multiply * 10;
                }
                n = n / 10;
            }
            if (odd == 0) {
                return -1;
            } else {
                return odd;
            }

    }

}
