package NTULAB4.Q2;

public class Pyramid extends Shape {
    private Square square;
    private Triangle triangle;

    public Pyramid(double base, double heightOfPyramid) {
        square = new Square(base);
        double baseLength = base / 2;
        double slantHeight = Math.sqrt((heightOfPyramid * heightOfPyramid) + (baseLength * baseLength));
        triangle = new Triangle(slantHeight, base);
    }

    public double surfaceArea() {
        return square.surfaceArea()+4* triangle.surfaceArea();
    }


}
