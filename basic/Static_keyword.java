public class Static_keyword {
    protected String planet="Earth";

    static int age=24;

    int addNumber(int a,int b){
        return a+b;
    }

    static int multiply(int a,int b){
        return a*b;
    }
    
}

class second {
    public static void main(String[] args) {
        Static_keyword s=new Static_keyword();
        System.out.println(s.addNumber(4,5 ));
        System.out.println(s.planet);
        System.out.println(Static_keyword.multiply(3, 4));
        System.out.println(Static_keyword.age);

    }
}
