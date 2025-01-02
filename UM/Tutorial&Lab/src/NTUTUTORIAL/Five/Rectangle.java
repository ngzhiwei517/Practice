package NTUTUTORIAL.Five;

public class Rectangle extends Polygon {
    public Rectangle(String name, float width, float height) {
        super(name, width, height);
        super.setPolytype(KindofPolygon.POLY_RECT);
    }

    public float calArea() {
        return super.width * super.height;
    }

}
