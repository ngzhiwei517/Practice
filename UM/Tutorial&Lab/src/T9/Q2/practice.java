package T9.Q2;

public class practice {
    public static void main(String[] args) {

    }
}

class Organism2{
    private final double size;
    private final double growthRate;

    public Organism2(double size,double growthRate){
        this.size=size;
        this.growthRate=growthRate;
    }

    public double getSize(){
        return this.size;
    }

    public double getGrowthRate() {
        return growthRate;
    }
}

class Animal2 extends Organism2{
    private double amountEating;

    public Animal2(double size,double growthRate,double amountEating){
        super(size, growthRate);
        this.amountEating=amountEating;
    }

    public void display(){
        System.out.println("Size:"+getSize());
        System.out.println("Growth rate:"+getGrowthRate());
        System.out.println("Amount eating:"+amountEating);
    }
}

class Tester{
    public static void main(String[] args) {
        Animal dog=new Animal(40.4,2.3,5);
        dog.display_details();
    }
}

