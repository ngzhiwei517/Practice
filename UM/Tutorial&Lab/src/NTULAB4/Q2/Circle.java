package NTULAB4.Q2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceArea() {
        return Math.PI * radius * radius;
    }

}
