class Cat {
    //Parent class/Superclass/base class
    protected String name = "Janice";

    //superclass Constructor
    public Cat() {
        System.out.println("Thinking of my english name!");
    }

    //overriden method
    public void eat() {
        System.out.println("I can eat!");
    }

    public void bark() {
        System.out.println("Meow！");
    }
}

class Dog extends Cat {
    protected String name = "Agnes";

    public Dog() {
        //to call the constructor of super class we use super() and it must be the first
        super();
        System.out.println("Thinking of my Chineses name");
    }

    //subclass/child class/derived class
    public void display() {
        System.out.println("My name is " + name);
    }

    //method overriding in Java
    //overriding method
    @Override
    public void eat() {
        super.eat(); //super keyword is used to call method of superclass from subclass
        System.out.println("I eat dog food");
    }

    public void bark() {
        System.out.println("I can bark");
    }

    public void PrintMessage() {
        //called overriding method
        bark();
        //call overriden method
        super.bark();
    }

    //access attribute of superclass by using super
    public void printName() {
        System.out.println("Subclass name:" + name);
        System.out.println("Superclass name:" + super.name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.display();
        dog1.PrintMessage();
        dog1.printName();
    }
}
