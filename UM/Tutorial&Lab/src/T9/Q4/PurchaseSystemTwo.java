package T9.Q4;

public class PurchaseSystemTwo {
    private String productCode;
    private double unitPrice;
    private int quantity;
    protected double totalPrice;

    public PurchaseSystemTwo(String productCode,double unitPrice,int quantity){
        this.productCode=productCode;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
        this.totalPrice=0.0;
    }

    public double computeTotalPrice(){
        totalPrice=unitPrice*quantity;
        return totalPrice;
    }

    public void displayTotalPrice(){
        System.out.println("Product code:"+productCode);
        System.out.println("Unit price:"+unitPrice);
        System.out.println("Quantity:"+quantity);
        System.out.println("Total price:$"+this.computeTotalPrice());
    }
}

class SugarPurchases extends PurchaseSystemTwo{
    private double sugarWeight;

    public SugarPurchases(String code,double unitPrice,int quantity,double weight){
        super(code,unitPrice,quantity);
        this.sugarWeight=weight;
    }
    @Override
    public double computeTotalPrice() {
       totalPrice=super.computeTotalPrice()*sugarWeight;
       return totalPrice;
    }

    public void displayTotalPrice(){
        System.out.println("Sugar weight:"+this.sugarWeight);
        super.displayTotalPrice();

    }
}

class Main{
    public static void main(String[] args) {
        PurchaseSystemTwo p1=new PurchaseSystemTwo("A1234",3.5,20);
        p1.displayTotalPrice();
        System.out.println();
        SugarPurchases p2=new SugarPurchases("A1235",3.5,20,3.5);
        p2.displayTotalPrice();
    }
}
