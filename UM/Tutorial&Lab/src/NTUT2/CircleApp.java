package NTUT2;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("====Circle Computation====\n" +
                "|1. Create a new circle |\n" +
                "|2. Print Area |\n" +
                "|3. Print circumference|\n" +
                "|4. Quit |\n" +
                "===============================");
        int option;
        Circles circles=null;
        double radius;
        do {
            System.out.print("Choose option (1-3):");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the radius to compute the area and circumference:");
                    radius = scanner.nextDouble();
                    circles = new Circles(radius);
                    break;

                case 2:
                    if(circles==null){
                        System.out.print("No circle is created!");
                    }else{
                        circles.printArea();
                    }
                    break;

                case 3:
                    if(circles==null){
                        System.out.println("No circle is created!");
                    }else{
                        circles.printCircumference();
                    }
                    break;

                case 4:
                    System.out.println("Thank you!!!");
                    break;
            }
        } while (option != 4);
    }
}
