package NTUT6;

public class Bank {
    private CheckingAccount checkingAccount;

    public Bank(CheckingAccount checkingAccount1) {
        this.checkingAccount = checkingAccount1;
    }

    public double cashCheck(Check theCheck) {
        double amount = theCheck.getAmount(); //amount that we want to withdraw
        double balance = checkingAccount.getBalance();
        //balance of our bankAcc


        if (balance < amount) {
            checkingAccount.addInsufficientFundFee();
            checkingAccount.noteReturnedCheck(theCheck);
            returnCheck(theCheck);
            return -1;
        } else {
            String checkNum = theCheck.getCheckNum();
            checkingAccount.addDebitTransaction(theCheck, theCheck.getAmount());
            checkingAccount.storePhotoOfCheck(theCheck);
            return theCheck.getAmount();
        }
    }

    private void returnCheck(Check theCheck) {
        System.out.println("Returning check #" + theCheck.getCheckNum());
    }
}
