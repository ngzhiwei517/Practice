package NTUT3;

public class Test {
    public static void main(String[] args) {
        /*Class Hierarchy:

    Point
     \
     Circle
     \
        Cylinder
        */
        Circle circle = new Circle(0, 0, 5);
        Cylinder cylinder = new Cylinder(0, 0, 5, 10);
        System.out.println(circle);
        System.out.printf("Area:%.2f\n" ,circle.getArea());
        System.out.println();
        System.out.println(cylinder);
        System.out.printf("Area:%.2f\n", cylinder.getArea());
        System.out.printf("Volume:%.2f", cylinder.getVolume());
    }
}
