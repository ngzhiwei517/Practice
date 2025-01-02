package NTUT6;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        Bank bank = new Bank(checkingAccount);
        Check check = new Check(600, "1234");
        double amountGet = bank.cashCheck(check);
        if (amountGet == -1) {
            System.out.println("Transaction failed due to insufficient fund");
        } else {
            System.out.println("Check cashed sucessfully, Amount $" + amountGet);
        }
        System.out.println();
        Check check1 = new Check(3000, "2345");
        double amountGets = bank.cashCheck(check1);
        if (amountGets == -1) {
            System.out.println("Transaction failed due to insufficient fund");
        } else {
            System.out.println("Check cashed sucessfully, Amount $" + amountGets);
        }
    }
}
