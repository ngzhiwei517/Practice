
public class Constructor {
    private int i;

    private Constructor() {
        i = 5;
        System.out.println("Hello java");
    }

    public int getI() {
        return this.i;
    }

    public static void main(String[] args) {
        /*three type of constructor
         * i) No argument constructor
         * ii) Parameterised constructor
         * iii) Default constructor //if we do not create any constructor java will automatically create a default no argument constructor [will initialize any uninitialized instance variable with default value*/
        Constructor c1 = new Constructor();
        System.out.println("Value of i:" + c1.getI());
        Company c2=new Company();
        System.out.println("Company name:"+c2.name);
        System.out.println("Default value of boolean:"+c2.b);
        System.out.println("Default value of integer:"+c2.a);
    }


}

class Company{
    String name;
    boolean b;
    int a;

    public Company(){
        name="Programiz";
    }

}
