package UMDSLAB1.Q3;

import java.util.ArrayList;
import java.util.Date;

public class Account1 extends Account {
    private String name;
    private int id;
    private double balance;
    private Date dateCreated;
    ArrayList<Transaction>transactions;


    //will always invoke the no-argument constructor of superclass
    public Account1(String name,int id,double balance){
        super(id,balance);
        this.name=name;
        this.transactions=new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void withdraw(double amount){
        super.withdraw(amount);
        transactions.add(new Transaction('w',amount,super.getBalance(),"Withdrawal of $:"+amount));
    }


    public void deposit(double amount){
        super.deposit(amount);
        transactions.add(new Transaction('D',amount,super.getBalance(),"Deposit of $ "+amount));
    }

    public void accountSummary(){
        System.out.println("Account holder:"+getName());
        System.out.println("Annual interest rate:"+getAnnualInterestRate());
        System.out.println("Balance:"+getBalance());
        System.out.println("\nAll transactions:");
        for(Transaction transaction:transactions){
            System.out.println(transaction);
            System.out.println();
        }

    }

}

class Transaction{
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type,double amount,double balance,String description){
        date=new Date();
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }

    public String toString(){
        return "Date:"+date+"\nType:"+type+"\nAmount:"+amount+"\nBalance:"+balance+"\nDescription:"+description;
    }
}

class Tester{
    public static void main(String[] args) {

        Account1 account1=new Account1("George",1122,1000);
        Account.setAnnualInterestRate(1.5);
        account1.deposit(30);
        account1.deposit(40);
        account1.deposit(50);
        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);
        account1.accountSummary();

    }
}
