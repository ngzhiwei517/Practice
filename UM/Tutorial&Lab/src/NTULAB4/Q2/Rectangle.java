package NTULAB4.Q2;

public class Rectangle extends Shape { //perform inheritance
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public double surfaceArea() {
        return length * breadth;
    }
}
