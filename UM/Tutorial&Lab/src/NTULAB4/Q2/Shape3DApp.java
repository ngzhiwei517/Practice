package NTULAB4.Q2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Shape[] shapes; //demonstrate the use of polymorphism
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of shapes:");
        int total = scanner.nextInt();
        shapes = new Shape[total];
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Choose a shape: 1. Sphere 2. Cuboid 3. Square-based pyramid 4. Cone 5. Cylinder");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the radius of sphere:");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Sphere(radius);
                    break;

                case 2:
                    System.out.println("Enter the length of the cuboid");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth of the cuboid");
                    double breadth = scanner.nextDouble();
                    System.out.println("Enter the height of the cuboid");
                    double height = scanner.nextDouble();
                    shapes[i] = new Cuboid(length, breadth, height);
                    break;

                case 3:
                    System.out.println("Enter the base length of the pyramid:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the pyramid:");
                    double heightPyramid = scanner.nextDouble();
                    shapes[i] = new Pyramid(base, heightPyramid);
                    break;

                case 4:
                    System.out.println("Enter the radius of the cone:");
                    double radiusCone = scanner.nextDouble();
                    System.out.println("Enter the height of the cone:");
                    double heightCone = scanner.nextDouble();
                    shapes[i] = new Cone(radiusCone, heightCone);
                    break;

                case 5:
                    System.out.println("Enter the radius of the cylinder:");
                    double radiusCylinder = scanner.nextDouble();
                    System.out.println("Enter the height of the cylinder:");
                    double heightC = scanner.nextDouble();
                    shapes[i] = new Cylinder(radiusCylinder, heightC);
                    break;

                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }
        }

        double totalSurfaceArea = 0;
        for (Shape shape : shapes) {
            totalSurfaceArea += shape.surfaceArea();
        }
        System.out.println("Total surface area of 3D figure:" + totalSurfaceArea);
    }
}
