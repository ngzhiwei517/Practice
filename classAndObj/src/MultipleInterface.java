/*//Demonstrate interface extends multiple interface
interface Animals{
    void eat();
}

interface Pet{
    void play();
}

interface Labrador extends Animals,Pet{
    void bark();
}

class MultipleInterface implements Labrador
{
    @Override
    public void eat() {
        System.out.println("Labrador is eating!");
    }

    @Override
    public void bark() {
        System.out.println("Labrador is barking!");
    }

    @Override
    public void play() {
        System.out.println("Labrador is playing!");
    }
}

class TestForInterface{
    public static void main(String[] args) {
        MultipleInterface dog=new MultipleInterface();
        dog.bark();
        dog.eat();
        dog.play();

    }*/

//Demonstrate a class implement Multiple interface
class Vehicle{
    void run(){
        System.out.println("The vehicle is running!");
    }
}

interface Electric{
    abstract void chargeBattey();
}

interface Automatic{
    abstract void selfDrive();
}

class Tesla extends Vehicle implements Electric,Automatic{
    @Override
    public void chargeBattey() {
        System.out.println("Tesla is charging its battery");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is in its self driving mode");
    }
}

public class MultipleInterface{
    public static void main(String[] args) {
        Tesla tesla=new Tesla();
        tesla.chargeBattey();
        tesla.selfDrive();
        tesla.run();
    }
}
