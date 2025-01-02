package NTULAB4.Q2;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 0.5 * height * base;
    }
}
