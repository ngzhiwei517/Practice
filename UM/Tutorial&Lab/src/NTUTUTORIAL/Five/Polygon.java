package NTUTUTORIAL.Five;

abstract class Polygon {

    public enum KindofPolygon {POLY_PLAIN, POLY_RECT, POLY_TRIANG};
    protected String name;
    protected float width;
    protected float height;
    protected KindofPolygon polytype;

    public Polygon(String theName, float theWidth, float theHeight) {
        name = theName;
        width = theWidth;
        height = theHeight;
        polytype = KindofPolygon.POLY_PLAIN;
    }

    public KindofPolygon getPolytype() {
        return polytype;
    }

    public void setPolytype(KindofPolygon value) {
        polytype = value;
    }

    public String getName() {
        return name;
    }

/*    public float calArea() {
        return 0;
    }*/

    /* Modify the Polygon code so that any of its subclasses must include a
       calArea() member method. Suggest reason(s) why this requirement would be
       appropriate in this case.*/

    public abstract float calArea();

    /*Making calArea() abstract ensures that every subclass of Polygon
    must provide a meaningful implementation for area calculation.
     This aligns with the purpose of the Polygon class,
      which represents shapes requiring area computation.*/

    public void printWidthHeight() {
        System.out.println("Width = " + width + " Height = " + height);
    }
}

