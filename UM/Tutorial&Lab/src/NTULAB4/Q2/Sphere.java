package NTULAB4.Q2;

public class Sphere extends Shape {
    //show has-a relationship since Sphere has a circle
    /*Has a relationship means this class use the attribute of the other class*/


    private Circle circle;

    public Sphere(double radius) {
        circle = new Circle(radius);
    }

    public double surfaceArea() {
        return 4 * circle.surfaceArea();
    }


}
