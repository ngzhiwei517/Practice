abstract class Animal {
    //abstract class can have both regular method and abstract method
    //We cannot create the object of abstract class

    //CONSTRUCTOR
    Animal(){
        System.out.println("I am an animal");
    }
    static int age;
    abstract void makeSound();

    void eat() {
        System.out.println("I can eat");
    }

}
/*Access the abstract class by creating the subclass and access it using object of the subclass*/

/*If the abstract class include any abstract method, then all the child class that inherited from the abstract class must implement the abstract method*/
class Woof extends Animal {
    public void setAge(int age){
        Animal.age=age;
    }

    public void printAge(){
        System.out.println("Age:"+Animal.age);
    }
    public void makeSound() {
        System.out.println("Bark Bark!");
    }
}

class Main {
    public static void main(String[] args) {
        Woof w1 = new Woof();
        w1.makeSound();
        w1.eat();
        System.out.println("Set the age of woof");
        w1.setAge(24);
        w1.printAge();
    }
}


