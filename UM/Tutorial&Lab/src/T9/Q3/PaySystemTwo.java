package T9.Q3;

public class PaySystemTwo {
    private double payRate;
    private int numOfHour;

    public PaySystemTwo(double payRate, int numOfHour) {
        this.payRate = payRate;
        this.numOfHour = numOfHour;
    }

    public double totalPay() {
        return payRate * numOfHour;
    }

    public void display(){
        System.out.println("Pay rate:"+payRate);
        System.out.println("Number of hour:"+numOfHour);
        System.out.println("Total payment:"+totalPay());
    }
}

class RegularPays extends PaySystemTwo{
    public RegularPays(double payRate,int numHour){
        super(payRate,numHour);
    }

}

class SpecialPays extends PaySystemTwo{
    public SpecialPays(double payRate,int hour){
        super(payRate,hour);
    }

    @Override
    public double totalPay() {
        double basePay=super.totalPay();
        double comission=0.3*basePay;
        return basePay+comission;
    }

    @Override
    public void display() {
        super.display();
    }
}

class Tester{
    public static void main(String[] args) {
        RegularPays pay=new RegularPays(10,4);
        pay.display();
        System.out.println();
        SpecialPays specialPay=new SpecialPays(10,4);
        specialPay.display();

    }
}
