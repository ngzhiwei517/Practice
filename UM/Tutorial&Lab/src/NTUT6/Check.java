package NTUT6;

public class Check {
    private double amount;
    private String checkNum;

    public Check(double amount,String checkNum){
        this.amount=amount;
        this.checkNum=checkNum;
    }

    public double getAmount() {
        return amount;
    }

    public String getCheckNum() {
        return checkNum;
    }


}
