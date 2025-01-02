package NTUT6;

public class CheckingAccount {
    private double balance;
    private int totalInsufficientFee;
    private final int INSUFFICIENTFEE = 35;

    public CheckingAccount(double balance) {
        this.balance = balance;
        this.totalInsufficientFee = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void addInsufficientFundFee() {
        totalInsufficientFee += INSUFFICIENTFEE;
        System.out.println("Insufficient fund fee added. Total insufficient fund fee:$" + totalInsufficientFee);
    }

    public void noteReturnedCheck(Check theCheck){
        System.out.println("Check #"+theCheck.getCheckNum()+" has been returned due to insufficient funds.");
    }

    public void addDebitTransaction(Check checkNumber,double amount){
        balance-=amount;
        System.out.println("Debit transaction completed for check # "+checkNumber.getCheckNum()+" of amount "+amount);
    }

    public void storePhotoOfCheck(Check theCheck){
        System.out.println("Photo of check "+theCheck.getCheckNum()+" stored sucessfully");
    }
}
