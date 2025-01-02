package NTULAB4.Q2;

public class Cylinder extends Shape{
    private Circle circle;
    private double height;

    public Cylinder(double radius, double height) {
        circle = new Circle(radius);
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * circle.surfaceArea() + 2 * Math.PI * height * circle.getRadius();
    }


}
