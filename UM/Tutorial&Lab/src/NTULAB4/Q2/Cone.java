package NTULAB4.Q2;

public class Cone extends Shape {
    private double height;
    private Circle circle;

    public Cone(double radius, double height) {
        circle = new Circle(radius);
        this.height = height;
    }

    public double surfaceArea() {
        double slantHeight = Math.sqrt((circle.getRadius())* circle.getRadius() +(height * height));
        return circle.surfaceArea()+Math.PI*slantHeight* circle.getRadius();
    }
}
