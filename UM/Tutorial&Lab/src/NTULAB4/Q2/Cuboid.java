package NTULAB4.Q2;

public class Cuboid extends Shape {
    private Rectangle rectangle;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        rectangle = new Rectangle(length, breadth);
        this.height = height;
    }

    public double surfaceArea() {
        return rectangle.surfaceArea() * 2 + 2 * (rectangle.getLength() * height) + 2 * (rectangle.getBreadth()) * height;
    }


}
