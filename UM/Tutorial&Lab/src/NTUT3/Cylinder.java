package NTUT3;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int x, int y, int radius, int height) {
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRadius() {
        return super.getRadius();
    }

    public double getArea() {
        return 2*super.getArea()+2*Math.PI*getRadius()*height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder with height "+Integer.toString(getHeight())+" and radius at point ["+Integer.toString(super.getX())+","+Integer.toString(super.getY())+"]";
    }
}
