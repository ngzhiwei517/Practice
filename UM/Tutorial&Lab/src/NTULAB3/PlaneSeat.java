package NTULAB3;

public class PlaneSeat {
    private int seatID;
    private boolean assigned;
    private int customerNum;

    public PlaneSeat(int seatID){
        this.seatID=seatID;
    }

    public int getSeatID() {
        return seatID;
    }

    public boolean isOccupied(){
        return assigned;
    }

    public int getCustomerID() {
        return customerNum;
    }

    public void assign(int customerNum){
        assigned=true;
        this.customerNum=customerNum;
    }

    public void unassign(){
        assigned=false;
    }
}
