package NTUT3;

public class Circle extends Point{
    private int radius;

    public Circle(int x,int y,int radius){
        super(x,y);
        this.radius=radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle with radius "+Integer.toString(getRadius())+" at point "+super.toString();
    }

}

