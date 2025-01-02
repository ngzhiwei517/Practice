package Q2;

public class BankAcc2{
   private String name;
   private String IC;
   private double deposit;

   public BankAcc2(String name,String IC,double deposit){
       this.name=name;
       this.IC=IC;
       this.deposit=deposit;
   }

   public void deposit(double amount){
       if(amount>0){
           deposit+=amount;
           System.out.println(this.name+" sucessfully deposit $"+amount);
       }else{
           System.out.println("Deposit amount must be positive value!");
       }
   }

   public void withdraw(double amount){
       if(amount>0.0 && amount<deposit){
           this.deposit-=amount;
           System.out.println(this.name+" sucessfully withdraw $"+amount);
       }else if(amount>0.0 && amount>deposit){
           System.out.println("Insufficient amount to withdraw");
       }else{
           System.out.println("Amount must be postive value!");
       }

   }

   public double getDeposit(){
       return this.deposit;
   }

   public void display(){
       System.out.println("Current balance:$"+getDeposit());
   }
}
class Test{
    public static void main(String[] args) {
        BankAcc2 acc=new BankAcc2("Wei","030517",2900.00);
        acc.deposit(5000.00);
        acc.display();
        acc.withdraw(3500.00);
        acc.display();
    }
}