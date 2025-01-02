package NTULAB3;

import java.util.Comparator;

public class sortByCustomerID implements Comparator<PlaneSeat> {
    @Override
    public int compare(PlaneSeat o1, PlaneSeat o2) {
        return Integer.compare(o1.getCustomerID(),o2.getCustomerID());
    }
}
