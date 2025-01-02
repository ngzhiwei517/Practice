package NTUTUTORIAL.Five;

public class TestPolygon {
    //static binding
/*
    public void printArea(Rectangle r) {
        System.out.println("Area of " + r.getName() + ":" + r.calArea());
    }

    public void printArea(Triangle t) {
        System.out.println("Area of " + t.getName() + ":" + t.calArea());
    }
*/
    //Dynamic binding
    public void printArea(Polygon p) {
        System.out.println("Area of " + p.getName() + ":" + p.calArea());
    }

}

class Main {
    public static void main(String[] args) {
/*        Rectangle r = new Rectangle("Rectangle", 10, 5);
        Triangle t = new Triangle("Triangle", 8, 4); dynamic binding*/

        Polygon p1 = new Rectangle("Rectangle", 10, 5);
        Polygon p2 = new Triangle("Triangle", 8, 4);
        TestPolygon testPolygon = new TestPolygon();

        //demonstrate dynamic binding
        p1.printWidthHeight();
        testPolygon.printArea(p1);
        System.out.println();
        p2.printWidthHeight();
        testPolygon.printArea(p2);


        //demonstrate static binding
/*
        testPolygon.printArea(t);
        testPolygon.printArea(r);
*/


        /*
        What is the impact on the program when a new subclass of Polygon is
         introduced?

        Static Binding:
        If a new subclass of Polygon is introduced (e.g., Circle), we would need to add a new overloaded printArea(Circle c) method to TestPolygon. This approach is less flexible because it requires modifying the TestPolygon class for every new subclass.

        Dynamic Binding:
        If a new subclass of Polygon is introduced, no changes are required in the TestPolygon class. The existing printArea(Polygon p) method will automatically handle the new subclass due to polymorphism.


        */
    }
}
