package NTUT2;

public class Circles {
    private double radius;
    private final static double PI = Math.PI;

    public Circles(double radius) {
        System.out.println("A new circle is created");
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public void printArea() {
        System.out.println("Area of circle:");
        System.out.println("Radius:" + getRadius());
        System.out.printf("Area:%.5f\n", area());
    }

    public void printCircumference() {
        System.out.printf("Circumference of the circle\nRadius:%.1f\nCircumference:%.4f\n", getRadius(), circumference());
    }
}
