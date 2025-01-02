public interface Polygon {
    //interface is a fully abstract class
    /*It includes grp of abstract method*/
    void getArea(int length,int width);
}

class Rectangle implements Polygon{
     public void getArea(int length,int width){
         System.out.println("Area of rectangle:"+(length*width));
    }

}

class Sqaure implements Polygon{
    public void getArea(int length,int width){
        System.out.println("Area of sqaure:"+(length*width));
    }
}

class Tester{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.getArea(3,5);
        Sqaure s1=new Sqaure();
        s1.getArea(3,3);
        
    }
}
