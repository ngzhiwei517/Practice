public class Bicycle {
    //variables used to represent the attribute/properties of the objects while method used to represent the behaviour of the object
    private int gear=5;
    boolean isOn;
    public void braking(){
        System.out.println("Working of braking");
    }

    public boolean turnOn(){
        isOn=true;
        return isOn;
    }
    //correct ways to define method
    //modifier static return type name(parameter)

    //getter and setter is used to access private method or attribute
    public int getGear(){
        return this.gear;
    }

    public void setGear(int gear){
        this.gear=gear;
    }
}

class Test {
    public static void main(String[] args) {
        Bicycle sportBicycle=new Bicycle();
        sportBicycle.braking();

        System.out.println("Turn on the light of the bicycle:"+sportBicycle.turnOn());
    }
}
