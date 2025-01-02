package UMDSLAB1.Q3;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate=0.0;
    private Date dateCreated;

    public Account(){
        this.id=0;
        this.balance=0.0;
        dateCreated=new Date();
    }

    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
        dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate=annualInterestRate;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        return getBalance()*(getMonthlyInterestRate()/100);
    }

    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient amount to withdraw");
        }
    }

    public void deposit(double amount){
        balance+=amount;
    }
}

class Main{
    public static void main(String[] args) {
        Account acc=new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance:"+acc.getBalance());
        System.out.println("Monthly interest:"+acc.getMonthlyInterest());
        System.out.println("Date created:"+acc.getDateCreated());
    }
}
