package NTULAB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nChoose the action that you want to perform:");
            System.out.println("1. Multiplication Test");
            System.out.println("2. Quotient by using repeated subtraction");
            System.out.println("3. Remainder by using repeated subtraction");
            System.out.println("4. Number of digits in an integer");
            System.out.println("5. Find position of specific digit");
            System.out.println("6. Extract odd digit and form new number");
            System.out.println("7. Quit the program");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Menu.multiplicationTest();
                    break;

                case 2:
                    System.out.println("Enter two integers to compute quotient:");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    Menu.quotient(num1, num2);
                    break;

                case 3:
                    System.out.println("Enter two integer to compute its remainder:");
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    int modulus = Menu.modulus(num3, num4);
                    System.out.printf("Modulus of %d and %d is %d\n", num3, num4, modulus);
                    break;

                case 4:
                    System.out.println("Calculate num of digits:");
                    int num = sc.nextInt();
                    int digit = Menu.calDigit(num);
                    if (digit == -1) {
                        System.out.println("Number must be positive number");
                    } else {
                        System.out.println("Num of digits of " + num + ":" + digit);
                    }
                    break;

                case 5:
                    System.out.println("Find the position of specific digit:");
                    System.out.println("Enter the number:");
                    int value = sc.nextInt();
                    System.out.println("Enter the digit:");
                    int digits = sc.nextInt();
                    int position = Menu.positionDigi(value, digits);
                    if (position == -1) {
                        System.out.println(digits + " is not found in " + value);
                    } else {
                        System.out.println(digits + " is found in " + value + " at " + position + " th position");
                    }
                    break;

                case 6:
                    System.out.println("Enter the number");
                    int number = sc.nextInt();
                    if (number <= 0) {
                        System.out.println("Invalid input,must be positiven number");
                        break;
                    } else {
                        int odd = Menu.extractOddDigit(number);
                        if (odd == -1) {
                            System.out.println("No odd digit found");
                        } else {
                            System.out.println("New number:" + odd);
                        }

                    }
                    break;

                case 7:
                    System.out.println("Terminating the program...");
                    break;


                default:
                    System.out.println("Invalid choice! Please select a valid option.\n");

            }


        } while (choice != 7);
        sc.close();
    }
}

