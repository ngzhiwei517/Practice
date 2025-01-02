package NTULAB4.Q2;

import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Shape[] shapes; //polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of shapes:");
        int num = scanner.nextInt();
        shapes = new Shape[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Choose the shape  (1: Circle, 2: Rectangle, 3: Square 4:Triangle ): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of the circle:");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;

                case 2:
                    System.out.println("Enter the length of the rectangle:");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth of the rectangle:");
                    double breadth = scanner.nextDouble();
                    shapes[i] = new Rectangle(length, breadth);
                    break;

                case 3:
                    System.out.println("Enter the side of the square:");
                    double side = scanner.nextDouble();
                    shapes[i] = new Square(side);
                    break;

                case 4:
                    System.out.println("Enter the base length of the triangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle:");
                    double height = scanner.nextDouble();
                    shapes[i] = new Triangle(base, height);
                    break;

                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }
        }
        System.out.println();
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.surfaceArea();
        }
        System.out.printf("Total surface area of 2D figure:%.2f", totalArea);
    }

}
