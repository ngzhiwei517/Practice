public class InheritancePartTwo {
    public static void main(String[] args) {
       Dog dog=new Dog();
       Lion lion=new Lion(); //will automatically invoked superclass constructor even didn't use super
    }
}

class Tiger{
    protected String name;
    public Tiger(){
        System.out.println("Superclass constructor is invoked");
    }

    public Tiger(String name){
        System.out.println("My name is "+name);
    }
}

class Lion extends Tiger{
    public Lion(){
        //super keyword is needed when we  want to invoke parameterized constructor
        super("Robby"); //if without argument no argument constructor will be invoked
        System.out.println("Subclass constructor is invoked");
    }
}
