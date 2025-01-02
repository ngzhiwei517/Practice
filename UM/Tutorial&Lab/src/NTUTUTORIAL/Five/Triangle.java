package NTUTUTORIAL.Five;

public class Triangle extends Polygon{
    public Triangle(String name,float width,float height){
        super(name,width,height);
        super.setPolytype(KindofPolygon.POLY_TRIANG);
    }

    public float calArea(){
        return 0.5f*super.width*super.height;
    }
}
