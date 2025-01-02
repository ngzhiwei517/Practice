package NTULAB3;

import java.util.Comparator;

public class sortBySeatID implements Comparator<PlaneSeat> {
    public int compare(PlaneSeat o1, PlaneSeat o2) {
        return Integer.compare(o1.getSeatID(),o2.getSeatID());
    }
}
