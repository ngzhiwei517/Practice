package NTULAB1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:");
        int salary, meritPoint;
        salary = sc.nextInt();
        System.out.print("Enter your merit point:");
        meritPoint = sc.nextInt();
        char grade=getGrade(salary,meritPoint);
        if(grade=='X'){
            System.out.println("Invalid input!");
        }else{
            System.out.println("Your grade is "+grade);
        }

    }

    public static char getGrade(int salary, int meritPoint) {
        if (salary >= 700 && salary <= 899) {
            if (salary >= 700 && salary <= 799 && meritPoint < 20) {
                return 'B';
            } else {
                return 'A';
            }
        } else if (salary >= 600 && salary <= 799) {
            if (salary >= 600 && salary <= 649 && meritPoint < 10) {
                return 'C';
            } else {
                return 'B';
            }
        } else if (salary >= 500 && salary <= 649) {
            return 'C';
        } else {
            return 'X';
        }
    }
}
