package T8;

public class Payment {
    //method overloading

    //cash payment
    public void pay(double amount){
        System.out.println("Cash payment: $"+amount+" received.");
    }

    public void pay(double amount,String chequeNum){
        System.out.println("Cheque payment: $"+amount+" received.");
        System.out.println("Cheque number:"+chequeNum);
    }

    public void pay(double amount,String name,String cardType,String date,String code){
        System.out.println("Card payment of $"+amount+" received.");
        System.out.println("Card holder name:"+name);
        System.out.println("Card type:"+cardType);
        System.out.println("Expiration date:"+date);
        System.out.println("Validation code:"+code);
    }

    /*public static void main(String[] args) {
        Payment payment=new Payment();
        payment.pay(300);
        System.out.println();
        payment.pay(15000,"C12344");
        System.out.println();
        payment.pay(2000,"Agnes","Visa","12/29","921323");
    }
*/
}
class PaymentDemo{
    public static void main(String[] args) {
        Payment p1=new Payment();
        p1.pay(300);
        System.out.println();
        p1.pay(15000,"C12344");
        System.out.println();
        p1.pay(2000,"Agnes","Visa","12/29","921323");
    }
}





