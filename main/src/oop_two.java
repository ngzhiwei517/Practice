package main.src;

///* super keyword is used to access the member of superclass from the subclass
/// When the fields and method are declared as protected in superclass then it can access by subclass 
/// i)access attributes of the superclass if both superclass and subclass have attribute of the same name
/// ii) access the method of superclass if both have the same method */

public class oop_two {
    // Superclass / parent class
    String name;
    protected String type="animal";
    protected void eat(){
        System.out.println("My name is "+name+".I like to eat.");
    }

    // use super to access constructor
    oop_two(){
        System.out.println("I am an animal");
    }
}

class Dog extends oop_two{
    String type="dog";
    //subclass// child class
    Dog(){
        System.out.println("I am a dog!");
    }
    public void run(){
        System.out.println("My name is "+name+".I like to run.");
    }

    public void printType(){
        
        //called the type from the parent class
        System.out.println("I am "+super.type);        
        System.out.println("I am a "+type);
    }

    // method overidding [same method that exists in both subclass and superclass]
    
    // We are overriding the method
    // super keyword is used to called the method of parent class from the child class
    @Override
    public void eat(){
        System.out.println("I eat dog food");
    }

    //use super to call both method
    public void printMessage(){
        //this called overriding method
        eat();
        //this called overriden method
        super.eat();
    }

}

class main{
    public static void main(String[] args) {
        oop_two obj1=new oop_two();
        Dog obj2=new Dog();
        obj1.name="Zhi Wei";
        obj1.eat();
        
        obj2.name="Justin";
        // obj 2 can called both method since it inherit the method and field from parent class(superclass)
        obj2.run();
        obj2.eat();
        System.out.println();
        obj2.printType();

        
    }
}