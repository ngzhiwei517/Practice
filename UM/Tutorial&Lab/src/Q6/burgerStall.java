package Q6;

public class burgerStall {
    private String ID;
    private int totalBurgerSold;
    static int totalFromAllStalls;

    public burgerStall(String ID){
        this.ID=ID;
        this.totalBurgerSold=0;
    }

    public void sold(int num){
        if(num>0){
            totalBurgerSold+=num;
            totalFromAllStalls+=num;
            System.out.println(this.ID+" stalls sold "+totalBurgerSold+" burger.");
        }else{
            System.out.println("Number of burger sold must be positive number");
        }
    }

    public int getTotalBurgerSold() {
        return totalBurgerSold;
    }

    public String getID() {
        return ID;
    }

    public void displayBurgerSold(){
        System.out.println("Burger stalls with ID:"+getID()+" have sold "+getTotalBurgerSold()+" burger.");
    }

    public static void displayTotalSold(){
        System.out.println("Total burger stalls of all stalls:"+totalFromAllStalls);
    }
}

class Test{
    public static void main(String[] args) {
        burgerStall s1=new burgerStall("2345");
        burgerStall s2=new burgerStall("2346");
        s1.sold(400);
        s2.sold(234);
        System.out.println();
        s1.displayBurgerSold();
        s2.displayBurgerSold();
        System.out.println();
        burgerStall.displayTotalSold();
    }
}
